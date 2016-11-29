package com.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by druid on 23/11/16.
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
@ImportResource({"classpath:spring/spring-dubbo-mall.xml"})
public class Application {

    public static void main(String[] args) throws InterruptedException{
        SpringApplication.run(Application.class);

        System.out.println("项目启动！");

    }
}
