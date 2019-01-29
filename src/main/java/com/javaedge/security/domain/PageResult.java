package com.javaedge.security.domain;

import lombok.Data;

/**
 * Created on 2018/2/9.
 *
 * @author javaedge
 * @since 1.0
 */
@Data
public class PageResult<T> {
    private String total;

    private T data;
}
