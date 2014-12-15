package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsSpecificationsProductRp;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsSpecificationsProductRpDao {
    /**
     * 检测商品和商品规格关系
     * @return
     */
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipByspecificationsid(String specificationsid );


    /**
     * 通过goodssetid 查找规格
     * @return
     */
    public List<GoodsSpecificationsProductRp>checkSpecificationRelationshipBygoodssetid(String goodsid);
    /**
     * 通过productid 查找规格
     * @return
     */
    public List<GoodsSpecificationsProductRp>checkSpecificationRelationshipByproductid(String productid);


    /**
     * 更新商品规格
     * @param gsrt
     */
    public void updateGoodsAssociatedProductById(GoodsSpecificationsProductRp gsrt);

    /**
     * 删除商品规格
     * @param goodsid
     * @return
     */
    public int delGoodsAssociatedProductById(final String goodsid);
    /**
     * 添加商品规格关系
     * @param goodsSpecificationsProductRp
     * @return
     */
    public int addGoodsSpecificationsProductRp(GoodsSpecificationsProductRp goodsSpecificationsProductRp);
}
