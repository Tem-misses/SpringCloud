package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Tem_misses
 * @Description:PaymentService 的接口
 * @DateTime: 2021/9/28 17:14
 **/

public interface PaymentService {

    public int creat(Payment payment);   //写入数据

    public Payment getPaymentById(@Param("id") Long id);   //根据Id读取数据

}
