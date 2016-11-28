package com.druid.core.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by druid on 24/11/16.
 */
@Configuration
public class DBConfig {
    /**
     * 获取默认数据源
     * @return
     */
    @Bean(name="defaultDataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource defaultDataSource(){
        return DataSourceBuilder.create().build();
    }
    /**
     * 获取第一个数据源
     * @return
     */
    @Bean(name="primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource(){
        return DataSourceBuilder.create().build();
    }

}
