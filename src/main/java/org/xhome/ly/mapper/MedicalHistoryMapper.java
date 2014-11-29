package org.xhome.ly.mapper;

import org.xhome.ly.bean.MedicalHistory;

public interface MedicalHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalHistory record);

    int insertSelective(MedicalHistory record);

    MedicalHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicalHistory record);

    int updateByPrimaryKey(MedicalHistory record);
}