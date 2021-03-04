package com.lfh.hospital.service;

import com.lfh.hospital.entity.RegistrationInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
public interface RegistrationInfoService {

    /**
     * 查询所有的挂号信息
     */
    List<RegistrationInfo> findAllRegistrationInfo();

    /**
     * 根据挂号信息id进行查询挂号信息
     * @param id
     * @return
     */
    RegistrationInfo findRegistrationInfoById(Integer id);

    /**
     * 根据患者姓名查询患者的挂号信息
     * @param name
     * @return
     */
    RegistrationInfo findRegistrationInfoByName(String name);

    /**
     * 增加一条挂号信息
     * @param registrationInfo
     */
    void addRegistrationInfo(RegistrationInfo registrationInfo);

    /**
     * 删除一条挂号信息
     * @param registrationInfo
     */
    void deleteRegistrationInfo(RegistrationInfo registrationInfo);

    /**
     * 修改一条挂号信息
     * @param registrationInfo
     */
    void updateRegistrationInfo(RegistrationInfo registrationInfo);

    /**
     * 分页查询所有的挂号信息
     * @param page
     * @param size
     * @return
     */
    Page<RegistrationInfo> findAllRegistrationInfo(Integer page, Integer size);
}
