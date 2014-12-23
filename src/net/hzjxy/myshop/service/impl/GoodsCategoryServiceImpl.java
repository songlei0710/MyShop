package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsCategoryDao;
import net.hzjxy.myshop.entity.GoodsCategory;
import net.hzjxy.myshop.service.GoodsCategoryService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    private net.hzjxy.myshop.dao.GoodsCategoryDao GoodsCategoryDao;

    public GoodsCategoryDao getGoodsCategoryDao() {
        return GoodsCategoryDao;
    }

    public void setGoodsCategoryDao(GoodsCategoryDao goodsCategoryDao) {
        GoodsCategoryDao = goodsCategoryDao;
    }

    @Override
    public int updateGoodscategoryT(GoodsCategory gct) {
        return this.getGoodsCategoryDao().updateGoodscategoryT(gct);
    }

    @Override
    public int addGoodsCategory(GoodsCategory goodsCategory) {
        return this.getGoodsCategoryDao().addGoodsCategory(goodsCategory);
    }
}
