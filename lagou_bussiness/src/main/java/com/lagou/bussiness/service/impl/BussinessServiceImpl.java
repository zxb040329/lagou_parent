package com.lagou.bussiness.service.impl;

import com.alpha.common.model.ResponseData;
import com.alpha.common.utils.MicroServiceCallRspUtil;
import com.lagou.bussiness.feign.OrderServiceFeign;
import com.lagou.bussiness.feign.PointsServiceFeign;
import com.lagou.bussiness.feign.StorageServiceFeign;
import com.lagou.bussiness.service.BussinessService;
import com.lagou.bussiness.utils.IdWorker;
import com.lagou.common_db.Order;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务逻辑
 */
@Service
public class BussinessServiceImpl implements BussinessService {

    @Autowired
    OrderServiceFeign orderServiceFeign;
    @Autowired
    PointsServiceFeign pointsServiceFeign;

    @Autowired
    StorageServiceFeign storageServiceFeign;

    @Autowired
    IdWorker idWorker;

    /**
     * 商品销售
     *
     * @param goodsId  商品id
     * @param num      销售数量
     * @param username 用户名
     * @param money    金额
     */
//    @Transactional
    @Override
//    @GlobalTransactional(rollbackFor = Exception.class,timeoutMills = 60000,name = "sale")
    @GlobalTransactional
    public void sale(Integer goodsId, Integer num, Double money, String username) {
        //创建订单
        orderServiceFeign.addOrder(idWorker.nextId(), goodsId, num, money, username);
        //增加积分
        pointsServiceFeign.increase(username, (int) (money / 10));
        //扣减库存
        storageServiceFeign.decrease(goodsId, num);
    }

    @Override
    public List<Order> query(Integer goodsId){
        List<Order> dataFromServiceWarn = MicroServiceCallRspUtil.getDataFromServiceWarn(() ->
                orderServiceFeign.queryOrderByGoodsId(goodsId), null, null);
        return dataFromServiceWarn;
    }

}
