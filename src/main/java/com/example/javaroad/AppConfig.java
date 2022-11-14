package com.example.javaroad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class AppConfig {
    @Bean("firstBean")
    @DependsOn(value={
            "secondBean",
            "thirdBean"
    })
    public FirstBean firstBean(){
        return new FirstBean();
    }
    @Bean("secondBean")
    public SecondBean secondBean(){
        return new SecondBean();
    }
    @Bean("thirdBean")
    public ThirdBean thirdBean(){
        return new ThirdBean();
    }
}
