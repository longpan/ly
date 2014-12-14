package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.MedicalHistory;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.MedicalHistoryService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by onglchen
 * on 14-12-1.
 */
@Controller
public class MedicalHistoryAction {

    @Autowired
    private MedicalHistoryService medicalHistoryService;

    /**
     *
     * @param request
     * @param medicalHistory
     * @return
     */
    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/patient/{id}/medicalhistory", method = RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody MedicalHistory medicalHistory, @PathVariable int id){
        int stauts;
        medicalHistory.setPatientId(id);
        stauts=medicalHistoryService.add(medicalHistory);
        if(stauts==Status.SUCCESS){
            return new Response(stauts,medicalHistory.getId());
        }
        return new Response(stauts);
    }

    /**
     *
     * @param request
     * @param medicalHistory
     * @return
     */
    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/medicalhistory", method = RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody MedicalHistory medicalHistory){
        int status;
        status = medicalHistoryService.update(medicalHistory);
        return new Response(status);
    }

    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/patient/{id}/medicalhistory", method = RequestMethod.GET)
    public Object getMedicalHistorys(HttpServletRequest request, @PathVariable int id){
        QueryBase queryBase = new QueryBase();
        queryBase.addParameter("patientId",id);
        medicalHistoryService.query(queryBase);
        return new Response(Status.SUCCESS, queryBase.getResults());
    }

    @ResponseBody
    @RequestMapping(value = "/api/medicalhistory/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        MedicalHistory medicalHistory = new MedicalHistory();
        medicalHistory.setId(id);
        status = medicalHistoryService.delete(medicalHistory);
        return new Response(status);
    }
}
