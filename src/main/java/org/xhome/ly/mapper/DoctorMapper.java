package org.xhome.ly.mapper;

import org.xhome.ly.bean.Doctor;
import org.xhome.ly.common.QueryBase;

import javax.print.Doc;
import java.util.List;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Doctor doctor);

    int insertSelective(Doctor doctor);

    Doctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doctor doctor);

    int updateByPrimaryKey(Doctor doctor);

    List<Doctor> queryDoctors(QueryBase queryBase);

    long countDoctors(QueryBase queryBase);

    boolean isDoctorExists(Doctor doctor);

    Doctor selectByCertificationNumber(String certificationNumber);
}