package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.UserT;

/**
 * Created by 磊 on 2014/11/30.
 */
public interface UserTService{
    public void addUserT(UserT userT);
    public UserT login(UserT user);
}
