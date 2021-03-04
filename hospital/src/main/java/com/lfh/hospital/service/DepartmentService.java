package com.lfh.hospital.service;

import com.lfh.hospital.entity.Department;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
public interface DepartmentService {

    /**
     * 增加一个部门信息
     * @param department
     */
    void addDepartment(Department department);

    /**
     * 删除一个部门
     * @param department
     */
    void deleteDepartment(Department department);

}
