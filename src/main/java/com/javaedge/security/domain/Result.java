package com.javaedge.security.domain;

import lombok.Data;

/**
 * Created on 2017/11/22
 *
 * @author sss
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 具体信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;
}
