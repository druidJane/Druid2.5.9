package com.druid;

import com.druid.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by druid on 24/11/16.
 */
public class ApplicationTest {
    @Autowired
    private UserRepository userRepository;

    public void testUser(){
        System.out.println(userRepository.count());
    }

}
