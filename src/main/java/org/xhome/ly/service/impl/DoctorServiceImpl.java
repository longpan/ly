package org.xhome.ly.service.impl;

import com.alibaba.druid.util.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.Doctor;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.DoctorMapper;
import org.xhome.ly.service.DoctorService;
import org.xhome.ly.utils.EncryptionUtil;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午8:06
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    private Log logger = LogFactory.getLog(DoctorServiceImpl.class);

    @Autowired
    private DoctorMapper doctorMapper;

    /**
     *
     * @param doctor
     * @return 0 成功  1 失败  6 已存在
     */
    @Override
    public int add(Doctor doctor) {
        if (doctorMapper.isDoctorExists(doctor)){
            logger.warn("想要添加医生，但是医生已经存在 certificationNumber: " + doctor.getCertificationNumber());
            return Status.EXISTS;
        }
        String pwd = doctor.getPassword();
        String encryptPassword = EncryptionUtil.encrypt(pwd);
        doctor.setPassword(encryptPassword);
        if (doctorMapper.insert(doctor) > 0) {
            logger.debug("添加医生成功 certificationNumber: " + doctor.getCertificationNumber());
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }


    /**
     *
     * @param doctor
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int update(Doctor doctor) {
        Doctor d = doctorMapper.selectByPrimaryKey(doctor.getId());
        if (d == null) {
            logger.warn("尝试更新医生, 但是医生不存在");
            return Status.NOT_EXISTS;
        }
        if (doctor.getPassword() != null) {
            String pwd = doctor.getPassword();
            String encryptedPassword = EncryptionUtil.encrypt(pwd);
            if (!StringUtils.isEmpty(doctor.getPassword())) {
                if (d.getPassword().equals(pwd))
                    doctor.setPassword(null);
                else
                    doctor.setPassword(encryptedPassword);
            }
        }
        if (doctorMapper.updateByPrimaryKeySelective(doctor) > 0) {
            logger.debug("更新医生成功 certificationNumber: " + d.getCertificationNumber());
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    /**
     *
     * @param doctor
     * @return 0 成功 1 失败  7 不存在
     */
    @Override
    public int delete(Doctor doctor) {
        Doctor d = doctorMapper.selectByPrimaryKey(doctor.getId());
        if (d == null) {
            logger.warn("尝试删除医生，但是医生不存在");
            return Status.NOT_EXISTS;
        }
        if (doctorMapper.deleteByPrimaryKey(doctor.getId()) > 0 ) {
            logger.debug("删除医生成功 certificationNumber: " + doctor.getCertificationNumber());
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    /**
     *
     * @param id
     * @return doctor
     */
    @Override
    public Doctor get(int id) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(id);
        if (doctor == null) {
            logger.warn("医生 ID: " + id + " 不存在");
        } else {
            logger.debug("医生 ID: " + id + "成功");
        }
        return doctor;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询医生");
        }
        queryBase.setResults(doctorMapper.queryDoctors(queryBase));
        queryBase.setTotalRow(doctorMapper.countDoctors(queryBase));
    }

    /**
     * 
     * @param doctor
     * @return
     */
    @Override
    public int login(Doctor doctor) {
        Doctor d = doctorMapper.selectByUserId(doctor.getUserId());
        if (d == null) {
            return Status.NOT_EXISTS;
        }
        String encryptPassword = EncryptionUtil.encrypt(doctor.getPassword());
        if(!encryptPassword.equals(d.getPassword())){
            return Status.PASSWD_NOT_MATCH;
        }
        doctor.setId(d.getId());
        return Status.SUCCESS;
    }
}
