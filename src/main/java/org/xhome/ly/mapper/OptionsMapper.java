package org.xhome.ly.mapper;

import org.xhome.ly.bean.Options;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface OptionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Options options);

    int insertSelective(Options options);

    Options selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Options options);

    int updateByPrimaryKey(Options options);

    List<Options> queryOptions(QueryBase queryBase);

    Long countOptions(QueryBase queryBase);
}