package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsAttributeRpDao;
import net.hzjxy.myshop.entity.GoodsAttributeRp;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsAttributeRpDaoImpl implements GoodsAttributeRpDao {
    @Override
    public List<GoodsAttributeRp> findGoodsAttributeRpByGoodsId(String goodsId) {
        return null;
    }

    @Override
    public int delBygoodsId(String goodsId) {
        return 0;
    }

    @Override
    public List<GoodsAttributeRp> findGoodsIdsByAttr(String attrVal) {
        return null;
    }
}
