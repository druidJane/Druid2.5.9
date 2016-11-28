package com.druid.support;

import com.druid.util.ApplicationContextHolder;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

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
