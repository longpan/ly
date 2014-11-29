package org.xhome.ly.mapper;

import org.xhome.ly.bean.Case1;

public interface Case1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Case1 record);

    int insertSelective(Case1 record);

    Case1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Case1 record);

    int updateByPrimaryKey(Case1 record);
}