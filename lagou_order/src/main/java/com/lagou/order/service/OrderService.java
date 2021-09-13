package com.lagou.order.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lagou.common_db.Order;

public interface OrderService extends IService<Order> {
    void add(Order order);
}
