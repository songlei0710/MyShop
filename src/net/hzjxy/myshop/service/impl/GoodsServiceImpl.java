package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsDao;
import net.hzjxy.myshop.entity.Goods;
import net.hzjxy.myshop.service.GoodsService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsServiceImpl implements GoodsService {
private GoodsDao goodsDao;

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void updateGoods(Goods goods) {
this.goodsDao.updateGoods(goods);
    }

    @Override
    public int addGoods(Goods goods) {
        return this.goodsDao.addGoods(goods);
    }
}
