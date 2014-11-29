package org.xhome.ly.mapper;

import org.xhome.ly.bean.FollowUp;

public interface FollowUpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowUp followUp);

    int insertSelective(FollowUp followUp);

    FollowUp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowUp followUp);

    int updateByPrimaryKey(FollowUp followUp);
}