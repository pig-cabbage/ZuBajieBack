package com.zubajie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@MapperScan("com.zubajie.dao")
@SpringBootApplication
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {
            SpringApplication.run(DemoApplication.class, args);

    }

}
