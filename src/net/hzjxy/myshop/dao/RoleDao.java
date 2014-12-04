package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Role;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface RoleDao {
    /**
     * 更新角色
     *
     * @param rm
     */
    public void updateRoleM(Role rm);

    /**
     * 根据id获取角色信息
     *
     * @param id
     * @return
     */
    public Role findRoleMById(String id);

    /**
     * 删除角色
     *
     * @param strs
     * @return
     */
    public int delRoleM(String[] strs);

    /**
     * 获取所有角色列表
     *
     * @return
     */
    public List<Role> findAllRoleM();
}
