package com.example.buoi_4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Value("${User.ID}")
    private int id;
    @Value("${User.user}")
    private String user;
    @Value("${User.passWord}")
    private String passWord;
    @Bean
    public User user(){
        return new User(id,user,passWord);
    }
}
