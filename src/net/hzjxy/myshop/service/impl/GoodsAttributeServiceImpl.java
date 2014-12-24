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

    public GoodsAttributeServiceImpl() {
        super();
    }

    @Override
    public int addGoodsAttribute(GoodsAttribute goodsAttribute) {
        return 0;
    }

    @Override
    public int updateGoodsAttribute(GoodsAttribute goodsAttribute) {
        return 0;
    }
}
