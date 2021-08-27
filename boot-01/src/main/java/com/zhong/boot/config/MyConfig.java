package com.zhong.boot.config;

import com.zhong.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    //注册的组件是单实例的，从容器中获取的bean是启动类初始化时的单实例对象
    @Bean
    public User user01(){
        return new User("张三",18);
    }
}
