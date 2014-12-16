package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.ProductSpecificationDao;
import net.hzjxy.myshop.entity.ProductSpecification;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class ProductSpecificationDaoImpl implements ProductSpecificationDao {
    @Override
    public int updateProductSpecification(ProductSpecification pst) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        int product=productSpecificationDao.updateProductSpecification(pst);
        return product;
    }

    @Override
    public ProductSpecification findProductSpecificationsBySpecificationId(String specificationId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        ProductSpecification productSpecification=productSpecificationDao.findProductSpecificationsBySpecificationId(specificationId);
        return productSpecification;
    }

    @Override
    public List<ProductSpecification> findAllProductSpecification(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        List<ProductSpecification> productSpecificationList=productSpecificationDao.findAllProductSpecification(currentPage,lineSize);
        return productSpecificationList;
    }

    @Override
    public int countFindAllProductSpecification() {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        int product=productSpecificationDao.countFindAllProductSpecification();
        return product;
    }

    @Override
    public int delProductSpecification(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        productSpecificationDao.delProductSpecification(list);
        session.commit();
        return productSpecificationDao.delProductSpecification(list);
    }

    @Override
    public List<ProductSpecification> findAllProductSpecificati(String state) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        List<ProductSpecification> productSpecificationList=productSpecificationDao.findAllProductSpecificati(state);
        return productSpecificationList;
    }

    @Override
    public List<ProductSpecification> sortAllProductSpecification(int currentPage, int lineSize, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        List<ProductSpecification> productSpecificationList=productSpecificationDao.sortAllProductSpecification(currentPage,lineSize,queryString);
        return productSpecificationList;
    }

    @Override
    public List<ProductSpecification> findAllProductSpecificationByGoodsTypeId(String goodsTypeId, String state) {
        SqlSession session=MybatisUtil.currentSession();
        ProductSpecificationDao productSpecificationDao=session.getMapper(ProductSpecificationDao.class);
        List<ProductSpecification> productSpecificationList=productSpecificationDao.findAllProductSpecificationByGoodsTypeId(goodsTypeId,state);
        return productSpecificationList;
    }
}
