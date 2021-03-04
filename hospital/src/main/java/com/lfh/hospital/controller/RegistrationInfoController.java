package com.lfh.hospital.controller;

import com.lfh.hospital.entity.RegistrationInfo;
import com.lfh.hospital.result.Result;
import com.lfh.hospital.result.ResultFactory;
import com.lfh.hospital.service.RegistrationInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LFH
 * @Description:
 * @date 2021/3/4
 */
@CrossOrigin
@RestController
@Api(tags = "/挂号信息操作")
public class RegistrationInfoController {

    @Autowired
    RegistrationInfoService registrationInfoService;

    /**
     *  添加挂号信息，首先查询所有的挂号信息， 如果不存在当前用户的挂号信息则 直接进行添加，  挂号信息可以直接添加
     * @param registrationInfo
     * @return
     */
    @RequestMapping(name = "/addRegistrationInfo",method = RequestMethod.POST)
    @ApiOperation(value = "增加挂号信息")
    public Result addRegistrationInfo(@RequestBody RegistrationInfo registrationInfo){
       registrationInfoService.addRegistrationInfo(registrationInfo);
       return ResultFactory.buildSuccessResult("添加挂号信息成功");
    }

    @RequestMapping(name = "/pageRegistrationInfo",method = RequestMethod.GET)
    @ApiOperation(value = "分页查询挂号信息")
    public Result findAllRegistrationInfoPage(@RequestParam Integer page,@RequestParam Integer size){
        Page<RegistrationInfo> allRegistrationInfo = registrationInfoService.findAllRegistrationInfo(page-1, size);
        System.out.println(" hello查询下成功" + allRegistrationInfo);
        return ResultFactory.buildResult(200, "分页查询挂号信息成功",allRegistrationInfo);
    }

}
