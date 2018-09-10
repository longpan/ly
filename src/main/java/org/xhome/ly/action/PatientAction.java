package org.xhome.ly.action;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Event;
import com.dianping.cat.message.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Patient;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.PatientService;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fenjuly
 * Date: 14/12/1
 * Time: 上午10:27
 */
@Controller
public class PatientAction {

    @Autowired
    private PatientService patientService;

    /**     添加病人
     *
     * @param request
     * @param patient   病人json格式数据
     * @return  0 成功  1 失败  6 已存在
     */
    ////@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/patient",method= RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody Patient patient ,@RequestParam(value = "birthday", required = false)String birthday) {
        int status;
        if(birthday != null){

            //System.out.println("TEST:::==="+birthday);
            Date date2 = new Date(Long.parseLong(birthday));
            patient.setBirthday(date2);

//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            try {
//
//                //Date date = sdf.parse(birthday);
//                patient.setBirthday(date2);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }

        }
        status = patientService.add(patient);
        if (status == Status.SUCCESS) {
            return new Response(status, patient.getId());
        }else if(status == Status.EXISTS){
            Patient patient_exists = patientService.getByIdCard(patient.getIdCard()) ;
            return new Response(status, patient_exists.getId());
        }
        return new Response(status);
    }

    /**     修改病人信息
     *
     * @param request
     * @param patient   病人的json格式数据
     * @return      0 成功  1 失败  7 不存在
     */

    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/patient",method= RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Patient patient) {
        int status;
        status = patientService.update(patient);
        return new Response(status);
    }
    /**
     *
     * @param request   按id删除病人
     * @param id    病人id
     * @return  status  0成功  7 不存在
     */
    @ResponseBody
    @RequestMapping(value = "/api/patient/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        Patient patient = new Patient();
        patient.setId(id);
        status = patientService.delete(patient);
        return new Response(status);
    }

    /**
     *
     * @param request  按id查询病人
     * @param id    病人id
     * @return  status  0成功  7 不存在
     */
    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/patient/{id}", method = RequestMethod.GET)
    public Object get(HttpServletRequest request, @PathVariable int id){
        int status;
        Patient patient = null ;

        Transaction transaction = Cat.newTransaction("URL", "lmjTest");
        Cat.logEvent("URL.Server", "127.0.0.1", Event.SUCCESS, "ip = 22222");
        Cat.logMetricForCount("lmjCount");
        Cat.logMetricForSum("lmjAmount", 10d);

        transaction.setStatus(Transaction.SUCCESS);


//        patient = patientService.get(id);
        if(patient == null){
            status = Status.NOT_EXISTS;
            return new Response(status);
        }else{
            status = Status.SUCCESS;
            return new Response(status,patient);

        }
    }

    /**         根据病人idCard查询病人
     *
     * @param request
     * @param idCard    idCard
     * @return      病人json格式数据
     */
    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/patient", method = RequestMethod.GET)
    public Object getPatientByIdCard(HttpServletRequest request, @RequestParam(value = "idCard", required = false)String idCard){
        if(idCard == null || idCard == ""){
            return new Response(Status.ERROR);
        }
        Patient patient = patientService.getByIdCard(idCard);
        if(patient == null){
            return new Response(Status.NOT_EXISTS);
        }else {
            return new Response(Status.SUCCESS, patient.getId());
        }
    }
}
