package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.domain.CommonResult;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 10:33
 **/
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult creat(Order order) {
        orderService.creat(order);
        return new CommonResult(200,"创建订单成功！");
    }


}
