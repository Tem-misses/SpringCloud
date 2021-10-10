package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Tem_misses
 * @Description: 作为Json的封装实体
 * @DateTime: 2021/9/28 16:32
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;    //状态
    private String message;  //信息
    private T data;         //数据

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
