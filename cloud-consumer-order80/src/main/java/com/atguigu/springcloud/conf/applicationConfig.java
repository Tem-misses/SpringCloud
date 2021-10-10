package com.atguigu.springcloud.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Tem_misses
 * @Description:配置类
 * @DateTime: 2021/9/28 20:59
 **/
@Configuration
public class applicationConfig {

    //模块之间调用不同的端口需要用到的
    @Bean
    @LoadBalanced   //开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
