package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.RoleFunction;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface RoleFunctionDao {
    /**
     * 根据角色获取权限列表
     * from RoleFunctionM as rfm where rfm.roleid=:roleid
     * @param roleId 用户角色Id
     * @return
     */
    public List<RoleFunction> findAllRoleFunctionByRoleId(String roleId);

    /**
     * 根据角色id删除权限关系
     * @param roleId
     * @return
     */
    public int delRoleFunction(String roleId);
}
