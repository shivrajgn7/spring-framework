package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.classes")
public class ConfigInternet {
    public  ConfigInternet(){
        System.out.println("Configuration is invoked");
    }
    @Bean("age")
    public Integer getAge(){
        return 80;
    }
    @Bean("amt")
    public float  getAmt(){
        return  12;
    }




}
