package org.xhome.ly.mapper;

import org.xhome.ly.bean.Case2;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface Case2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Case2 record);

    int insertSelective(Case2 record);

    Case2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Case2 record);

    int updateByPrimaryKey(Case2 record);

    List<Case2> queryCase2s(QueryBase queryBase);

    long countCase2s(QueryBase queryBase);
}