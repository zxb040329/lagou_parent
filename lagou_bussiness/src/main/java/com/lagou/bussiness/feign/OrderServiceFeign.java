package com.lagou.bussiness.feign;

import com.alpha.common.model.ResponseData;
import com.lagou.common_db.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("lagou-order-service")
public interface OrderServiceFeign {


    @GetMapping("/order/add")
    public void addOrder(@RequestParam("orderId") Long id, @RequestParam("goodsId") Integer goodsId,
                         @RequestParam("num") Integer num,
                         @RequestParam("money") Double money,
                         @RequestParam("username") String username);

    @GetMapping("/order/query")
    public ResponseData<List<Order>> queryOrderByGoodsId(@RequestParam("goodsId") Integer goodsId);
}
