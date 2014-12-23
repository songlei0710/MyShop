package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.Goods;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsService {
    /**
     * 更新商品
     *
     * @param goods
     * @return
     */
    public void updateGoods(Goods goods);
    /**
     * 添加虚拟商品
     * @param goods
     * @return
     */
    public int addGoods(Goods goods);

}
