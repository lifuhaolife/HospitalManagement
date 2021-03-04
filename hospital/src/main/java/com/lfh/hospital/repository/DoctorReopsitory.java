package com.lfh.hospital.repository;

import com.lfh.hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.Doc;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
@Repository
public interface DoctorReopsitory extends JpaRepository<Doctor,Integer> {
}
