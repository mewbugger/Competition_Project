package com.wly.competition_project.config;

import com.wly.competition_project.common.convention.biz.user.UserTransmitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    /**
     * 用户信息传递过滤器
     */
//    @Bean
//    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter(StringRedisTemplate stringRedisTemplate) {
//        FilterRegistrationBean<UserTransmitFilter> registration = new FilterRegistrationBean<>();
//        registration.setFilter(new UserTransmitFilter(stringRedisTemplate));
//        registration.addUrlPatterns("/*");
//        registration.setOrder(0);
//        return registration;
//    }
}
