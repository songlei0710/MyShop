package net.hzjxy.myshop.test;

import net.hzjxy.myshop.dao.impl.UserTDaoImpl;
import net.hzjxy.myshop.entity.UserT;

/**
 * Created by Administrator on 2014/12/1.
 */
public class UserTTest {
    public static void main(String[] args) {
        UserTDaoImpl impl = new UserTDaoImpl();
        UserT userT = new UserT();
        userT.setUsername("admin");
        userT.setPassword("123");

        UserT returnUser = impl.login(userT);

        System.out.println(returnUser.getEmail());

    }
}
