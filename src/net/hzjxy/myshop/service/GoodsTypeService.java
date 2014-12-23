package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.GoodsType;

/**
 * Created by Administrator on 2014/12/15.
 */
public interface GoodsTypeService {
    /**
     * 更新商品类型
     *
     * @param gtn
     * @return
     */
    public int updateGoodsTypeTN(GoodsType gtn);
    /**
     * 添加商品规格关系
     * @param goodsType
     * @return
     */
    public int addGoodsType(GoodsType goodsType);
}
