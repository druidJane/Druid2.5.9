package com.druid.dao;

import com.druid.Application;
import com.druid.model.Person;
import org.junit.Assert;
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
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testInsert(){
        Person person = new Person("testName", 11, "testAddress");
        Person newP = personRepository.saveAndFlush(person);
        Assert.assertNotNull(newP);
        System.out.println(newP.getId());
    }

}
