package com.druid.module;

import com.druid.core.dao.BaseDao;
import com.druid.core.dao.DaoFactory;
import com.druid.core.exception.SystemException;
import com.druid.model.Account;
import com.module.AccountService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by druid on 28/11/16.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    protected BaseDao<Account> getBaseDAO() {
        return DaoFactory.getDao(Account.class);
    }
    public List<Account> queryAccountList(Account account) throws SystemException {
        return getBaseDAO().queryForList(account,new HashMap());
    }



}
