package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.UserRoleDao;
import net.hzjxy.myshop.entity.UserRole;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public class UserRoleDaoImpl implements UserRoleDao{

    @Override
    public int delUserRole(String userId) {
        SqlSession session=MybatisUtil.currentSession();
        UserRoleDao userRoleDao=session.getMapper(UserRoleDao.class);
        int role=userRoleDao.delUserRole(userId);
        return role;
    }

    @Override
    public List<UserRole> findUserRoleByUserId(String userId) {
        SqlSession session=MybatisUtil.currentSession();
        UserRoleDao userRoleDao=session.getMapper(UserRoleDao.class);
        List<UserRole> roles=userRoleDao.findUserRoleByUserId(userId);
        return roles;
    }
}
