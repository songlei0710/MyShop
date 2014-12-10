package net.hzjxy.myshop.test;

import net.hzjxy.myshop.dao.impl.GoodsAttributeDaoImpl;
import net.hzjxy.myshop.entity.GoodsAttribute;

/**
 * Created by Administrator on 2014/11/17.
 */
public class GoodsAttributeTest {
    public static void main(String[] args) {
        GoodsAttributeDaoImpl impl = new GoodsAttributeDaoImpl();
        GoodsAttribute goodsAttribute = impl.findGoodsAttributeBygoodsTypeId("1");
        System.out.println(goodsAttribute.getCreateTime());
       }
    }
