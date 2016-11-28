package com.druid.core.dao;

import com.druid.core.model.BaseModel;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by druid on 27/11/16.
 */
public class DaoFactory {
    private static final ConcurrentHashMap<Class,BaseDao> DAO_CACHE = new ConcurrentHashMap();

    public static <M extends BaseModel> BaseDao<M> getDao(Class<M> modelClass){
        BaseDao dao = (BaseDao)DAO_CACHE.get(modelClass);
        if(dao == null){
            dao = new MyBatisDao() {
                @Override
                protected Class getEClass() {
                    return modelClass;
                }
            };
            DAO_CACHE.putIfAbsent(modelClass,dao);
        }
        return dao;
    }
}
