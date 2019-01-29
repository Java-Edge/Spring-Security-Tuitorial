package com.javaedge.security.social.qq.connect;

import com.javaedge.security.social.qq.api.Qq;
import com.javaedge.security.social.qq.api.QqUserInfo;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

/**
 * QQ 返回的信息为 Spring Social 提供的适配器
 *
 * Created on 2018/11/19
 *
 * @author sss
 */
public class QqAdapter implements ApiAdapter<Qq> {

    @Override
    public boolean test(Qq api) {
        return true;
    }

    @Override
    public void setConnectionValues(Qq api, ConnectionValues values) {
        QqUserInfo userInfo = api.getUserInfo();

        //openId 唯一标识
        values.setProviderUserId(userInfo.getOpenId());
        values.setDisplayName(userInfo.getNickname());
        values.setImageUrl(userInfo.getFigureurl_qq_1());
        values.setProfileUrl(null);
    }

    @Override
    public UserProfile fetchUserProfile(Qq api) {
        return null;
    }

    @Override
    public void updateStatus(Qq api, String message) {
    }
}
