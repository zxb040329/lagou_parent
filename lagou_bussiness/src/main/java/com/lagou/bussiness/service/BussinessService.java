package com.lagou.bussiness.service;

import com.lagou.common_db.Order;

import java.util.List;

public interface BussinessService {

    public void sale(Integer goodsId, Integer num, Double money, String username);

    public List<Order> query(Integer goodsId);
}
