package org.xhome.ly.mapper;

import org.xhome.ly.bean.Case1;

public interface Case1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Case1 case1);

    int insertSelective(Case1 case1);

    Case1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Case1 case1);

    int updateByPrimaryKey(Case1 case1);
}