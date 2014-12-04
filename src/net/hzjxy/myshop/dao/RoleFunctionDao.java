package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.RoleFunction;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface RoleFunctionDao {
    /**
     * 根据角色获取权限列表
     *
     * @return
     */
    public List<RoleFunction> findAllRoleFunctionMByroleid(String roleid);

    /**
     * 根据角色id删除权限关系
     *
     * @param roleid
     * @return
     */
    public int delRoleFunctionM(String roleid);
}
