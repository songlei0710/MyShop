package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsSpecificationsProductRpDao;
import net.hzjxy.myshop.entity.GoodsSpecificationsProductRp;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsSpecificationsProductRpDaoImpl implements GoodsSpecificationsProductRpDao{
    @Override
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipByspecificationsid(String specificationsid) {
        return null;
    }

    @Override
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipBygoodssetid(String goodsid) {
        return null;
    }

    @Override
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipByproductid(String productid) {
        return null;
    }

    @Override
    public void updateGoodsAssociatedProductById(GoodsSpecificationsProductRp gsrt) {

    }

    @Override
    public int delGoodsAssociatedProductById(String goodsid) {
        return 0;
    }
}
