package com.druid.mapper;

import com.druid.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by druid on 24/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindInfo(){
        System.out.println(userMapper.findUserInfo().size());
    }
}
