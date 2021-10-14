package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.domain.CommonResult;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 14:42
 **/
@RestController
public class StorageController {

    @Autowired
    StorageService storageService;

    public CommonResult decrease(Long product, Integer count) {

        storageService.decrease(product, count);

        return new CommonResult(200, "扣减库存成功！");

    }

}
