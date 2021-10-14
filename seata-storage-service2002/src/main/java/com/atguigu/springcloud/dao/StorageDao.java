package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.support.lob.LobCreator;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 14:23
 **/
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
