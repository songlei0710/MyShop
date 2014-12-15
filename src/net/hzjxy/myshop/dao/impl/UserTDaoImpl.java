package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.UserTDao;
import net.hzjxy.myshop.entity.UserT;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by 磊 on 2014/11/30.
 */
public class UserTDaoImpl implements UserTDao {
    @Override
    public UserT login(String username, String password, String userState) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.login(username,password,userState);
        return user;
    }

    @Override
    public UserT findByUserName(String username) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.findByUserName(username);
        return user;
    }

    @Override
    public UserT findById(String userId) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.findById(userId);
        return user;
    }

    @Override
    public List<UserT> findAllUserT(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        List<UserT> users =userTDao.findAllUserT(currentPage, lineSize);
        return users;
    }

    @Override
    public int countFindAllUserT() {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        userTDao.countFindAllUserT();
        return userTDao.countFindAllUserT();
    }

    @Override
    public UserT checkUserByUsername(String username) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.checkUserByUsername(username);
        return user;
    }

    @Override
    public int updateUserTunpwd(UserT userT) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserTunpwd(userT);
        return user;
    }

    @Override
    public int delUser(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        userTDao.delUser(list);
        session.commit();
        return userTDao.delUser(list);
    }

    @Override
    public int updateUserForMyInfo(UserT userT) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserForMyInfo(userT);
        return user;
    }

    @Override
    public UserT checkUsernameAndPassword(String username, String password) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.checkUsernameAndPassword(username,password);
        return user;
    }

    @Override
    public int updateUserMember(String username, String newPassword, String userId) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserMember(username,newPassword,userId);
        return user;
    }

    @Override
    public int updateUserState(String userId, String userState) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserState(userId,userState);
        return user;
    }

    @Override
    public UserT findUserByUserId(String userId) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.findUserByUserId(userId);
        return user;
    }

    @Override
    public List<UserT> sortAllUserT(int currentPage, int lineSize, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        List<UserT> user=userTDao.sortAllUserT(currentPage,lineSize,queryString);
        return user;
    }

    @Override
    public String[] findEmailByUser() {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        userTDao.findEmailByUser();
        session.commit();
        return new String[0];
    }

    @Override
    public UserT checkUserByEmail(String email) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.checkUserByEmail(email);
        return user;
    }

    @Override
    public UserT checkUserByAnswer(String username, String question, String answer) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        UserT user=userTDao.checkUserByAnswer(username,question,answer);
        return user;
    }

    @Override
    public int updateUserPasswordProtection(String userId, String question, String answer) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserPasswordProtection(userId,question,answer);
        return user;
    }

    @Override
    public int updateUserRoleByUserId(String userId, String roleId, String roleName) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserRoleByUserId(userId,roleId,roleName);
        return user;
    }

    @Override
    public int updateUserHeadPathByUserId(String userId, String headPath) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.updateUserHeadPathByUserId(userId,headPath);
        return user;
    }

    @Override
    public void updateUserT(UserT userT) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        userTDao.updateUserT(userT);
        session.commit();
    }

    @Override
    public int addUserT(UserT userT) {
        SqlSession session=MybatisUtil.currentSession();
        UserTDao userTDao=session.getMapper(UserTDao.class);
        int user=userTDao.addUserT(userT);
        return user;
    }
}
