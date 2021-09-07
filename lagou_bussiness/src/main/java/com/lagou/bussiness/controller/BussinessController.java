package com.lagou.bussiness.controller;

import com.lagou.bussiness.common.UserCoinAccountAllVO;
import com.lagou.bussiness.mapper.UserCoinAccountMapper;
import com.lagou.bussiness.service.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


@RestController
public class BussinessController {

    @Autowired
    UserCoinAccountMapper userCoinAccountMapper;

    @Autowired
    private BussinessService bussinessService;

    //http://localhost:8000/test1
    @GetMapping("/test1")
    public String test1() {
        bussinessService.sale(1, 10, 100d, "zhaoyang");
        return "success";
    }

    @GetMapping("/test2")
    public String test2() {
        bussinessService.sale(1, 101, 100d, "zhaoyang");
        return "success";
    }

    @GetMapping("/test3")
    public List<UserCoinAccountAllVO> test3() {
        HashSet<Integer> userIdSet = new HashSet<>();
        userIdSet.add(12906);
        List<UserCoinAccountAllVO> userCoinAccountAllVOS = userCoinAccountMapper.queryUserCoinCount(userIdSet);
        return userCoinAccountAllVOS;
//        bussinessService.sale(1, 101, 100d, "zhaoyang");
//        return "success";
    }
}
