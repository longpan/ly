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

    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value="/api/patient",method= RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Patient patient) {
        int status;
        status = patientService.update(patient);
        return new Response(status);
    }

    @ResponseBody
    @RequestMapping(value = "/api/patient/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        Patient patient = new Patient();
        patient.setId(id);
        status = patientService.delete(patient);
        return new Response(status);
    }
}
