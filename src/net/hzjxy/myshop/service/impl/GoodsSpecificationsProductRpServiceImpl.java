package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsSpecificationsProductRpDao;
import net.hzjxy.myshop.entity.GoodsSpecificationsProductRp;
import net.hzjxy.myshop.service.GoodsSpecificationsProductRpService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsSpecificationsProductRpServiceImpl implements GoodsSpecificationsProductRpService {
private GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao;

    public GoodsSpecificationsProductRpDao getGoodsSpecificationsProductRpDao() {
        return goodsSpecificationsProductRpDao;
    }

    public void setGoodsSpecificationsProductRpDao(GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao) {
        this.goodsSpecificationsProductRpDao = goodsSpecificationsProductRpDao;
    }

    @Override
    public void updateGoodsAssociatedProductById(GoodsSpecificationsProductRp gsrt) {
this.getGoodsSpecificationsProductRpDao().updateGoodsAssociatedProductById(gsrt);
    }

    @Override
    public int addGoodsSpecificationsProductRp(GoodsSpecificationsProductRp goodsSpecificationsProductRp) {
        return this.getGoodsSpecificationsProductRpDao().addGoodsSpecificationsProductRp(goodsSpecificationsProductRp);
    }
}
