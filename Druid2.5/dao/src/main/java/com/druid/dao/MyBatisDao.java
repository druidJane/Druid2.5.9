package com.druid.dao;

import com.druid.model.core.BaseModel;
import com.druid.support.DaoSuppout;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;

/**
 * Created by druid on 27/11/16.
 */
public abstract class MyBatisDao<P extends BaseModel> extends DaoSuppout{


    @Autowired
    @Qualifier("sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    protected abstract Class<P> getEClass();


    public List<?> queryForList(P po, Map<Object,Object> param){
        return getSqlTemplate().selectList("UserMapper.findUserInfo");
    }
}
