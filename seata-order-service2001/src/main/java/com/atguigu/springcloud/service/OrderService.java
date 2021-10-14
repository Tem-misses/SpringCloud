package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 10:15
 **/

public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     */
    void creat(Order order);

}
