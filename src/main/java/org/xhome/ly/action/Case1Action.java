package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Case1;
import org.xhome.ly.bean.InterrogationRecord;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.Case1Service;
import org.xhome.ly.service.InterrogationRecordService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by fenjuly
 * Date: 14/12/1
 * Time: 上午9:48
 */
@Controller
public class Case1Action {

    @Autowired
    private Case1Service case1Service;

    @Autowired
    private InterrogationRecordService interrogationRecordService;

    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/case1",method= RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody Case1 case1, @RequestParam("doctorId")int doctorId
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

    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/case1",method= RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Case1 case1) {
        int status;
        status = case1Service.update(case1);
        return new Response(status);
    }

}
