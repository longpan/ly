package org.xhome.ly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.MedicalHistory;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.MedicalHistoryMapper;
import org.xhome.ly.service.MedicalHistoryService;

/**
 * Created by onglchen
 * on 14-11-29.
 */
@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService {
    private Log logger = LogFactory.getLog(MedicalHistoryServiceImpl.class);

    @Autowired
    private MedicalHistoryMapper medicalHistoryMapper;

    /**
     *
     * @param medicalHistory
     * @return  0 成功  1 失败
     */
    @Override
    public int add(MedicalHistory medicalHistory) {
        if (medicalHistoryMapper.insert(medicalHistory) > 0) {
            logger.debug("添加病史:" + medicalHistory.getId() + " 成功");
            return Status.SUCCESS;
        }
        logger.warn("添加病史:" + medicalHistory.getId() + " 失败");
        return Status.ERROR;
    }


    /**
     *
     * @param medicalHistory
     * @return  0 成功  1 失败  7 不存在
     */
    @Override
    public int update(MedicalHistory medicalHistory) {
        MedicalHistory inter=medicalHistoryMapper.selectByPrimaryKey(medicalHistory.getId());
        if(inter == null){
            logger.warn("尝试更新病史，但是病史不存在");
            return Status.NOT_EXISTS;
        }
        medicalHistoryMapper.updateByPrimaryKeySelective(medicalHistory);
        logger.debug("修改病史："  + medicalHistory.getId() + " 成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param medicalHistory
     * @return  0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(MedicalHistory medicalHistory) {
        MedicalHistory medi = medicalHistoryMapper.selectByPrimaryKey(medicalHistory.getId());
        if(medi == null){
            logger.warn("尝试删除病史，但是病史不存在");
            return Status.NOT_EXISTS;
        }
        medicalHistoryMapper.deleteByPrimaryKey(medicalHistory.getId());
        logger.debug("删除病史："  + medicalHistory.getId() + " 成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param id
     * @return  medicalHistory
     */
    @Override
    public MedicalHistory get(int id) {
        MedicalHistory medicalHistory = medicalHistoryMapper.selectByPrimaryKey(id);
        if (medicalHistory == null) {
            logger.warn("病史 ID:" + id + " 不存在");
        } else {
            logger.debug("获取病史ID:" + id + " 成功");
        }
        return medicalHistory;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询病史");
        }
        queryBase.setResults(medicalHistoryMapper.queryMedicalHistorys(queryBase));
        queryBase.setTotalRow(medicalHistoryMapper.countMedicalHistorys(queryBase));
    }
}
