package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/9/29 14:39
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServerMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(ServerMain7001.class, args);
    }

}
