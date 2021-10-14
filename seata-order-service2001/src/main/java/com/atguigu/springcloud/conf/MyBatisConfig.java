package com.atguigu.springcloud.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 13:24
 **/
@Configuration
@MapperScan({"com.atguigu.springcloud.dao.OrderDao"})
public class MyBatisConfig {

}
