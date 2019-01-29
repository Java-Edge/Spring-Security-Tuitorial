package com.javaedge.security.service.impl;

import com.javaedge.security.domain.SysRole;
import com.javaedge.security.service.impl.SysRoleServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created on 2018/2/9.
 *
 * @author javaedge
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysRoleServiceImplTest {

    @Autowired
    private SysRoleServiceImpl sysRoleService;

    @Test
    public void findOneTest() throws Exception{
        SysRole role = sysRoleService.findOne("2619a672e53811e7b983201a068c6482");
        log.info(role.toString());
    }
}