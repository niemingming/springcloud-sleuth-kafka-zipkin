package com.nmm.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //引入feign支持
@EnableAutoConfiguration //引入自动配置，替代配置文件
public class ServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerOneApplication.class,args);
    }
}
