package net.hzjxy.myshop.test;

import net.hzjxy.myshop.dao.impl.UserTDaoImlp;
import net.hzjxy.myshop.entity.UserT;

/**
 * Created by Administrator on 2014/12/1.
 */
public class UserTTest {
    public static void main(String[] args) {
        UserTDaoImlp imlp = new UserTDaoImlp();
        UserT userT = new UserT();
        userT.setUsername("admin");
        userT.setPassword("123");

        UserT returnUser = imlp.login(userT);

        System.out.println(returnUser.getEmail());

    }
}
