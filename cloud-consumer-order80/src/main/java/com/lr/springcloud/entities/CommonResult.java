package com.lr.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liurui
 * @date 2020/4/4 16:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
