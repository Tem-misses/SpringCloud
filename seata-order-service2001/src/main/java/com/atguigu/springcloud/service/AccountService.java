package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: Tem_misses
 * @Description:管理余额
 * @DateTime: 2021/10/14 10:25
 **/

@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    void decrease(@RequestParam("userId") Long userId,
                  @RequestParam("money") BigDecimal money);
}
