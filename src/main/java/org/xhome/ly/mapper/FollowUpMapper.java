package org.xhome.ly.mapper;

import org.xhome.ly.bean.FollowUp;

public interface FollowUpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowUp record);

    int insertSelective(FollowUp record);

    FollowUp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowUp record);

    int updateByPrimaryKey(FollowUp record);
}