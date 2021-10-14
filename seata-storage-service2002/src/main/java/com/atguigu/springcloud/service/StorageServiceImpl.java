package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.StorageDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 14:38
 **/
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {

        log.info("----------------->扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("----------------->扣减库存结束");

    }
}