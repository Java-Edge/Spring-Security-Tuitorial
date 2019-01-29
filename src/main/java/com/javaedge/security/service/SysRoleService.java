package com.javaedge.security.service;

import com.javaedge.security.domain.Result;
import com.javaedge.security.domain.SysRole;
import com.javaedge.security.dto.RoleDto;

import java.util.List;

/**
 * Created on 2018/2/9.
 *
 * @author javaedge
 * @since 1.0
 */
public interface SysRoleService extends MerryyouBaseService<SysRole>{

    List<RoleDto> findAlls();

    Result saveRole(String data);

    RoleDto findRole(String id);

    Result<String> delRoles(String ids);
}
