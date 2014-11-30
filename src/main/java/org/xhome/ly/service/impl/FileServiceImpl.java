package org.xhome.ly.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xhome.ly.bean.File;
import org.xhome.ly.common.QueryBase;
import org.xhome.ly.common.Status;
import org.xhome.ly.mapper.FileMapper;
import org.xhome.ly.service.FileService;

/**
 * Created by fenjuly
 * Date: 14/11/29
 * Time: 下午8:52
 */
@Service
public class FileServiceImpl implements FileService {

    private Log logger = LogFactory.getLog(FileServiceImpl.class);

    @Autowired
    private FileMapper fileMapper;

    /**
     *
     * @param file
     * @return 0 成功  1 失败
     */
    @Override
    public int add(File file) {
        if (fileMapper.insert(file) > 0) {
            logger.debug("添加文件成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }


    /**
     *
     * @param file
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int update(File file) {
        File f = fileMapper.selectByPrimaryKey(file.getId());
        if (f == null) {
            logger.warn("尝试更新文件，但是文件不存在");
            return Status.NOT_EXISTS;
        }
        if (fileMapper.updateByPrimaryKey(file) > 0) {
            logger.debug("更新文件成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    /**
     *
     * @param file
     * @return 0 成功  1 失败  7 不存在
     */
    @Override
    public int delete(File file) {
        File f = fileMapper.selectByPrimaryKey(file.getId());
        if (f == null) {
            logger.warn("尝试删除文件，但是文件不存在");
            return Status.NOT_EXISTS;
        }
        if (fileMapper.deleteByPrimaryKey(file.getId()) > 0) {
            logger.debug("删除文件成功");
            return Status.SUCCESS;
        }
        return Status.ERROR;
    }

    /**
     *
     * @param id
     * @return file
     */
    @Override
    public File get(int id) {
        File file = fileMapper.selectByPrimaryKey(id);
        if (file == null) {
            logger.warn("文件 ID：" + " 不存在");
        } else {
            logger.debug("文件 ID：" + " 成功");
        }
        return file;
    }

    /**
     *
     * @param queryBase
     */
    @Override
    public void query(QueryBase queryBase) {
        if (logger.isDebugEnabled()) {
            logger.debug("根据参数 " + queryBase.getParameters() + "  查询文件");
        }
        queryBase.setResults(fileMapper.queryFiles(queryBase));
        queryBase.setTotalRow(fileMapper.countFiles(queryBase));
    }
}
