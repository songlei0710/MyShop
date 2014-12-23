package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsAttributeDao;
import net.hzjxy.myshop.entity.GoodsAttribute;
import net.hzjxy.myshop.service.GoodsAttributeRpService;
import net.hzjxy.myshop.service.GoodsAttributeService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsAttributeServiceImpl implements GoodsAttributeService {
    private GoodsAttributeDao goodsAttributeDao;

    public GoodsAttributeDao getGoodsAttributeDao() {
        return goodsAttributeDao;
    }

    public void setGoodsAttributeDao(GoodsAttributeDao goodsAttributeDao) {
        this.goodsAttributeDao = goodsAttributeDao;
    }

    @Override
    public int addGoodsAttribute(GoodsAttribute goodsAttribute) {
        return this.getGoodsAttributeDao().addGoodsAttribute(goodsAttribute);
    }

    @Override
    public int updateGoodsAttribute(GoodsAttribute goodsAttribute) {
        return this.getGoodsAttributeDao().updateGoodsAttribute(goodsAttribute);
    }
}
