package com.lfh.hospital.service;

import com.lfh.hospital.entity.RegistrationInfo;
import com.lfh.hospital.repository.RegistrationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
@Service
public class RegistrationInfoImpl implements RegistrationInfoService {

    @Autowired
    RegistrationInfoRepository registrationInfoRepository;
    @Override
    public List<RegistrationInfo> findAllRegistrationInfo() {

        return null;
    }

    @Override
    public RegistrationInfo findRegistrationInfoById(Integer id) {
        return null;
    }

    @Override
    public RegistrationInfo findRegistrationInfoByName(String name) {
        return null;
    }

    @Override
    public void addRegistrationInfo(RegistrationInfo registrationInfo) {
        registrationInfoRepository.save(registrationInfo);
    }

    @Override
    public void deleteRegistrationInfo(RegistrationInfo registrationInfo) {

    }

    @Override
    public void updateRegistrationInfo(RegistrationInfo registrationInfo) {

    }

    @Override
    public Page<RegistrationInfo> findAllRegistrationInfo(Integer page, Integer size) {
        PageRequest pageable = PageRequest.of(page, size, Sort.Direction.ASC, "recordId");
        return registrationInfoRepository.findAll(pageable);
    }
}
