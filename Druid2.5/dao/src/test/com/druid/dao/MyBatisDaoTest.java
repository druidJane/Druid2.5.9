package com.druid.dao;

import com.druid.Application;
import com.druid.core.dao.DaoFactory;
import com.druid.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.SystemException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by druid on 27/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class MyBatisDaoTest {
    @Test
    public void testDao() throws SystemException {
        Account account = new Account();
        List<Account> list = DaoFactory.getDao(Account.class).queryForList(account, new HashMap());
        for(Account a:list){
            System.out.println(a.getName());
        }
    }
}
