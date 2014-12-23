package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsDetail;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsDetailService {
    /**
     * 更新商品详细介绍
     * @param gdrt
     */
    public void update(GoodsDetail gdrt);
    /**
     * 添加商品详细介绍
     * @param goodsDetail
     * @return
     */
    public int addGoodsDetail(GoodsDetail goodsDetail);
}
