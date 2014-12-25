package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsDetailDao;
import net.hzjxy.myshop.entity.GoodsDetail;
import net.hzjxy.myshop.service.GoodsDetailService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsDetailServiceImpl implements GoodsDetailService {
private GoodsDetailDao goodsDetailDao;

    public GoodsDetailDao getGoodsDetailDao() {
        return goodsDetailDao;
    }

    public void setGoodsDetailDao(GoodsDetailDao goodsDetailDao) {
        this.goodsDetailDao = goodsDetailDao;
    }

    @Override
    public void update(GoodsDetail gdrt) {
this.getGoodsDetailDao().update(gdrt);
    }

    @Override
    public int addGoodsDetail(GoodsDetail goodsDetail) {
        return this.getGoodsDetailDao().addGoodsDetail(goodsDetail);
    }
}
