package org.xhome.ly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.*;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.Case3Mapper;
import org.xhome.ly.service.Case3Service;
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
public class Case3ServiceImpl implements Case3Service {

    private Log logger = LogFactory.getLog(Case3ServiceImpl.class);

    @Autowired
    private Case3Mapper case3Mapper;

    @Autowired
    private InterrogationRecordService interrogationRecordService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;
    /**
     *
     * @param case3
     * @return 0 成功  1 失败
     */
    @Override
    public int add(Case3 case3) {
        if (case3Mapper.insert(case3) > 0) {
            logger.debug("添加病种3: " + case3.getName() + "成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }


    /**
     *
     * @param case3
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int update(Case3 case3) {
        Case3 c = case3Mapper.selectByPrimaryKey(case3.getId());
        if (c == null) {
            logger.warn("尝试添加病种3，但是病种3不存在");
            return Status.NOT_EXISTS;
        }
        case3Mapper.updateByPrimaryKeySelective(case3);
        logger.debug("修改病种3：" + case3.getName() + " Id: " + case3.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param case3
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(Case3 case3) {
        Case3 c = case3Mapper.selectByPrimaryKey(case3.getId());
        if (c == null) {
            logger.warn("尝试删除病种3，但是病种3不存在");
            return Status.NOT_EXISTS;
        }
        case3Mapper.deleteByPrimaryKey(case3.getId());
        logger.debug("删除病种3：" + case3.getName() + " Id: " + case3.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param id
     * @return case3
     */
    @Override
    public Case3 get(int id) {
        Case3 case3 = case3Mapper.selectByPrimaryKey(id);
        if (case3 == null) {
            logger.warn("病种3 ID:" + id + " 不存在");
        } else {
            logger.debug("病种3 ID:" + id + " 成功");
        }
        return case3;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种3");
        }
        List<Case3> case3List = case3Mapper.queryCase3s(queryBase);
        InterrogationRecord interrogationRecord;
        Patient patient;

        for(Case3 case3 : case3List){                                                   // 查询与病例相关的病人信息。
            interrogationRecord = interrogationRecordService.get(case3.getInterrogationRecordId());
            patient = patientService.get(interrogationRecord.getPatientId());
            case3.setPatient(patient);
        }

        queryBase.setResults(case3List);
        queryBase.setTotalRow(case3Mapper.countCase3s(queryBase));
    }

    @Override
    public void queryAdmin(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种1");
        }
        List<Case3> case3List = case3Mapper.queryCase3s(queryBase);
        InterrogationRecord interrogationRecord;
        Patient patient;
        Doctor doctor;

        for(Case3 case3 : case3List){                                                   // 查询与病例相关的病人信息。
            interrogationRecord = interrogationRecordService.get(case3.getInterrogationRecordId());
            patient = patientService.get(interrogationRecord.getPatientId());
            doctor =  doctorService.get(interrogationRecord.getDoctorId());
            case3.setPatient(patient);
            case3.setDoctor(doctor);

        }

        queryBase.setResults(case3List);
        queryBase.setTotalRow(case3Mapper.countCase3s(queryBase));
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void countCase3s(QueryBase queryBase){
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病种3数量");
        }
        queryBase.setTotalRow(case3Mapper.countCase3s(queryBase));
    }

}
