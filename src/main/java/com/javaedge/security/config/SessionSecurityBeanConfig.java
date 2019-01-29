package com.javaedge.security.config;

import com.javaedge.security.handle.MerryyouLogoutSuccessHandler;
import com.javaedge.security.properties.SecurityProperties;
import com.javaedge.security.session.MerryyouExpiredSessionStrategy;
import com.javaedge.security.session.MerryyouInvalidSessionStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.session.InvalidSessionStrategy;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

/**
 * Created on 2018/1/27 0027.
 *
 * @author javaedge
 * @email i@merryyou.cn
 * @since 1.0
 */
@Configuration
public class SessionSecurityBeanConfig {

    @Autowired
    private SecurityProperties securityProperties;

    @Bean
    public InvalidSessionStrategy invalidSessionStrategy(){
        return new MerryyouInvalidSessionStrategy(securityProperties.getSession().getSessionInvalidUrl());
    }

    @Bean
    public SessionInformationExpiredStrategy sessionInformationExpiredStrategy(){
        return new MerryyouExpiredSessionStrategy(securityProperties.getSession().getSessionInvalidUrl());
    }

    @Bean
    @ConditionalOnMissingBean(LogoutSuccessHandler.class)
    public LogoutSuccessHandler logoutSuccessHandler(){
        return new MerryyouLogoutSuccessHandler(securityProperties.getSignOutUrl());
    }
}
