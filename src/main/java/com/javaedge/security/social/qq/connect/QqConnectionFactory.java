package com.javaedge.security.social.qq.connect;

import com.javaedge.security.social.qq.api.Qq;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * Created on 2018/11/19
 *
 * @author sss
 */
public class QqConnectionFactory extends OAuth2ConnectionFactory<Qq> {

    public QqConnectionFactory(String providerId, String appId, String appSecret) {
        super(providerId, new QqServiceProvider(appId, appSecret), new QqAdapter());
    }
}
