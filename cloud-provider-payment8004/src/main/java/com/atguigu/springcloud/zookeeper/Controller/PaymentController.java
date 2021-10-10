package com.atguigu.springcloud.zookeeper.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/8 13:21
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")  //获取端口号
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }


}
