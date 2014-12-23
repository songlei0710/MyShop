package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsSpecificationsProductRp;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsSpecificationsProductRpService {
    /**
     * 更新商品规格
     * @param gsrt
     */
    public void updateGoodsAssociatedProductById(GoodsSpecificationsProductRp gsrt);
    /**
     * 添加商品规格关系
     * @param goodsSpecificationsProductRp
     * @return
     */
    public int addGoodsSpecificationsProductRp(GoodsSpecificationsProductRp goodsSpecificationsProductRp);
}
