package com.javaedge.security.utils;

import com.javaedge.security.domain.Result;

/**
 * Created on 2017/11/22
 *
 * @author sss
 */
public class ResultUtil {

    /**
     * 成功响应
     *
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    /**
     * 响应失败
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
