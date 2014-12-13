package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsAttributeRp;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsAttributeRpDao {
    /**
     * 根据goodsid获取商品的属性
     * @param goodsId
     * @return
     */
    public List<GoodsAttributeRp> findGoodsAttributeRpByGoodsId(String goodsId);

    /**
     * 根据goodsid删除数据
     * @param goodsId
     */
    public int delBygoodsId(String goodsId);
    /**
     * 根据属性值获取商品id集合
     * @param attrVal
     * @return
     */
    public List<GoodsAttributeRp> findGoodsIdsByAttr(String attrVal);
}
