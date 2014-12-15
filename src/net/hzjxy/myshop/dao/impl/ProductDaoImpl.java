package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.ProductDao;
import net.hzjxy.myshop.entity.Product;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> findAllProductByCreatorId(int currentPage, int lineSize, String creatorId) {
        return null;
    }

    @Override
    public List<Product> findAllProduct(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countFindAllProduct(String creatorId) {
        return 0;
    }

    @Override
    public int countFineAllProduct() {
        return 0;
    }

    @Override
    public List<Product> findAllProductByGoodsId(String creatorId, String goodsId) {
        return null;
    }

    @Override
    public int updateProduct(Product pt) {
        return 0;
    }

    @Override
    public List<Product> findProductByProductId(String creatorId, String productId) {
        return null;
    }

    @Override
    public int delProductBygoodsId(String goodsId, String creatorId) {
        return 0;
    }

    @Override
    public List<Product> sortAllProduct(int currentPage, int lineSize, String queryString) {
        return null;
    }

    @Override
    public int delProductByProductId(String productId) {
        return 0;
    }

    @Override
    public List<Product> findProductByGoodsId(String goodsId) {
        return null;
    }

    @Override
    public Product findProductById(String productId) {
        return null;
    }

    @Override
    public int delProduct(String[] strs) {
        return 0;
    }

    @Override
    public List<Product> findProductByProductName(String productName, int lineSize) {
        return null;
    }
}
