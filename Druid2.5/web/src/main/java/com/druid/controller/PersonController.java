package com.druid.controller;

import com.druid.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by druid on 23/11/16.
 */
@RestController
public class PersonController {
    @RequestMapping(value="/save")
    public User addUser(String name,String address,Integer age){
        User user = new User();
        user.setId(333l);
        user.setName("String");
        user.setPassword("pwd");
        return user;
    }
}
