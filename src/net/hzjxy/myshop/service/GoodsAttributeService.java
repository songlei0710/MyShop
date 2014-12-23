package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsAttribute;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsAttributeService {
    /**
     * 更新商品参数
     * @param gat
     * @return
     */
    public int updateGoodsAttribute(GoodsAttribute gat);
    /**
     * 添加商品参数
     * @param goodsAttribute
     * @return
     */
    public int addGoodsAttribute(GoodsAttribute goodsAttribute);
}
