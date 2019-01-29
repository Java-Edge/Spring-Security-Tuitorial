package com.javaedge.security.service.impl;

import com.javaedge.security.domain.Result;
import com.javaedge.security.domain.SysMenu;
import com.javaedge.security.domain.SysRole;
import com.javaedge.security.domain.SysUser;
import com.javaedge.security.dto.RoleDto;
import com.javaedge.security.enums.ResultEnum;
import com.javaedge.security.repository.SysMenuRepository;
import com.javaedge.security.repository.SysRoleRepository;
import com.javaedge.security.utils.ResultUtil;
import com.javaedge.security.service.SysRoleService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2018/2/9.
 *
 * @author javaedge
 * @since 1.0
 */
@Service
@Slf4j
public class SysRoleServiceImpl extends MerryyouBaseServiceImpl<SysRole> implements SysRoleService {

    @Autowired
    private SysRoleRepository roleRepository;

    @Autowired
    private SysMenuRepository menuRepository;

    @Override
    public List<RoleDto> findAlls() {
        List<RoleDto> roleDtoList = new ArrayList<>();
        RoleDto roleDto;
        List<SysRole> roleList = roleRepository.findAll();
        for (SysRole role : roleList) {
            roleDto = new RoleDto();
            BeanUtils.copyProperties(role, roleDto);
            roleDtoList.add(roleDto);
        }
        return roleDtoList;
    }

    @Override
    public Result saveRole(String data) {
        List<RoleDto> roleDtoList = new Gson().fromJson(data,
                new TypeToken<List<RoleDto>>() {
                }.getType());

        SysRole sysRole = new SysRole();
        BeanUtils.copyProperties(roleDtoList.get(0), sysRole);
        List<SysMenu> menuList = new ArrayList<>();
        SysMenu sysMenu;
        String menuIds = roleDtoList.get(0).getMenuIds();
        if (StringUtils.isEmpty(menuIds)) return ResultUtil.error(ResultEnum.FAIL.getCode(), "请选择角色对应的权限！");
        for (String str : menuIds.split(",")) {
            sysMenu = menuRepository.findById(str).get();
            sysRole.getMenus().add(sysMenu);
        }
        roleRepository.save(sysRole);
        return ResultUtil.success("角色保存成功");
    }

    @Override
    public RoleDto findRole(String id) {
        SysRole sysRole = roleRepository.findById(id).get();
        String menuIds = "";
        List<SysMenu> menus = sysRole.getMenus();
        for (SysMenu sysMenu : menus) {
            menuIds += sysMenu.getId() + ",";
        }
        RoleDto roleDto = new RoleDto();
        BeanUtils.copyProperties(sysRole, roleDto);
        roleDto.setMenuIds(menuIds);
        log.info(roleDto.toString());
        return roleDto;
    }

    @Override
    public Result<String> delRoles(String ids) {
        if (StringUtils.isEmpty(ids)) return ResultUtil.error(ResultEnum.FAIL.getCode(), "请选择要删除的角色！");
        String[] roleIds = ids.split(",");
        for (String id : roleIds) {
            List<SysUser> users = roleRepository.getOne(id).getUsers();
            if (users != null && users.size() > 0) {
                return ResultUtil.success("选择的角色已绑定用户！");
            }
            roleRepository.deleteById(id);
        }

        return ResultUtil.success("删除成功！");
    }
}
