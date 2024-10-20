package com.allin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@MapperScan(basePackages = "com.allin.mapper")
@EnableDiscoveryClient // 开启注册中心的服务注册和发现功能
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
