package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.GoodsCommentDao;
import net.hzjxy.myshop.entity.GoodsComment;
import net.hzjxy.myshop.service.GoodsCommentService;

/**
 * Created by Administrator on 2014/12/15.
 */
public class GoodsCommentServiceImpl implements GoodsCommentService {
    private GoodsCommentDao goodsCommentDao;

    public GoodsCommentDao getGoodsCommentDao() {
        return goodsCommentDao;
    }

    public void setGoodsCommentDao(GoodsCommentDao goodsCommentDao) {
        this.goodsCommentDao = goodsCommentDao;
    }

    @Override
    public void updateGoodsComment(GoodsComment gct) {
this.getGoodsCommentDao().updateGoodsComment(gct);
    }

    @Override
    public int addGoodsComment(GoodsComment goodsComment) {
        return this.getGoodsCommentDao().addGoodsComment(goodsComment);
    }
}
