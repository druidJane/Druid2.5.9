package com.druid;

import com.druid.core.exception.SystemException;
import com.druid.model.Account;

import java.util.List;

/**
 * Created by druid on 28/11/16.
 */
public interface AccountService {
    List<Account> queryAccountList(Account account) throws SystemException;

    void testDubbo();
}
