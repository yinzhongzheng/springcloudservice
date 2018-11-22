package com.yzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * author:yzz
 * date:1980/11/22
 * E-mail:yzzstyle@163.com
 * com.yzz.cloud
 * 注释:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegister {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRegister.class,args);
    }
}
