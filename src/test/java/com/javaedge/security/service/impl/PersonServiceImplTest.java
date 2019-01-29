package com.javaedge.security.service.impl;

import com.javaedge.security.domain.Person;
import com.javaedge.security.service.impl.PersonServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created on 2017/11/7.
 *
 * @author javaedge
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PersonServiceImplTest {

    @Autowired
    private PersonServiceImpl personService;

    @Test
    public void save() throws Exception {
        Person p = new Person();
        p.setName("merry");
        p.setAge(19);
        p.setAddress("handan");
        Person resultPerson = personService.save(p);
        Assert.assertNotNull(resultPerson);
    }

    @Test
    public void findByAge() throws Exception {
        List<Person> personList = personService.findByAge(20);
        Assert.assertNotNull(personList);
    }

    @Test
    public void findAll() throws Exception {
        List<Person> personList = personService.findAll();
        Assert.assertNotNull(personList);
    }

    @Test
    public void findOne() throws Exception {
        Person resultPerson = personService.findOne(1);
        Assert.assertNotNull(resultPerson);
    }

}