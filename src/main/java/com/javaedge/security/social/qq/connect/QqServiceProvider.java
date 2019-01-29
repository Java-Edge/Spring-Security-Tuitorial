package com.javaedge.security.social.qq.connect;

import com.javaedge.security.social.qq.api.Qq;
import com.javaedge.security.social.qq.api.impl.QqImpl;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * http://wiki.connect.qq.com/%E4%BD%BF%E7%94%A8authorization_code%E8%8E%B7%E5%8F%96access_token
 * Created on 2018/11/19
 *
 * @author sss
 */
public class QqServiceProvider extends AbstractOAuth2ServiceProvider<Qq> {

    /**
     * 获取code
     */
    private static final String QQ_URL_AUTHORIZE = "https://graph.qq.com/oauth2.0/authorize";
    /**
     * 获取access_token 也就是令牌
     */
    private static final String QQ_URL_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token";
    private String appId;

    public QqServiceProvider(String appId, String appSecret) {
        super(new QqOauth2Template(appId, appSecret, QQ_URL_AUTHORIZE, QQ_URL_ACCESS_TOKEN));
        this.appId = appId;
    }

    @Override
    public Qq getApi(String accessToken) {

        return new QqImpl(accessToken, appId);
    }
}
