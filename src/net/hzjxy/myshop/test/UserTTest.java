package net.hzjxy.myshop.test;

import net.hzjxy.myshop.dao.UserTDao;
import net.hzjxy.myshop.dao.impl.GoodsAttributeDaoImpl;
import net.hzjxy.myshop.dao.impl.UserTDaoImpl;
import net.hzjxy.myshop.entity.GoodsAttribute;
import net.hzjxy.myshop.entity.UserT;

import java.util.List;

/**
 * Created by Administrator on 2014/12/1.
 */
public class UserTTest {
    public static void main(String[] args) {
        UserTDaoImpl impl=new UserTDaoImpl();
        List<UserT> list=impl.findAllUserT(1,2);
        System.out.println(list.size());
    }
}
