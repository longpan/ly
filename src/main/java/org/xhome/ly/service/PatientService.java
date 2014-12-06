package org.xhome.ly.service;

import org.xhome.ly.bean.Patient;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午3:32
 */
public interface PatientService extends BaseService<Patient>{
    public  Patient getByIdCard(String idCard);

}
