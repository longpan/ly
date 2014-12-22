package org.xhome.ly.mapper;

import org.xhome.ly.bean.Case3;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface Case3Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Case3 record);

    int insertSelective(Case3 record);

    Case3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Case3 record);

    int updateByPrimaryKey(Case3 record);

    List<Case3> queryCase3s(QueryBase queryBase);

    long countCase3s(QueryBase queryBase);
}