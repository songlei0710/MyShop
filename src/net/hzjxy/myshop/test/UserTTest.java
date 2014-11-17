package net.hzjxy.myshop.test;

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
        GoodsAttributeDaoImpl impl=new GoodsAttributeDaoImpl();
        GoodsAttribute goodsAttribute=impl.findGoodsAttributeBygoodsTypeId("1");
        System.out.println(goodsAttribute.getCreateTime());


    }
}
