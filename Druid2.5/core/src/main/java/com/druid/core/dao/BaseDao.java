package com.druid.core.dao;

import com.druid.core.exception.SystemException;
import com.druid.core.model.BaseModel;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.util.List;
import java.util.Map;

/**
 * Created by druid on 28/11/16.
 */
public interface BaseDao<P extends BaseModel> {

    public abstract void setDataStatus(P paramP, String paramString);

    //public abstract SolrService getSolrService();

    public abstract P insert(P paramP, Map<Object, Object> paramMap) throws SystemException;

    public abstract void deleteByPK(P paramP, Map<Object, Object> paramMap) throws SystemException;

    public abstract P updateByPK(P paramP, Map<Object, Object> paramMap) throws SystemException;

    public abstract P findByPK(P paramP, Map<Object, Object> paramMap) throws SystemException;

    public abstract List<?> queryForList(P paramP, Map<Object, Object> paramMap) throws SystemException;

    public abstract int queryForCount(P paramP, Map<Object, Object> paramMap) throws SystemException;

   // public abstract BasePageObj queryForPage(P paramP, Map<Object, Object> paramMap) throws SystemException;

    public abstract List<?> queryList(P paramP, Map<Object, Object> paramMap, int paramInt1, int paramInt2)
            throws SystemException;

    public abstract void queryForObject(String paramString, Object[] paramArrayOfObject,
                                        RowCallbackHandler paramRowCallbackHandler) throws SystemException;

    public abstract List<?> queryForList(String paramString, Object[] paramArrayOfObject) throws SystemException;

    public abstract int queryForInt(String paramString, Object[] paramArrayOfObject) throws SystemException;

    public abstract List<?> queryForList(String paramString) throws SystemException;

    public abstract Long getSequenceId(P paramP) throws SystemException;

    public abstract int executeUpdate(String paramString, Object[] paramArrayOfObject) throws SystemException;

    public abstract List<Map<String, Object>> jdbcQueryForList(String paramString, Object[] paramArrayOfObject)
            throws SystemException;

    public abstract List<Map<String, Object>> jdbcQueryForList(String paramString, Map<String, Object> paramMap);

}
