package com.zwg.dubbo.dubbop;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.zwg.dubbo.dubbop.service")
public class DubboPApplication {

    public static void main(String[] args) {

     SpringApplication.run(DubboPApplication.class,args);
    }

}
