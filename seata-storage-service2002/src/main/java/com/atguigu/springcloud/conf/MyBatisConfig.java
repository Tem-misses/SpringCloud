package com.atguigu.springcloud.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 14:45
 **/
@Configuration
@MapperScan({"com.atguigu.springcloud.dao.StorageDao"})
public class MyBatisConfig {
}
