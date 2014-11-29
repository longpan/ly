package org.xhome.ly.mapper;

import org.xhome.ly.bean.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Doctor doctor);

    int insertSelective(Doctor doctor);

    Doctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doctor doctor);

    int updateByPrimaryKey(Doctor doctor);
}