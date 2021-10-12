package com.atguigu.springcloud.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/11 14:57
 **/
@Configuration
public class ApplicationContextBean {

    @Bean
    @LoadBalanced   //自动实现负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
