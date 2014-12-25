package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsAttributeRpDao;
import net.hzjxy.myshop.entity.GoodsAttributeRp;
import net.hzjxy.myshop.service.GoodsAttributeRpService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsAttributeRpServiceImpl implements GoodsAttributeRpService{
    private GoodsAttributeRpDao goodsAttributeRpDao;

    public GoodsAttributeRpDao getGoodsAttributeRpDao() {
        return goodsAttributeRpDao;
    }

    public void setGoodsAttributeRpDao(GoodsAttributeRpDao goodsAttributeRpDao) {
        this.goodsAttributeRpDao = goodsAttributeRpDao;
    }

    @Override
    public int addGoodsAttributeRp(GoodsAttributeRp goodsAttributeRp) {
        return this.getGoodsAttributeRpDao().addGoodsAttributeRp(goodsAttributeRp);
    }
}
