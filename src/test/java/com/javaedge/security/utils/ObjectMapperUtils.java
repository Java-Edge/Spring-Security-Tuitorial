package com.javaedge.security.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created on 2017/11/8.
 *
 * @author javaedge
 * @since 1.0
 */
public class ObjectMapperUtils {
    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
