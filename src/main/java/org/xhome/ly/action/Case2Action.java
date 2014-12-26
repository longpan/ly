package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Case2;
import org.xhome.ly.bean.InterrogationRecord;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.Case2Service;
import org.xhome.ly.service.InterrogationRecordService;
import org.xhome.ly.utils.DateUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fenjuly
 * Date: 14/12/1
 * Time: 上午9:48
 */
@Controller
public class Case2Action {

    @Autowired
    private Case2Service case2Service;

    @Autowired
    private InterrogationRecordService interrogationRecordService;

    /**
     *
     * @param request
     * @param case2
     * @param doctorId
     * @param patientId
     * @return
     */
   // //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/case2",method= RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody Case2 case2, @RequestParam("doctorId")int doctorId
            , @RequestParam("patientId")int patientId) {
        int status;
        InterrogationRecord interrogationRecord = new InterrogationRecord();
        interrogationRecord.setCaseType(case2.getName());
        interrogationRecord.setDoctorId(doctorId);
        interrogationRecord.setPatientId(patientId);
        status = interrogationRecordService.add(interrogationRecord);
        if (status == Status.SUCCESS) {
            case2.setInterrogationRecordId(interrogationRecord.getId());
            status = case2Service.add(case2);
            return new Response(status, interrogationRecord.getId());
        }
        return new Response(status);
    }

    /**
     *
     * @param request
     * @param case2
     * @return
     */
    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/case2",method= RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Case2 case2) {
        int status;
        status = case2Service.update(case2);
        return new Response(status);
    }

    /**
     *
     * @param request
     * @param date  病例日期
     * @param patientSex   病人性别
     * @param doctorId  医生id
     * @param patientName   病人姓名
     * @param patientIdCard     病人身份证号
     * @param patientPhomeNumber    病人手机号
     * @return
     */
    ////@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/case2s",method= RequestMethod.GET)
    public Object getCase2s(HttpServletRequest request,
                            @RequestParam(value = "id", required = false)String id,
                            @RequestParam(value = "date", required = false)String date,
                            @RequestParam(value = "patientSex", required = false)String patientSex,
                            @RequestParam(value = "doctorId", required = false)String doctorId ,
                            @RequestParam(value = "patientName", required = false)String patientName,
                            @RequestParam(value = "patientIdCard", required = false)String patientIdCard,
                            @RequestParam(value = "patientPhomeNumber", required = false)String patientPhomeNumber) {
        QueryBase queryBase = new QueryBase();
        if(date != null && !date.equals("")) {
            String[] temp = date.split("/");
            int year = Integer.valueOf(temp[0]);
            int month = Integer.valueOf(temp[1]);
            int day = Integer.valueOf(temp[2]);
            queryBase.addParameter("start", DateUtil.getCertainStartTimeTimeStamp(year, month, day));
            queryBase.addParameter("end", DateUtil.getCertainEndTimeTimeStamp(year, month, day));
        }
        queryBase.addParameter("id", id);
        queryBase.addParameter("patientSex", patientSex);
        queryBase.addParameter("doctorId", doctorId);
        queryBase.addParameter("patientName",patientName);
        queryBase.addParameter("patientIdCard",patientIdCard);
        queryBase.addParameter("patientPhomeNumber",patientPhomeNumber);

        case2Service.query(queryBase);
        return new Response(Status.SUCCESS, queryBase.getResults());
    }
    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/case2/counts", method = RequestMethod.GET)
    public Object getCaselNumber(HttpServletRequest request, @RequestParam(value = "doctorId", required = false)String doctorId){
        QueryBase queryBase = new QueryBase();
        queryBase.addParameter("doctorId", doctorId);

        case2Service.countCase2s(queryBase);
        return new Response(Status.SUCCESS, queryBase.getTotalRow());
    }

    @ResponseBody
    @RequestMapping(value = "/api/case2/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        Case2 case2 = new Case2();
        case2.setId(id);
        status = case2Service.delete(case2);
        return new Response(status);
    }

    @ResponseBody
    @RequestMapping(value="/api/admin/case2s",method= RequestMethod.GET)
    public Object adminGetCase2s(HttpServletRequest request,
                                 @RequestParam(value = "id", required = false)String id,
                                 @RequestParam(value = "date", required = false)String date,
                                 @RequestParam(value = "patientSex", required = false)String patientSex,
                                 @RequestParam(value = "doctorId", required = false)String doctorId ,
                                 @RequestParam(value = "patientName", required = false)String patientName,
                                 @RequestParam(value = "patientIdCard", required = false)String patientIdCard,
                                 @RequestParam(value = "patientPhomeNumber", required = false)String patientPhomeNumber,
                                 @RequestParam(value = "doctorPhomeNumber", required = false)String doctorPhomeNumber,
                                 @RequestParam(value = "caseNumber", required = false)String caseNumber
    )
    {
        QueryBase queryBase = new QueryBase();
        if(date != null && !date.equals("")) {
            String[] temp = date.split("/");
            int year = Integer.valueOf(temp[0]);
            int month = Integer.valueOf(temp[1]);
            int day = Integer.valueOf(temp[2]);
            queryBase.addParameter("start", DateUtil.getCertainStartTimeTimeStamp(year, month, day));
            queryBase.addParameter("end", DateUtil.getCertainEndTimeTimeStamp(year, month, day));
        }
        queryBase.addParameter("id", id);
        queryBase.addParameter("patientSex", patientSex);
        queryBase.addParameter("doctorId", doctorId);
        queryBase.addParameter("patientName",patientName);
        queryBase.addParameter("patientIdCard",patientIdCard);
        queryBase.addParameter("patientPhomeNumber",patientPhomeNumber);
        queryBase.addParameter("doctorPhomeNumber", doctorPhomeNumber);
        queryBase.addParameter("caseNumber", caseNumber);

        case2Service.queryAdmin(queryBase);
        return new Response(Status.SUCCESS, queryBase.getResults());
    }
}
