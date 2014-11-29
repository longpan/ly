package org.xhome.ly.mapper;

import org.xhome.ly.bean.FollowUp;
import org.xhome.ly.bean.Options;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface FollowUpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowUp followUp);

    int insertSelective(FollowUp followUp);

    FollowUp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowUp followUp);

    int updateByPrimaryKey(FollowUp followUp);

    List<FollowUp> queryFollowUps(QueryBase queryBase);

    Long countFollowUps(QueryBase queryBase);
}