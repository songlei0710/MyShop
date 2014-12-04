package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsAttributeRp;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsAttributeRpDao {
    /**
     * 根据goodsid获取商品的属性
     *
     * @param goodsid
     * @return
     */
    public List<GoodsAttributeRp> findGoodsAttributeRpTBygoodsid(String goodsid);

    /**
     * 根据goodsid删除商品的属性关联
     *
     * @param goodsid
     */
    public void delByProperty(String property, Object entity);

    /**
     * 根据goodsid删除数据
     *
     * @param goodsid
     */
    public int delBygoodsid(String goodsid);
    /**
     * 根据属性值获取商品id集合
     * @param attrval
     * @return
     */
    public List<GoodsAttributeRp>findGoodsIdsByAttr(String attrval);
}
