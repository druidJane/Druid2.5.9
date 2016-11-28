package com.druid.dao;

import com.druid.model.core.BaseModel;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by druid on 27/11/16.
 */
public class DaoFactory {
    private static final ConcurrentHashMap<Class,MyBatisDao> DAO_CACHE = new ConcurrentHashMap();

    public static <M extends BaseModel> MyBatisDao<M> getDao(Class<M> modelClass){
        MyBatisDao dao = DAO_CACHE.get(modelClass);
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
