package com.ajin.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ajin.springdemo.mapper")
public class SpringdemoApplication {
    //阿进。
    public static void main(String[] args) {
        SpringApplication.run(SpringdemoApplication.class, args);
    }

}
