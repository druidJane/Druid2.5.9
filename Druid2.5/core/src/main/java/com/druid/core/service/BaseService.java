package com.druid.core.service;

import com.druid.core.exception.BusiException;
import com.druid.core.exception.SystemException;
import com.druid.core.model.BaseModel;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by druid on 28/11/16.
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
public abstract interface BaseService<P extends BaseModel> {

    public abstract P insert(P paramP, Map<Object, Object> paramMap) throws BusiException;

    public abstract void deleteByPK(P paramP, Map<Object, Object> paramMap) throws BusiException;

    public abstract P updateByPK(P paramP, Map<Object, Object> paramMap) throws BusiException;

    public abstract P findByPK(P paramP, Map<Object, Object> paramMap) throws BusiException;

    public abstract List<?> queryForList(P paramP, Map<Object, Object> paramMap) throws BusiException, SystemException;

    public abstract List<?> queryForList(P paramP, Map<Object, Object> paramMap, int paramInt1, int paramInt2)
            throws BusiException;

    public abstract int queryForCount(P paramP, Map<Object, Object> paramMap);

    //public abstract BasePageObj queryForPage(P paramP, Map<Object, Object> paramMap) throws BusiException;

    public abstract void deleteForList(List<P> paramList, Map<Object, Object> paramMap) throws BusiException;

    public abstract P insert(P paramP) throws BusiException;

    public abstract void insertList(List<P> paramList) throws BusiException;

    public abstract void deleteByPK(P paramP) throws BusiException;

    public abstract P updateByPK(P paramP) throws BusiException;

    public abstract P findByPK(P paramP) throws BusiException;

    public abstract List<?> queryForList(P paramP) throws BusiException;

    public abstract List<?> queryForList(P paramP, int paramInt1, int paramInt2) throws BusiException;

    public abstract int queryForCount(P paramP);

    //public abstract BasePageObj queryForPage(P paramP) throws BusiException;

    public abstract void deleteForList(List<P> paramList) throws BusiException;

}
