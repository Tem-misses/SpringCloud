package com.atguigu.springcloud.service;


import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Tem_misses
 * @Description:业务层的实现
 * @DateTime: 2021/9/28 17:15
 **/

@Service
public class PaymentServiceImp implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
