package org.xhome.ly.mapper;

import org.xhome.ly.bean.File;

public interface FileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(File file);

    int insertSelective(File file);

    File selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(File file);

    int updateByPrimaryKey(File file);
}