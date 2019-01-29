package com.javaedge.security.converter;

import com.javaedge.security.domain.Person;
import com.javaedge.security.form.PersonForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * Created on 2017/11/8 0008.
 *
 * @author sss
 * @since 1.0
 */
@Slf4j
public class PersonForm2Person {
    public static Person convert(PersonForm person) {
        Person p = new Person();
        BeanUtils.copyProperties(person, p);
        return p;
    }
}

