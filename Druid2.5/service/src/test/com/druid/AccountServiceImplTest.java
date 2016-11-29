package com.druid;

import com.druid.core.utils.ApplicationContextHolder;
import com.druid.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by druid on 28/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AccountServiceImplTest {
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void testQueryForList(){
        AccountService accountService = (AccountService) ApplicationContextHolder.getContext().getBean("accountService");
        System.out.println(accountService.queryAccountList(new Account()));
        System.out.println(this.accountService.queryAccountList(new Account()));
    }
}
