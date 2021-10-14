package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/13 18:23
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9004.class, args);
    }


}
