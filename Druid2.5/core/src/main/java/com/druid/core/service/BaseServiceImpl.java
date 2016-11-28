package com.druid.core.service;

import com.druid.core.dao.BaseDao;
import com.druid.core.dao.DaoFactory;
import com.druid.core.exception.BusiException;
import com.druid.core.exception.SystemException;
import com.druid.core.model.BaseModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by druid on 28/11/16.
 */
public abstract class BaseServiceImpl<P extends BaseModel> implements BaseService<P> {
    protected abstract BaseDao<P> getBaseDAO();

    @Override
    @Transactional
    public List<?> queryForList(P po, Map<Object, Object> paramMap) throws BusiException, SystemException {
        return getBaseDAO().queryForList(po,new HashMap());
    }

    @Override
    @Transactional
    public P insert(P po, Map<Object, Object> paramMap) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public void deleteByPK(P po, Map<Object, Object> paramMap) throws BusiException {

    }

    @Override
    @Transactional
    public P updateByPK(P po, Map<Object, Object> paramMap) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public P findByPK(P po, Map<Object, Object> paramMap) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public List<?> queryForList(P po, Map<Object, Object> paramMap, int paramInt1, int paramInt2) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public int queryForCount(P po, Map<Object, Object> paramMap) {
        return 0;
    }

    @Override
    @Transactional
    public void deleteForList(List<P> paramList, Map<Object, Object> paramMap) throws BusiException {

    }

    @Override
    @Transactional
    public P insert(P po) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public void insertList(List<P> paramList) throws BusiException {

    }

    @Override
    @Transactional
    public void deleteByPK(P po) throws BusiException {

    }

    @Override
    @Transactional
    public P updateByPK(P po) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public P findByPK(P po) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public List<?> queryForList(P po) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public List<?> queryForList(P po, int paramInt1, int paramInt2) throws BusiException {
        return null;
    }

    @Override
    @Transactional
    public int queryForCount(P po) {
        return 0;
    }

    @Override
    @Transactional
    public void deleteForList(List<P> paramList) throws BusiException {

    }
}
