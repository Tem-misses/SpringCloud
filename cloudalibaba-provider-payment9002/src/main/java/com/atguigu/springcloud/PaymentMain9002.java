package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/11 14:52
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain9002.class, args);
    }
}
