package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Tem_misses
 * @Description:业务控制层，调用里面的逻辑
 * @DateTime: 2021/9/28 17:21
 **/
@RestController
@Slf4j
public class paymentController {
    //    @Resource
//    PaymentServiceImp paymentServiceImp;
    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/creat")
    //插入数据
    public CommonResult creat(@RequestBody Payment payment) {
        int result = paymentService.creat(payment);
        log.info("插入的返回结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "数据插入成功！" + serverPort, result);
        } else {
            return new CommonResult(444, "数据插入失败！");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    //查询数据
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果为：" + result);
        if (result != null) {
            return new CommonResult(200, "查询到结果，结果为：" + serverPort + result);
        } else {
            return new CommonResult(444, "查询失败，并没有查询到id为" + id + "的信息");
        }
    }

    //测试discoverClient
    @GetMapping(value = "/payment/discover")
    public Object discover() {
        //测试service系列
        List<String> services = discoveryClient.getServices();
        for (String element :
                services) {
//            log.info("获取到service服务为：" + services);
            System.out.println("获取到service服务为：" + services);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instant :
                instances) {
            System.out.println("在instance下获得的" + instant.getInstanceId() + "\t" + instant.getPort()
                    + instant.getHost() + "\t" + instant.getUri());
        }

        return null;
    }


}
