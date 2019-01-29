package com.javaedge.security.service;

import com.javaedge.security.domain.Result;
import com.javaedge.security.domain.SysUser;
import com.javaedge.security.dto.UserDto;

import java.util.List;

/**
 * Created on 2018/2/1 0001.
 *
 * @author javaedge
 * @email i@merryyou.cn
 * @since 1.0
 */
public interface SysUserService {

    SysUser save(SysUser user);

    SysUser findByUsername(String username);

    List<UserDto> findAll();

    UserDto findOne(String id);

    Result save(String data);

    Result<String> delUsers(String ids);
}
