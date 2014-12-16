package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.RoleDao;
import net.hzjxy.myshop.dao.RoleFunctionDao;
import net.hzjxy.myshop.entity.RoleFunction;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class RoleFunctionDaoImpl implements RoleFunctionDao {
    @Override
    public List<RoleFunction> findAllRoleFunctionByRoleId(String roleId) {
        SqlSession session=MybatisUtil.currentSession();
        RoleFunctionDao RoleFunctionDao=session.getMapper(RoleFunctionDao.class);
        List<RoleFunction> role=RoleFunctionDao.findAllRoleFunctionByRoleId(roleId);
        return null;
    }

    @Override
    public int delRoleFunction(String roleId) {
        SqlSession session=MybatisUtil.currentSession();
        RoleFunctionDao RoleFunctionDao=session.getMapper(RoleFunctionDao.class);
        RoleFunctionDao.delRoleFunction(roleId);
        session.commit();
        return RoleFunctionDao.delRoleFunction(roleId);

    }
}
