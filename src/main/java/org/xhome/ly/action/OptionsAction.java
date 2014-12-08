package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.Options;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Response;
import org.xhome.ly.common.Status;
import org.xhome.ly.service.OptionsService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by onglchen
 * on 14-12-1.
 */
@Controller
public class OptionsAction {

    @Autowired
    private OptionsService optionsService;

    /**
     *
      * @param request
     * @param options 选项的json格式
     * @return  返回状态 0 成功  1 失败
     */
    @ResponseBody
    @RequestMapping(value = "/api/options", method = RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody Options options){
        int status;
        status = optionsService.add(options);
        if(status == Status.SUCCESS){
            return new Response(status,options.getId());
        }
        return new Response(status);
    }

    /**
     *
     * @param request
     * @param options   选项的json格式
     * @return  返回状态 0 成功  1 失败  7 不存在
     */
    @ResponseBody
    @RequestMapping(value = "/api/options", method = RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody Options options){
        int status;
        status = optionsService.update(options);
        return new Response(status);
    }

    /**
     *
     * @param request
     * @param id
     * @return  返回状态 0 成功  1 失败  7 不存在
     */
    @ResponseBody
    @RequestMapping(value = "/api/options/{id}", method = RequestMethod.DELETE)
    public Object delete(HttpServletRequest request, @PathVariable int id){
        int status;
        Options options = new Options();
        options.setId(id);
        status = optionsService.delete(options);
        return new Response(status);
    }


    //@DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/options", method = RequestMethod.GET)
    public Object getPatientByIdCard(HttpServletRequest request, @RequestParam(value = "number", required = false)String number){
        if(number == null || number == ""){
            return new Response(Status.ERROR);
        }
        QueryBase queryBase = new QueryBase();
        queryBase.addParameter("number", number);
        optionsService.query(queryBase);

            return new Response(Status.SUCCESS, queryBase.getResults());

    }
}
