package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsCategory;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsCategoryService {
    /**
     * 更新商品分类
     *
     * @param gct
     */
    public int updateGoodscategoryT(GoodsCategory gct);
    /**
     * 添加商品分类
     * @param goodsCategory
     * @return
     */
    public int addGoodsCategory(GoodsCategory goodsCategory);
}
