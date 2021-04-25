package com.wang.tK;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.wang.tK.mapper"})
public class TKApplication {

    public static void main(String[] args) {
        SpringApplication.run(TKApplication.class, args);
    }
}
