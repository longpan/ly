package org.xhome.ly.mapper;

import org.xhome.ly.bean.MedicalHistory;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface MedicalHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalHistory medicalHistory);

    int insertSelective(MedicalHistory medicalHistory);

    MedicalHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicalHistory medicalHistory);

    int updateByPrimaryKey(MedicalHistory medicalHistory);

    List<MedicalHistory> queryMedicalHistorys(QueryBase queryBase);

    Long countMedicalHistorys(QueryBase queryBase);
}