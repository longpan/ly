package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Doctor;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.DoctorService;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by fenjuly
 * Date: 14/11/30
 * Time: 下午9:29
 */
@Controller
public class DoctorAction {

    @Autowired
    private DoctorService doctorService;

    @ResponseBody
    @RequestMapping(value="/api/doctor",method= RequestMethod.POST)
    public Object registDoctor(@RequestBody Doctor doctor) {
        int status;
        status = doctorService.add(doctor);
        if (status == Status.SUCCESS) {
            return new Response(status, doctor.getId());
        }
        return new Response(status);
    }

    @ResponseBody
    @RequestMapping(value="/api/doctor/authentication",method=RequestMethod.POST)
    public Object loginDoctor(@RequestBody Doctor doctor) {
        int status;
        status = doctorService.login(doctor);
        return new Response(status, doctor.getId());
    }

    @ResponseBody
    @RequestMapping(value = "/api/doctor/{id}", method = RequestMethod.GET)
    public Object get(HttpServletRequest request, @PathVariable int id){
        int status;
        Doctor doctor;
        doctor = doctorService.get(id);
        if(doctor == null){
            status = Status.NOT_EXISTS;
            return new Response(status);
        }else{
            status = Status.SUCCESS;
            return new Response(status,doctor);
        }

    }

    @ResponseBody
    @RequestMapping(value = "/api/doctor/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        Doctor doctor = new Doctor();
        doctor.setId(id);
        status = doctorService.delete(doctor);
        return new Response(status);
    }

    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/doctor", method = RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Doctor doctor) {
        int status;
        status = doctorService.update(doctor);
        return new Response(status);
    }

}
