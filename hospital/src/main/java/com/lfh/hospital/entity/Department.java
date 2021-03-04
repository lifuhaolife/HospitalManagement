package com.lfh.hospital.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
@Data
@Entity
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(columnDefinition = "int")
    private Integer id;

    @Column(columnDefinition = "varchar(100)")
    private String departmentNum;

    @Column(columnDefinition = "varchar(100)")
    private String departmentName;

    public Department(String departmentNum, String departmentName) {
        this.departmentNum = departmentNum;
        this.departmentName = departmentName;
    }
}
