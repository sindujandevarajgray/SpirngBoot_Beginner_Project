package com.gray.starter.springbootbeginprjct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringBootBeginPrjctApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBeginPrjctApplication.class, args);
    }

}
