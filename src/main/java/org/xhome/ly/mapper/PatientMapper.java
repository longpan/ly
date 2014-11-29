package org.xhome.ly.mapper;

import org.xhome.ly.bean.Patient;

public interface PatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patient patient);

    int insertSelective(Patient patient);

    Patient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patient patient);

    int updateByPrimaryKey(Patient patient);
}