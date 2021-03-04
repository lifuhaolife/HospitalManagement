package com.lfh.hospital.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

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
public class RegistrationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String recordId;
    private String name;
    private String idType;
    //证件号
    private String certificate;
    //社保号
    private String socialSecurityNumber;
    private String phone;
    //是否自费
    private Integer payMethod;
    private Integer gender;
    private Integer age;
    //职业
    private String occupation;
    //初复诊
    private String visitTime;
    private String doctorId;
    private Integer status;
    private String remarks;

    public RegistrationInfo(String name, String idType, String certificate, String socialSecurityNumber, String phone, Integer payMethod, Integer gender, Integer age, String occupation, String visitTime, String doctorId, Integer status, String remarks) {
        this.name = name;
        this.idType = idType;
        this.certificate = certificate;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phone = phone;
        this.payMethod = payMethod;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
        this.visitTime = visitTime;
        this.doctorId = doctorId;
        this.status = status;
        this.remarks = remarks;
    }
}
