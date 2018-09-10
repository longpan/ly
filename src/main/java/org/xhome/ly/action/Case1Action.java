package org.xhome.ly.action;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Case1;
import org.xhome.ly.bean.InterrogationRecord;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.Case1Service;
import org.xhome.ly.service.InterrogationRecordService;
import org.xhome.ly.utils.DateUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fenjuly
 * Date: 14/12/1
 * Time: 上午9:48
 */
@Controller
//@Api(tags="账户信息控制类")
@Api(value = "用户信息", description = "用户信息")
public class Case1Action {


    @Autowired
    private Case1Service case1Service;

    @Autowired
    private InterrogationRecordService interrogationRecordService;

    /**
     *
     * @param request
     * @param case1
     * @param doctorId
     * @param patientId
     * @return
     */
   // ////@DoctorLoginAuthorized
    @ApiOperation(value = "获取盈豆数量", notes = "获取盈豆数量", httpMethod = "POST")
    @ResponseBody
    @RequestMapping(value="/api/case1",method= RequestMethod.POST)
    public Object add(HttpServletRequest request,  Case1 case1, @RequestParam("doctorId")int doctorId
            , @RequestParam("patientId")int patientId) {
        int status;
        InterrogationRecord interrogationRecord = new InterrogationRecord();
        interrogationRecord.setCaseType(case1.getName());
        interrogationRecord.setDoctorId(doctorId);
        interrogationRecord.setPatientId(patientId);
        status = interrogationRecordService.add(interrogationRecord);
        if (status == Status.SUCCESS) {
            case1.setInterrogationRecordId(interrogationRecord.getId());
            status = case1Service.add(case1);
            return new Response(status, interrogationRecord.getId());
        }
        return new Response(status);
    }

    /**
     *
     * @param request
     * @param case1
     * @return
     */
    ////@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/case1",method= RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Case1 case1) {
        int status;
        status = case1Service.update(case1);
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
    @RequestMapping(value="/api/case1s",method= RequestMethod.GET)
    public Object getCase1s(HttpServletRequest request,
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

        case1Service.query(queryBase);
        return new Response(Status.SUCCESS, queryBase.getResults());
    }


    @ResponseBody
    @RequestMapping(value="/api/admin/case1s",method= RequestMethod.GET)
    public Object adminGetCase1s(HttpServletRequest request,
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

        case1Service.queryAdmin(queryBase);
        return new Response(Status.SUCCESS, queryBase.getResults());
    }

    @ResponseBody
    @RequestMapping(value = "/api/admin/cases", method = RequestMethod.GET)
    public Object getCaseByCaseNumber(HttpServletRequest request, @RequestParam(value = "caseNumber", required = false)String caseNumber) {
        QueryBase queryBase = new QueryBase();
        Object object;
        int status;
        queryBase.addParameter("caseNumber", caseNumber);

        status = case1Service.getCasesByCaseNumber(queryBase);
        if (status == Status.SUCCESS) {

            return new Response(status,queryBase.getResults());
        }
        return new Response(status);
    }

    ////@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/case1/counts", method = RequestMethod.GET)
    public Object getCaselNumber(HttpServletRequest request, @RequestParam(value = "doctorId", required = false)String doctorId){
        QueryBase queryBase = new QueryBase();
        queryBase.addParameter("doctorId", doctorId);

        case1Service.countCasels(queryBase);
        return new Response(Status.SUCCESS, queryBase.getTotalRow());
    }



    @ResponseBody
    @RequestMapping(value = "/api/cases/counts", method = RequestMethod.GET)
    public Object getAllCasesNumber(HttpServletRequest request, @RequestParam(value = "doctorId", required = false)String doctorId){
        QueryBase queryBase = new QueryBase();
        queryBase.addParameter("doctorId", doctorId);

        case1Service.countAllCases(queryBase);
        return new Response(Status.SUCCESS, queryBase.getTotalRow());
    }



    @ResponseBody
    @RequestMapping(value = "/api/case1/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        Case1 case1 = new Case1();
        case1.setId(id);
        status = case1Service.delete(case1);
        return new Response(status);
    }

}
