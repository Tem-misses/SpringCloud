package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Tem_misses
 * @Description:服务器集群7002
 * @DateTime: 2021/9/29 15:33
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServerMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(ServerMain7002.class, args);
    }
}
