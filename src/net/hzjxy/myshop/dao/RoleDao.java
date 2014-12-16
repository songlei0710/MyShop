package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Role;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface RoleDao {
    /**
     * 更新角色
     * @param role
     */
    public void updateRole(Role role);

    /**
     * 根据id获取角色信息
     * @param id
     * @return
     */
    public Role findRoleById(String id);

    /**
     * 删除角色
     * @param strs
     * @return
     */
    public int delRole(String[] strs);

    /**
     * 获取所有角色列表
     * @return
     */
    public List<Role> findAllRole();
    /**
     * 添加
     */
    public int addRole(Role role);
}
