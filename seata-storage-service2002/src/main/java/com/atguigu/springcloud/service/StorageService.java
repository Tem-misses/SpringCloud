package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 14:32
 **/
public interface StorageService {

    void decrease(Long productId, Integer count);
}
