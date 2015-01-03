package org.xhome.ly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.*;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.Case1Mapper;
import org.xhome.ly.mapper.Case2Mapper;
import org.xhome.ly.mapper.Case3Mapper;
import org.xhome.ly.service.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午3:37
 */
@Service
public class Case1ServiceImpl implements Case1Service{

    private Log logger = LogFactory.getLog(Case1ServiceImpl.class);

    @Autowired
    private Case1Mapper case1Mapper;
    @Autowired
    private Case2Mapper case2Mapper;
    @Autowired
    private Case3Mapper case3Mapper;

    @Autowired
    private InterrogationRecordService interrogationRecordService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private FollowUpService followUpService;
    /**
     *
     * @param case1
     * @return 0 成功  1 失败
     */
    @Override
    public int add(Case1 case1) {
        if (case1Mapper.insert(case1) > 0) {
            logger.debug("添加病种1: " + case1.getName() + "成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }


    /**
     *
     * @param case1
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int update(Case1 case1) {
        Case1 c = case1Mapper.selectByPrimaryKey(case1.getId());
        if (c == null) {
            logger.warn("尝试添加病种1，但是病种1不存在");
            return Status.NOT_EXISTS;
        }
        case1Mapper.updateByPrimaryKeySelective(case1);
        logger.debug("修改病种1：" + case1.getName() + " Id: " + case1.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param case1
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(Case1 case1) {
        Case1 c = case1Mapper.selectByPrimaryKey(case1.getId());
        if (c == null) {
            logger.warn("尝试删除病种1，但是病种1不存在");
            return Status.NOT_EXISTS;
        }
        case1Mapper.deleteByPrimaryKey(case1.getId());
        logger.debug("删除病种1：" + case1.getName() + " Id: " + case1.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param id
     * @return case1
     */
    @Override
    public Case1 get(int id) {
        Case1 case1 = case1Mapper.selectByPrimaryKey(id);
        if (case1 == null) {
            logger.warn("病种1 ID:" + id + " 不存在");
        } else {
            logger.debug("病种1 ID:" + id + " 成功");
        }
        return case1;
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
        List<Case1> case1List = case1Mapper.queryCase1s(queryBase);
        InterrogationRecord interrogationRecord;
        Patient patient;

        for(Case1 case1 : case1List){                                                   // 查询与病例相关的病人信息。
            interrogationRecord = interrogationRecordService.get(case1.getInterrogationRecordId());
            patient = patientService.get(interrogationRecord.getPatientId());
            case1.setPatient(patient);
        }

        queryBase.setResults(case1List);
        queryBase.setTotalRow(case1Mapper.countCase1s(queryBase));
    }

    @Override
    public void queryAdmin(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1");
        }
        List<Case1> case1List = case1Mapper.queryCase1s(queryBase);
        InterrogationRecord interrogationRecord;
        Patient patient;
        Doctor doctor;
        List<FollowUp> followUps;


        for(Case1 case1 : case1List){                                                   // 查询与病例相关的病人信息。
            interrogationRecord = interrogationRecordService.get(case1.getInterrogationRecordId());
            patient = patientService.get(interrogationRecord.getPatientId());
            doctor =  doctorService.get(interrogationRecord.getDoctorId());
            followUps = followUpService.getByInterrogationRecordId(interrogationRecord.getId());

            case1.setPatient(patient);
            case1.setDoctor(doctor);
            case1.setFollowUps(followUps);

        }

        queryBase.setResults(case1List);
        queryBase.setTotalRow(case1Mapper.countCase1s(queryBase));
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void countCasels(QueryBase queryBase){
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1数量");
        }
        queryBase.setTotalRow(case1Mapper.countCase1s(queryBase));
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void countAllCases(QueryBase queryBase){
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1数量");
        }
        long counts = 0;
        counts = case1Mapper.countCase1s(queryBase) + case2Mapper.countCase2s(queryBase) + case3Mapper.countCase3s(queryBase);
        queryBase.setTotalRow(counts);
    }

}
