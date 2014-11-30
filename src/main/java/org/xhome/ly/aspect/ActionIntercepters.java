package org.xhome.ly.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.xhome.ly.bean.Doctor;
import org.xhome.ly.common.Response;
import org.xhome.ly.mapper.DoctorMapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by fenjuly
 * Date: 14/11/30
 * Time: 下午9:07
 */
public class ActionIntercepters {

    @Resource(name="invalidOperationResponse")
    Response invalidResponse;

    @Autowired
    DoctorMapper doctorMapper;

    /**
     * 验证是否已经登陆
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("@annotation(org.xhome.ly.annotation.DoctorLoginAuthorized)")
    public Object checkDoctorLoginAuthorized(ProceedingJoinPoint point) throws Throwable{
        try {
            HttpServletRequest request = (HttpServletRequest) point.getArgs()[0];
            String authentication = request.getHeader("Authentication");
            String[] temp = authentication.split("%");
            String certificationNumber = temp[0];
            Doctor doctor = doctorMapper.selectByCertificationNumber(certificationNumber);
            if(null != doctor && doctor.getPassword().equals(temp[1])){
                return point.proceed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invalidResponse;
    }
}
