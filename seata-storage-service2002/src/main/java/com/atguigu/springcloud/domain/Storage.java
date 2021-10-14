package com.atguigu.springcloud.domain;

import lombok.Data;

/**
 * @Author: Tem_misses
 * @Description:
 * @DateTime: 2021/10/14 14:19
 **/

@Data
public class Storage {

    private Long id;

    private Long productId;  // 产品ID

    private Integer total;   // 总库存

    private Integer used;    //已用库存

    private Integer residue;  //剩余库存

}
