package org.xhome.ly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.InterrogationRecord;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.InterrogationRecordMapper;
import org.xhome.ly.service.InterrogationRecordService;

/**
 * Created by onglchen
 * on 14-11-29.
 */
@Service
public class InterrogationRecordsServiceImpl implements InterrogationRecordService {

    private Log logger = LogFactory.getLog(InterrogationRecordsServiceImpl.class);

    @Autowired
    private InterrogationRecordMapper interrogationRecordMapper;

    /**
     *
      * @param interrogationRecord
     * @return  0 成功  1 失败
     */
    @Override
    public int add(InterrogationRecord interrogationRecord) {
        if (interrogationRecordMapper.insert(interrogationRecord) > 0) {
            logger.debug("添加随访:" + interrogationRecord.getId() + "成功");
            return Status.SUCCESS;
        }
            logger.warn("添加随访:" + interrogationRecord.getId() + "失败");
            return Status.ERROR;
        }


    /**
     *
     * @param interrogationRecord
     * @return  0 成功  1 失败  7 不存在
     */
    @Override
    public int update(InterrogationRecord interrogationRecord) {
        InterrogationRecord inter=interrogationRecordMapper.selectByPrimaryKey(interrogationRecord.getId());
        if(inter==null){
            logger.warn("尝试更新随访，但是随访不存在");
            return Status.NOT_EXISTS;
        }
        interrogationRecordMapper.updateByPrimaryKey(interrogationRecord);
        logger.debug("修改随访："  + interrogationRecord.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param interrogationRecord
     * @return  0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(InterrogationRecord interrogationRecord) {
        InterrogationRecord inter=interrogationRecordMapper.selectByPrimaryKey(interrogationRecord.getId());
        if(inter==null){
            logger.warn("尝试删除随访，但是随访不存在");
            return Status.NOT_EXISTS;
        }
        interrogationRecordMapper.deleteByPrimaryKey(interrogationRecord.getId());
        logger.debug("删除随访："  + interrogationRecord.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param id
     * @return  interrogationrecord
     */
    @Override
    public InterrogationRecord get(int id) {
        InterrogationRecord interrogationRecord = interrogationRecordMapper.selectByPrimaryKey(id);
        if (interrogationRecord == null) {
            logger.warn("随访 ID:" + id + " 不存在");
        } else {
            logger.debug("获取随访ID:" + id + " 成功");
        }
        return interrogationRecord;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询随访");
        }
        queryBase.setResults(interrogationRecordMapper.queryInterrogationRecords(queryBase));
        queryBase.setTotalRow(interrogationRecordMapper.countInterrogationRecords(queryBase));
    }
}
