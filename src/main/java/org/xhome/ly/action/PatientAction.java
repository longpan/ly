package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Patient;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.PatientService;

import javax.servlet.http.HttpServletRequest;

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
    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/patient",method= RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody Patient patient) {
        int status;
        status = patientService.add(patient);
        if (status == Status.SUCCESS) {
            return new Response(status, patient.getId());
        }
        return new Response(status);
    }

    /**     修改病人信息
     *
     * @param request
     * @param patient   病人的json格式数据
     * @return      0 成功  1 失败  7 不存在
     */

    @DoctorLoginAuthorized
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
    @ResponseBody
    @RequestMapping(value = "/api/patient/{id}", method = RequestMethod.GET)
    public Object get(HttpServletRequest request, @PathVariable int id){
        int status;
        Patient patient ;
        patient = patientService.get(id);
        if(patient == null){
            status = Status.NOT_EXISTS;
            return new Response(status);
        }else{
            status = Status.SUCCESS;
            return new Response(status,patient);

        }
    }
}
