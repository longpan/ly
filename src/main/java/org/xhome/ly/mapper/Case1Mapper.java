package org.xhome.ly.mapper;

import org.xhome.ly.bean.Case1;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface Case1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Case1 case1);

    int insertSelective(Case1 case1);

    Case1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Case1 case1);

    int updateByPrimaryKey(Case1 case1);

    List<Case1> queryCase1s(QueryBase queryBase);

    long countCase1s(QueryBase queryBase);

}