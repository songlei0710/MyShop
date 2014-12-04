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
    public UserT login(UserT transientInstance) {
        return null;
    }

    @Override
    public UserT findByUserName(String name) {
        return null;
    }

    @Override
    public UserT findById(String id) {
        return null;
    }

    @Override
    public List<UserT> findAllUsert(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countfindAllUsert() {
        return 0;
    }

    @Override
    public UserT checkUserByUsername(UserT transientInstance) {
        return null;
    }

    @Override
    public int updateUserTunpwd(UserT u) {
        return 0;
    }

    @Override
    public int delUser(String[] list) {
        return 0;
    }

    @Override
    public int updateUserforMyInfo(UserT u) {
        return 0;
    }

    @Override
    public UserT usert(UserT user) {
        return null;
    }

    @Override
    public int updateUserMember(UserT user) {
        return 0;
    }

    @Override
    public int updateUserstate(UserT user) {
        return 0;
    }

    @Override
    public UserT finduserByuid(String uid) {
        return null;
    }

    @Override
    public List<UserT> sortAllUsert(int currentPage, int lineSize, String queryString) {
        return null;
    }

    @Override
    public String[] findEmailByUser() {
        return new String[0];
    }

    @Override
    public UserT checkUserByEmail(UserT u) {
        return null;
    }

    @Override
    public UserT checkUserByAnswer(String username, String question, String answer) {
        return null;
    }

    @Override
    public int updateUserPasswordProtection(String userid, String question, String answer) {
        return 0;
    }

    @Override
    public int updateUserRoleMByuserid(String userid, String rolemid, String rolemname) {
        return 0;
    }

    @Override
    public int updateUserHeadPathByUserId(UserT user) {
        return 0;
    }

    @Override
    public void updateUserT(UserT usert) {

    }
}
