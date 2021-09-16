package com.lagou.order.controller;

import com.alpha.common.model.ResponseData;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lagou.common_db.Order;
import com.lagou.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单控制层
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * 下单
     */
    @RequestMapping("/add")
    public void addOrder(Long orderId,Integer goodsId, Integer num, Double money, String username) {
        System.out.println();
        Order order = new Order();
        order.setId(orderId);
        order.setGoodsId(goodsId);
        order.setNum(num);
        order.setMoney(money);
        order.setUsername(username);
        orderService.add(order);
    }

    @RequestMapping("/query")
    public ResponseData<List<Order>> queryOrderByGoodsId(Integer goodsId){
        LambdaQueryWrapper<Order> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Order::getGoodsId,goodsId);
        List<Order> list = orderService.list(queryWrapper);
        return ResponseData.success(list);
    }

    @RequestMapping("/query2")
    public Integer queryOrderByGoodsId2(Integer goodsId){
        System.out.println(111);
        LambdaQueryWrapper<Order> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Order::getGoodsId,goodsId);
//        List<Order> list = orderService.list(queryWrapper);
        int count = orderService.count(queryWrapper);


        return count;
    }

}
