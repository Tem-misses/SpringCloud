package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/10 15:58
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }

}
