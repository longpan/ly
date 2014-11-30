package org.xhome.ly.service;


import org.xhome.ly.bean.Doctor;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午3:26
 */
public interface DoctorService extends BaseService<Doctor>{

    public int login(Doctor doctor);
}
