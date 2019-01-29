package com.javaedge.security.repository;

import com.javaedge.security.domain.SysMenu;
import com.javaedge.security.domain.SysRole;
import com.javaedge.security.repository.SysMenuRepository;
import com.javaedge.security.repository.SysRoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created on 2018/2/7.
 *
 * @author javaedge
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SysRoleRepositoryTest {

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Autowired
    private SysMenuRepository menuRepository;

    @Test
    public void findOneTest() throws Exception {
        SysRole role = sysRoleRepository.findById("2619a672e53811e7b983201a068c6482").get();
        log.info("【SysRole】 role={}", role);
    }

    @Test
    public void findMenuByRole() throws Exception {
        SysRole role = sysRoleRepository.findById("2619a672e53811e7b983201a068c6482").get();
        List<SysMenu> menus = role.getMenus();
        for (SysMenu sysMenu : menus) {
            log.info(sysMenu.toString());
        }
        log.info("【SysRole】 role={}", role);
    }
}