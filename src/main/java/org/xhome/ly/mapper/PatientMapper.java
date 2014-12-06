package org.xhome.ly.mapper;

import org.xhome.ly.bean.Patient;
import org.xhome.ly.common.QueryBase;

import java.util.List;

public interface PatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patient patient);

    int insertSelective(Patient patient);

    Patient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patient patient);

    int updateByPrimaryKey(Patient patient);

    List<Patient> queryPatients(QueryBase queryBase);

    long countPatients(QueryBase queryBase);

    boolean isPatientExists(Patient patient);

    Patient selectByIdCard(String idCard);
}