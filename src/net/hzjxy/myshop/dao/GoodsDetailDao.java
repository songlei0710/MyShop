package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsDetail;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsDetailDao {
    /**
     * 根据商品id获取商品详细介绍
     * @param goodsid
     * @return
     */
    public GoodsDetail findGoodsDetailRpBygoodsid(String goodsid);
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
