package org.xhome.ly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.Options;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.OptionsMapper;
import org.xhome.ly.service.OptionsService;

/**
 * Created by onglchen
 * on 14-11-29.
 */
@Service
public class OptionsServiceImpl implements OptionsService {

    private Log logger = LogFactory.getLog(MedicalHistoryServiceImpl.class);

    @Autowired
    private OptionsMapper optionsMapper;

    /**
     *
     * @param options
     * @return  0 成功  1 失败
     */
    @Override
    public int add(Options options) {
        if (optionsMapper.insert(options) > 0) {
            logger.debug("添加选项:" + options.getId() + " 成功");
            return Status.SUCCESS;
        }
        logger.warn("添加选项:" + options.getId() + " 失败");
        return Status.ERROR;
    }


    /**
     *
     * @param options
     * @return  0 成功  1 失败  7 不存在
     */
    @Override
    public int update(Options options) {
        Options opt = optionsMapper.selectByPrimaryKey(options.getId());
        if(opt == null){
            logger.warn("尝试更新选项，但是选项不存在");
            return Status.NOT_EXISTS;
        }
        optionsMapper.updateByPrimaryKey(options);
        logger.debug("修改选项："  + options.getId() + " 成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param options
     * @return  0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(Options options) {
        Options medi = optionsMapper.selectByPrimaryKey(options.getId());
        if(medi == null){
            logger.warn("尝试删除选项，但是选项不存在");
            return Status.NOT_EXISTS;
        }
        optionsMapper.deleteByPrimaryKey(options.getId());
        logger.debug("删除选项："  + options.getId() + "成功");
        return Status.SUCCESS;
    }

    /**
     *
     * @param id
     * @return  options
     */
    @Override
    public Options get(int id) {
        Options options = optionsMapper.selectByPrimaryKey(id);
        if (options == null) {
            logger.warn("选项 ID:" + id + " 不存在");
        } else {
            logger.debug("获取选项ID:" + id + " 成功");
        }
        return options;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询选项");
        }
        queryBase.setResults(optionsMapper.queryOptions(queryBase));
        queryBase.setTotalRow(optionsMapper.countOptions(queryBase));
    }
}
