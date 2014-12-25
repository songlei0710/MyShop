package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsTypeDao;
import net.hzjxy.myshop.entity.GoodsType;
import net.hzjxy.myshop.service.GoodsTypeService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsTypeServiceImpl implements GoodsTypeService {
    private GoodsTypeDao goodsTypeDao;

    public GoodsTypeDao getGoodsTypeDao() {
        return goodsTypeDao;
    }

    public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
        this.goodsTypeDao = goodsTypeDao;
    }

    @Override
    public int updateGoodsTypeTN(GoodsType gtn) {
        return this.getGoodsTypeDao().updateGoodsTypeTN(gtn);
    }

    @Override
    public int addGoodsType(GoodsType goodsType) {
        return this.getGoodsTypeDao().addGoodsType(goodsType);
    }
}
