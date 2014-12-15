package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface UserRoleDao {
    /**
     * 根据用户id删除角色
     * @param userId
     */
    public int delUserRole(@Param("userId") String userId);

    /**
     * 根据userId获取用户角色
     * @param userId
     * @return
     */
    public List<UserRole> findUserRoleByUserId(@Param("userId") String userId);
}
