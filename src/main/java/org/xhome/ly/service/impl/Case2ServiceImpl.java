package org.xhome.ly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.*;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.Case2Mapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xhome.ly.service.Case2Service;
import org.xhome.ly.service.DoctorService;
import org.xhome.ly.service.InterrogationRecordService;
import org.xhome.ly.service.PatientService;

import java.util.List;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午3:37
 */
@Service
public class Case2ServiceImpl implements Case2Service {

    private Log logger = LogFactory.getLog(Case2ServiceImpl.class);

    @Autowired
    private Case2Mapper case2Mapper;

    @Autowired
    private InterrogationRecordService interrogationRecordService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;
    /**
     *
     * @param case2
     * @return 0 成功  1 失败
     */
    @Override
    public int add(Case2 case2) {
        if (case2Mapper.insert(case2) > 0) {
            logger.debug("添加病种1: " + case2.getName() + "成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }


    /**
     *
     * @param case2
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int update(Case2 case2) {
        Case2 c = case2Mapper.selectByPrimaryKey(case2.getId());
        if (c == null) {
            logger.warn("尝试添加病种1，但是病种1不存在");
            return Status.NOT_EXISTS;
        }
        case2Mapper.updateByPrimaryKeySelective(case2);
        logger.debug("修改病种1：" + case2.getName() + " Id: " + case2.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param case2
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(Case2 case2) {
        Case2 c = case2Mapper.selectByPrimaryKey(case2.getId());
        if (c == null) {
            logger.warn("尝试删除病种1，但是病种1不存在");
            return Status.NOT_EXISTS;
        }
        case2Mapper.deleteByPrimaryKey(case2.getId());
        logger.debug("删除病种1：" + case2.getName() + " Id: " + case2.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param id
     * @return case2
     */
    @Override
    public Case2 get(int id) {
        Case2 case2 = case2Mapper.selectByPrimaryKey(id);
        if (case2 == null) {
            logger.warn("病种1 ID:" + id + " 不存在");
        } else {
            logger.debug("病种1 ID:" + id + " 成功");
        }
        return case2;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1");
        }
        List<Case2> case2List = case2Mapper.queryCase2s(queryBase);
        InterrogationRecord interrogationRecord;
        Patient patient;

        for(Case2 case2 : case2List){                                                   // 查询与病例相关的病人信息。
            interrogationRecord = interrogationRecordService.get(case2.getInterrogationRecordId());
            patient = patientService.get(interrogationRecord.getPatientId());
            case2.setPatient(patient);
        }

        queryBase.setResults(case2List);
        queryBase.setTotalRow(case2Mapper.countCase2s(queryBase));
    }


    @Override
    public void queryAdmin(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1");
        }
        List<Case2> case2List = case2Mapper.queryCase2s(queryBase);
        InterrogationRecord interrogationRecord;
        Patient patient;
        Doctor doctor;

        for(Case2 case2 : case2List){                                                   // 查询与病例相关的病人信息。
            interrogationRecord = interrogationRecordService.get(case2.getInterrogationRecordId());
            patient = patientService.get(interrogationRecord.getPatientId());
            doctor =  doctorService.get(interrogationRecord.getDoctorId());
            case2.setPatient(patient);
            case2.setDoctor(doctor);

        }

        queryBase.setResults(case2List);
        queryBase.setTotalRow(case2Mapper.countCase2s(queryBase));
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void countCase2s(QueryBase queryBase){
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1数量");
        }
        queryBase.setTotalRow(case2Mapper.countCase2s(queryBase));
    }

}
