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
        UserT user=userTDao.login("admin","123456","1");
        return user;
    }

    @Override
    public UserT findByUserName(String username) {
        return null;
    }

    @Override
    public UserT findById(String userId) {
        return null;
    }

    @Override
    public List<UserT> findAllUserT(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countFindAllUserT() {
        return 0;
    }

    @Override
    public UserT checkUserByUsername(String username) {
        return null;
    }

    @Override
    public int updateUserTunpwd(UserT userT) {
        return 0;
    }

    @Override
    public int delUser(String[] list) {
        return 0;
    }

    @Override
    public int updateUserForMyInfo(UserT userT) {
        return 0;
    }

    @Override
    public UserT checkUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public int updateUserMember(String username, String newPassword, String userId) {
        return 0;
    }

    @Override
    public int updateUserState(String userId, String userState) {
        return 0;
    }

    @Override
    public UserT findUserByUserId(String userId) {
        return null;
    }

    @Override
    public List<UserT> sortAllUserT(int currentPage, int lineSize, String queryString) {
        return null;
    }

    @Override
    public String[] findEmailByUser() {
        return new String[0];
    }

    @Override
    public UserT checkUserByEmail(String email) {
        return null;
    }

    @Override
    public UserT checkUserByAnswer(String username, String question, String answer) {
        return null;
    }

    @Override
    public int updateUserPasswordProtection(String userId, String question, String answer) {
        return 0;
    }

    @Override
    public int updateUserRoleByUserId(String userId, String roleId, String roleName) {
        return 0;
    }

    @Override
    public int updateUserHeadPathByUserId(String userId, String headPath) {
        return 0;
    }

    @Override
    public void updateUserT(UserT userT) {

    }

    @Override
    public int addUserT(UserT userT) {
        return 0;
    }
}
