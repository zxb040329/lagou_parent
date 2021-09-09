package com.lagou.bussiness.lagouBussinessTest;

import com.lg.pojo.SimpleBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author zxb
 * @Date 2021/9/9 12:08
 * @Version 1.0
 */
@RunWith(SpringRunner.class)  //测试启动器，并加载spring boot测试注解
@SpringBootTest
//标记该类为spring boot单元测试类，并加载项目的applicationContext上下文环境
public class LagouBussinessTest {

    /*
     测试随机数及参数间引用
    */
    @Autowired
    private SimpleBean simpleBean;


    @Test
    void zdyStarterTest(){
        System.out.println(1234);
        System.out.println(simpleBean);
    }



}
