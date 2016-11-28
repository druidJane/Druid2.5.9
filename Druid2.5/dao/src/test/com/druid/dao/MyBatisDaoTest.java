package com.druid.dao;

import com.druid.Application;
import com.druid.model.Account;
import com.druid.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;

/**
 * Created by druid on 27/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class MyBatisDaoTest {
    @Test
    public void testDao(){
        Account account = new Account();
        List<User> list = DaoFactory.getDao(Account.class).queryForList(account, new HashMap());
        for(User u:list){
            System.out.println(u.getName());
        }
    }
}
