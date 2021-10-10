package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: Tem_misses
 * @Description:作为消费者的控制类，调用其他模块的方法
 * @DateTime: 2021/9/28 20:58
 **/
@RestController
@Slf4j
public class orderController {

    //    public static final String PaymentSrv_URL = "http://localhost:8001";
    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    RestTemplate restTemplate;

    //添加
    @GetMapping(value = "/consumer/payment/creat")
    public CommonResult creat(Payment payment) {
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/creat", payment, CommonResult.class);
    }

    //查询
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
//        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/" + id, CommonResult.class, id);
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/" + id, CommonResult.class);
    }

    //尝试使用entity
    @GetMapping(value = "/consumer/entity/get/{id}")
    public CommonResult<Payment> getPaymentByEntity(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PaymentSrv_URL + "/payment/get/" + id, CommonResult.class);
        if (entity != null) {
            log.info("查找到entity");
            return entity.getBody();
        } else {
            log.info("没有查找到entity");
            return new CommonResult<>(444, "操作失败了");
        }
    }
}
