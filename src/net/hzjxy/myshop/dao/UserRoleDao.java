package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.UserRole;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface UserRoleDao {
    /**
     * 根据用户id删除角色
     * @param userId
     */
    public int delUserRole(String userId);

    /**
     * 根据userId获取用户角色
     * @param userId
     * @return
     */
    public List<UserRole> findUserRoleByUserId(String userId);
}
