package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.PaymentDao;
import net.hzjxy.myshop.dao.ProductSpecificationDao;
import net.hzjxy.myshop.entity.ProductSpecification;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class ProductSpecificationDaoImpl implements ProductSpecificationDao {
    @Override
    public int updateProductSpecification(ProductSpecification pst) {
        return 0;
    }

    @Override
    public ProductSpecification findProductSpecificationsBySpecificationId(String specificationId) {
        return null;
    }

    @Override
    public List<ProductSpecification> findAllProductSpecification(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countFindAllProductSpecification() {
        return 0;
    }

    @Override
    public int delProductSpecification(String[] list) {
        return 0;
    }

    @Override
    public List<ProductSpecification> findAllProductSpecificati(String state) {
        return null;
    }

    @Override
    public List<ProductSpecification> sortAllProductSpecification(int currentPage, int lineSize, String queryString) {
        return null;
    }

    @Override
    public List<ProductSpecification> findAllProductSpecificationByGoodsTypeId(String goodsTypeId, String state) {
        return null;
    }

    @Override
    public int addProductSpecification(PaymentDao paymentDao) {
        return 0;
    }
}
