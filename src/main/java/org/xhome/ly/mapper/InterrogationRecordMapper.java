package org.xhome.ly.mapper;

import org.xhome.ly.bean.InterrogationRecord;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface InterrogationRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InterrogationRecord interrogationRecord);

    int insertSelective(InterrogationRecord interrogationRecord);

    InterrogationRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InterrogationRecord interrogationRecord);

    int updateByPrimaryKey(InterrogationRecord interrogationRecord);

    List<InterrogationRecord> queryInterrogationRecords(QueryBase queryBase);

    Long countInterrogationRecords(QueryBase queryBase);
}