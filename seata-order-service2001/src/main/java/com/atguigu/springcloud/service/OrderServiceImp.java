package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 10:19
 **/
@Service
@Slf4j
public class OrderServiceImp implements OrderService {

    @Resource
    OrderDao orderDao;

    @Resource
    StorageService storageService;

    @Resource
    AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void creat(Order order) {
        log.info("-------> 下单开始");
        orderDao.create(order);    //开始创建订单

        log.info("-----------> 扣减库存开始");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("-------------> 扣减库存结束");


        log.info("---------------> 开始扣钱");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("-------------> 扣钱结束");


        log.info("---------------> 开始修改订单状态");
        orderDao.update(order.getUserId(), 0);
        log.info("------------ >修改订单状态结束 ");

        log.info("----------------> 下单结束！");

    }
}
