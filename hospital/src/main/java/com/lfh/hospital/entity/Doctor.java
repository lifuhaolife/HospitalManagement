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
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //姓名
    @Column(columnDefinition = "varchar(100)")
    private String name;
    //证件类型
    private Integer idType;
    //证件号
    private String certificate;
    //手机号
    private String phoneNum;
    //固定电话
    private String fixPhone;
    private Integer gender;
    private Integer age;
    private String birth;
    private String email;
    //科室主键
    private Integer departmentId;
    //学历
    private Integer education;
    //备注
    private String remarks;

    public Doctor(String name, Integer idType, String certificate, String phoneNum, String fixPhone, Integer gender, Integer age, String birth, String email, Integer departmentId, Integer education, String remarks) {
        this.name = name;
        this.idType = idType;
        this.certificate = certificate;
        this.phoneNum = phoneNum;
        this.fixPhone = fixPhone;
        this.gender = gender;
        this.age = age;
        this.birth = birth;
        this.email = email;
        this.departmentId = departmentId;
        this.education = education;
        this.remarks = remarks;
    }
}
