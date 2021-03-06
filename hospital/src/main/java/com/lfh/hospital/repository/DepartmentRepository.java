package com.lfh.hospital.repository;

import com.lfh.hospital.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
