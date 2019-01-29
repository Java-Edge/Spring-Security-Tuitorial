package com.javaedge.security.StringUtils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created on 2018/1/4.
 *
 * @author javaedge
 * @since 1.0
 */
public class StringUtilsTest {

    private String message = "org.spring.:坏的凭证";

    @Test
    public void test(){
        System.out.println(StringUtils.substringAfter(message,":"));
    }
}
