package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.RoleDao;
import net.hzjxy.myshop.dao.UserRoleDao;
import net.hzjxy.myshop.entity.Role;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class RoleDaoImpl implements RoleDao {


    @Override
    public void updateRole(Role role) {
        SqlSession session=MybatisUtil.currentSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        roleDao.updateRole(role);
        session.commit();
    }

    @Override
    public Role findRoleById(String id) {
        SqlSession session=MybatisUtil.currentSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        roleDao.findRoleById(id);
        session.commit();
        return null;
    }

    @Override
    public int delRole(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        roleDao.delRole(strs);
        session.commit();
        return roleDao.delRole(strs);
    }

    @Override
    public List<Role> findAllRole() {
        SqlSession session=MybatisUtil.currentSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        List<Role> role=roleDao.findAllRole();
        return role;
    }

    @Override
    public int addRole(Role role) {
        SqlSession session=MybatisUtil.currentSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        int rolee=roleDao.addRole(role);
        return rolee;
    }
}
