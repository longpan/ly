package org.xhome.ly.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xhome.ly.annotation.DoctorLoginAuthorized;
import org.xhome.ly.bean.FollowUp;
import org.xhome.ly.common.Response;
import org.xhome.ly.service.FollowUpService;
import org.xhome.ly.service.InterrogationRecordService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by onglchen
 * on 14-12-1.
 */
@Controller
public class FollowUpAction {

    @Autowired
    private FollowUpService followUpService;


    /**
     *
     * @param request
     * @param followUp  随访的json格式数据
     * @param interrogationRecordId    问诊记录id
     * @return  返回状态 0 成功  1 失败
     */
    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/followup", method = RequestMethod.POST)
    public Object add(HttpServletRequest request, @RequestBody FollowUp followUp, @RequestParam("interrogationRecordId")int interrogationRecordId){
        int status;
        followUp.setInterrogationRecordId(interrogationRecordId);
        status = followUpService.add(followUp);

        return new Response(status);
    }

    /**
     *
     * @param request
     * @param followUp  随访的json格式数据
     * @return  返回状态 0 成功  1 失败  7 不存在
     */
    @DoctorLoginAuthorized
    @ResponseBody
    @RequestMapping(value = "/api/followup", method = RequestMethod.PATCH)
    public Object update(HttpServletRequest request, @RequestBody FollowUp followUp ){
        int status;
        status = followUpService.update(followUp);

        return new Response(status);
    }

}
