package com.javaedge.security.repository;

import com.javaedge.security.domain.SysMenu;

import java.util.List;

/**
 * Created on 2018/2/6 0028.
 *
 * @author javaedge
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface SysMenuRepository extends MerryyouRepository<SysMenu> {

    List<SysMenu> findAllByOrderByOrderNumAsc();

    List<SysMenu> findAllByMenuType(Byte menuType);

}
