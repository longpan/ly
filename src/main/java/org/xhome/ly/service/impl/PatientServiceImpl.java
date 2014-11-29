package org.xhome.ly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.xhome.ly.bean.Patient;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.PatientMapper;
import org.xhome.ly.service.BaseService;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午9:14
 */
public class PatientServiceImpl implements BaseService<Patient> {

    private Log logger = LogFactory.getLog(PatientServiceImpl.class);

    @Autowired
    private PatientMapper patientMapper;

    /**
     *
     * @param patient
     * @return 0 成功  1 失败  6 已存在
     */
    @Override
    public int add(Patient patient) {
        if (patientMapper.isPatientExists(patient)) {
            logger.warn("病人已经存在了");
            return Status.EXISTS;
        }
        if (patientMapper.insert(patient) > 0) {
            logger.debug("添加病人成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    /**
     *
     * @param patient
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int update(Patient patient) {
        Patient p = patientMapper.selectByPrimaryKey(patient.getId());
        if (p == null) {
            logger.warn("尝试更新病人，但是病人不存在");
            return Status.NOT_EXISTS;
        }
        if (patientMapper.updateByPrimaryKeySelective(patient) > 0) {
            logger.debug("更新病人成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    /**
     *
     * @param patient
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(Patient patient) {
        Patient p = patientMapper.selectByPrimaryKey(patient.getId());
        if (p == null) {
            logger.warn("尝试删除病人，但是病人不存在");
            return Status.NOT_EXISTS;
        }
        if (patientMapper.deleteByPrimaryKey(patient.getId()) > 0) {
            logger.debug("删除病人成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    @Override
    public Patient get(int id) {
        Patient patient = patientMapper.selectByPrimaryKey(id);
        if (patient == null) {
            logger.warn("病人 ID: " + id + " 不存在");
        } else {
            logger.debug("病人 ID: " + id + " 成功");
        }
        return patient;
    }

    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病人");
        }
        queryBase.setResults(patientMapper.queryPatients(queryBase));
        queryBase.setTotalRow(patientMapper.countPatients(queryBase));
    }
}
