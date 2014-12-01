package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.UserTDao;
import net.hzjxy.myshop.entity.UserT;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by 磊 on 2014/11/30.
 */
public class UserTDaoImlp implements UserTDao {
    @Override
    public UserT login(UserT userT) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        return userTDao.login(userT);
    }

    @Override
    public void addUserT(UserT userT) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        userTDao.addUserT(userT);
        session.commit();
        MybatisUtil.closeSession();
    }
}
