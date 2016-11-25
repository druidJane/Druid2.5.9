package com.druid.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by druid on 24/11/16.
 */
@Configuration
public class DBConfig {
    /**
     * 获取第一个数据源
     * @return
     */
    @Bean(name="primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(locations = "classpath:application.properties",prefix="spring.datasource.primary")
    public DataSource primaryDataSource(){
        return DataSourceBuilder.create().build();
    }
}
