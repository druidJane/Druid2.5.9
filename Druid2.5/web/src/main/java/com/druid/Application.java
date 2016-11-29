package com.druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by druid on 23/11/16.
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
@ImportResource({"classpath:dubbo/dubbo.xml"})
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class);
        AccountService accountService = (AccountService) ctx.getBean("AccountService");
        accountService.testDubbo();
        //SpringApplication.run(Application.class);
    }
}
