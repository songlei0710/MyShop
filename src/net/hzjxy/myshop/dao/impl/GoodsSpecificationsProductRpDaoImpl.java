package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsSpecificationsProductRpDao;
import net.hzjxy.myshop.entity.GoodsSpecificationsProductRp;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsSpecificationsProductRpDaoImpl implements GoodsSpecificationsProductRpDao{
    @Override
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipByspecificationsid(String specificationsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao=session.getMapper(GoodsSpecificationsProductRpDao.class);
        List<GoodsSpecificationsProductRp> goodsSpecificationsProductRp =goodsSpecificationsProductRpDao.checkSpecificationRelationshipByspecificationsid(specificationsid);
        return goodsSpecificationsProductRp;
    }

    @Override
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipBygoodssetid(String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao=session.getMapper(GoodsSpecificationsProductRpDao.class);
        List<GoodsSpecificationsProductRp> goodsSpecificationsProductRp =goodsSpecificationsProductRpDao.checkSpecificationRelationshipBygoodssetid(goodsid);
        return goodsSpecificationsProductRp;
    }

    @Override
    public List<GoodsSpecificationsProductRp> checkSpecificationRelationshipByproductid(String productid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao=session.getMapper(GoodsSpecificationsProductRpDao.class);
        List<GoodsSpecificationsProductRp> goodsSpecificationsProductRp =goodsSpecificationsProductRpDao.checkSpecificationRelationshipByproductid(productid);
        return goodsSpecificationsProductRp;
    }

    @Override
    public void updateGoodsAssociatedProductById(GoodsSpecificationsProductRp gsrt) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao=session.getMapper(GoodsSpecificationsProductRpDao.class);
        goodsSpecificationsProductRpDao.updateGoodsAssociatedProductById(gsrt);
        session.commit();
    }

    @Override
    public int addGoodsSpecificationsProductRp(GoodsSpecificationsProductRp goodsSpecificationsProductRp) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao=session.getMapper(GoodsSpecificationsProductRpDao.class);
        goodsSpecificationsProductRpDao.addGoodsSpecificationsProductRp(goodsSpecificationsProductRp);
        session.commit();
        return goodsSpecificationsProductRpDao.addGoodsSpecificationsProductRp(goodsSpecificationsProductRp);
    }

    @Override
    public int delGoodsAssociatedProductById(String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsSpecificationsProductRpDao goodsSpecificationsProductRpDao=session.getMapper(GoodsSpecificationsProductRpDao.class);
        goodsSpecificationsProductRpDao.delGoodsAssociatedProductById(goodsid);
        session.commit();
        return  goodsSpecificationsProductRpDao.delGoodsAssociatedProductById(goodsid);
    }
}
