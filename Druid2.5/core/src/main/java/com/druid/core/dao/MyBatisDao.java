package com.druid.core.dao;

import com.druid.core.exception.SystemException;
import com.druid.core.model.BaseModel;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by druid on 27/11/16.
 */
public abstract class MyBatisDao<P extends BaseModel> extends DaoSuppout implements BaseDao<P>{
    @Override
    public List<?> queryForList(String paramString, Object[] paramArrayOfObject) throws SystemException {
        return null;
    }

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    protected abstract Class<P> getEClass();
    @Override
    public List<?> queryForList(P po, Map<Object, Object> paramMap) throws SystemException {
        return getSqlTemplate().selectList(getQuerySQLId(po), po);
    }

    private String getQuerySQLId(P po) {
        if (!(StringUtils.isEmpty(po.sqlMapMeta().getQuerySQLId()))) {
            return po.sqlMapMeta().getQuerySQLId();
        }
        return po.getTableName() + "." + po.sqlMapMeta().getQuerySQLName();
    }

    @Override
    public void setDataStatus(P paramP, String paramString) {

    }

    @Override
    public P insert(P paramP, Map<Object, Object> paramMap) throws SystemException {
        return null;
    }

    @Override
    public void deleteByPK(P paramP, Map<Object, Object> paramMap) throws SystemException {

    }

    @Override
    public P updateByPK(P paramP, Map<Object, Object> paramMap) throws SystemException {
        return null;
    }

    @Override
    public P findByPK(P paramP, Map<Object, Object> paramMap) throws SystemException {
        return null;
    }

    @Override
    public int queryForCount(P paramP, Map<Object, Object> paramMap) throws SystemException {
        return 0;
    }

    @Override
    public List<?> queryList(P paramP, Map<Object, Object> paramMap, int paramInt1, int paramInt2) throws SystemException {
        return null;
    }

    @Override
    public void queryForObject(String paramString, Object[] paramArrayOfObject, RowCallbackHandler paramRowCallbackHandler) throws SystemException {

    }

    @Override
    public int queryForInt(String paramString, Object[] paramArrayOfObject) throws SystemException {
        return 0;
    }

    @Override
    public List<?> queryForList(String paramString) throws SystemException {
        return null;
    }

    @Override
    public Long getSequenceId(P paramP) throws SystemException {
        return null;
    }

    @Override
    public int executeUpdate(String paramString, Object[] paramArrayOfObject) throws SystemException {
        return 0;
    }

    @Override
    public List<Map<String, Object>> jdbcQueryForList(String paramString, Object[] paramArrayOfObject) throws SystemException {
        return null;
    }

    @Override
    public List<Map<String, Object>> jdbcQueryForList(String paramString, Map<String, Object> paramMap) {
        return null;
    }
}
