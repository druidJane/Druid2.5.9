package com.druid.mvc;

import com.druid.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by druid on 29/11/16.
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/query")
    public String query(){
        accountService.testDubbo();
        return "query";
    }
}
