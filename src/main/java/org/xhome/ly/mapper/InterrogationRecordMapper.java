package org.xhome.ly.mapper;

import org.xhome.ly.bean.InterrogationRecord;

public interface InterrogationRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InterrogationRecord record);

    int insertSelective(InterrogationRecord record);

    InterrogationRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InterrogationRecord record);

    int updateByPrimaryKey(InterrogationRecord record);
}