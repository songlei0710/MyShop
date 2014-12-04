package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.UserTDao;
import net.hzjxy.myshop.entity.UserT;
import net.hzjxy.myshop.service.UserTService;

/**
 * Created by 磊 on 2014/11/30.
 */
public class UserTServiceImpl implements UserTService {
    private UserTDao userTDao;

    public UserTDao getUserTDao() {
        return userTDao;
    }

    public void setUserTDao(UserTDao userTDao) {
        this.userTDao = userTDao;
    }

    @Override
    public UserT login(UserT user) {
        return getUserTDao().login(user);
    }

    @Override
    public void addUserT(UserT userT) {

    }
}
