package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Tem_misses
 * @Description:PaymentDao
 * @DateTime: 2021/9/28 16:36
 **/
@Mapper
public interface PaymentDao {

    public int creat(Payment payment);   //写入数据

    public Payment getPaymentById(@Param("id") Long id);   //根据Id读取数据

}
