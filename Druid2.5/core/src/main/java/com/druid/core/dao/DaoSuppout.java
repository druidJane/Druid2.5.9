package com.druid.core.dao;

import com.druid.core.utils.ApplicationContextHolder;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;

/**
 * Created by druid on 27/11/16.
 */
public class DaoSuppout {
    protected <T> T getBean(String name,Class<T> clazz){
        ApplicationContext context = ApplicationContextHolder.getContext();
        return ApplicationContextHolder.getContext().getBean(name,clazz);
    }

    public SqlSessionTemplate getSqlTemplate(){
        return getBean("sqlSessionTemplate",SqlSessionTemplate.class);
    }
}
