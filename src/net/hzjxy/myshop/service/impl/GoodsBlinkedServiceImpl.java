package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsBlinkedDao;
import net.hzjxy.myshop.entity.GoodsBlinked;
import net.hzjxy.myshop.service.GoodsBlinkedService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsBlinkedServiceImpl implements GoodsBlinkedService {
    private GoodsBlinkedDao goodsBlinkedDao;

    public GoodsBlinkedDao getGoodsBlinkedDao() {
        return goodsBlinkedDao;
    }

    public void setGoodsBlinkedDao(GoodsBlinkedDao goodsBlinkedDao) {
        this.goodsBlinkedDao = goodsBlinkedDao;
    }

    @Override
    public int addGoodsBlinked(GoodsBlinked goodsBelinked) {
        return this.getGoodsBlinkedDao().addGoodsBlinked(goodsBelinked);
    }

    @Override
    public int updateGoodsBelinked(GoodsBlinked gbel) {
        return this.getGoodsBlinkedDao().updateGoodsBelinked(gbel);
    }
}
