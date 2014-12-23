package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsComment;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsCommentService {
    /**
     * 更新商品评论
     * @param gct
     */
    public void updateGoodsComment(GoodsComment gct);
    /**
     * 添加商品评论
     * @param goodsComment
     * @return
     */
    public int addGoodsComment(GoodsComment goodsComment);
}
