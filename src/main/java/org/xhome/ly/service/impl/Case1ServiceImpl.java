package org.xhome.ly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.Case1;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.Case1Mapper;
import org.xhome.ly.service.Case1Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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


    /**
     *
     * @param case1
     * @return 0 成功  1 失败
     */
    @Override
    public int add(Case1 case1) {
        if (case1Mapper.insert(case1) > 0) {
            logger.debug("添加问诊记录: " + case1.getName() + "成功");
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
            logger.warn("尝试添加问诊记录，但是问诊记录不存在");
            return Status.NOT_EXISTS;
        }
        case1Mapper.updateByPrimaryKeySelective(case1);
        logger.debug("修改问诊记录：" + case1.getName() + " Id: " + case1.getId() + "成功");
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
            logger.warn("尝试删除问诊记录，但是问诊记录不存在");
            return Status.NOT_EXISTS;
        }
        case1Mapper.deleteByPrimaryKey(case1.getId());
        logger.debug("删除问诊记录：" + case1.getName() + " Id: " + case1.getId() + "成功");
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
            logger.warn("问诊记录 ID:" + id + " 不存在");
        } else {
            logger.debug("问诊记录 ID:" + id + " 成功");
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
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询问诊记录");
        }
        queryBase.setResults(case1Mapper.queryCase1s(queryBase));
        queryBase.setTotalRow(case1Mapper.countCase1s(queryBase));
    }
}
