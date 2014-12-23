package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsBlinked;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsBlinkedService {
    /**
     * 更新关联商品（只在单向关联时使用）
     *
     * @param gbel
     * @return
     */
    public int updateGoodsBelinked(GoodsBlinked gbel);
    /**
     * 添加关联商品记录
     * @param goodsBelinked
     * @return
     */
    public int addGoodsBlinked(GoodsBlinked goodsBelinked);
}
