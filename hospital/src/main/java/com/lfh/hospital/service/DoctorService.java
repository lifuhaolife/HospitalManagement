package com.lfh.hospital.service;

import com.lfh.hospital.entity.Department;
import com.lfh.hospital.entity.Doctor;

import java.util.List;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
public interface DoctorService {
    /**
     * 添加医生信息
     * @param doctor
     */
    void addDoctor(Doctor doctor);

    /**
     * 根据医生id进行删除操作
     * @param id
     */
    void deleteDoctor(Integer id);

    /**
     * 通过id进行对医生其他信息他的修改
     * @param doctor
     */
    void updateDoctorById(Doctor doctor);

    /**
     * 查询所有医生的信息
     */
    List<Doctor> findAllDoctor();

    /**
     * 根据科室查询医生的信息
     * @param department
     */
    List<Doctor> findDoctorByDepartmentId(Department department);
}
