package org.xhome.ly.mapper;

import org.xhome.ly.bean.MedicalHistory;

public interface MedicalHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalHistory medicalHistory);

    int insertSelective(MedicalHistory medicalHistory);

    MedicalHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicalHistory medicalHistory);

    int updateByPrimaryKey(MedicalHistory medicalHistory);
}