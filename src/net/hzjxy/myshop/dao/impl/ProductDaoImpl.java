package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.ProductDao;
import net.hzjxy.myshop.dao.UserTDao;
import net.hzjxy.myshop.entity.Product;
import net.hzjxy.myshop.entity.UserT;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> findAllProductByCreatorId(int currentPage, int lineSize, String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao ProductDao=session.getMapper(ProductDao.class);
        List<Product> list=ProductDao.findAllProductByCreatorId(currentPage,lineSize,creatorId);
        return list;
    }

    @Override
    public List<Product> findAllProduct(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        List<Product> list=productDao.findAllProduct(currentPage,lineSize);
        return list;
    }

    @Override
    public int countFindAllProduct(String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int product=productDaoroductDao.countFindAllProduct(creatorId);
        return product;
    }

    @Override
    public int countFineAllProduct() {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int product=productDaoroductDao.countFineAllProduct();
        return product;
    }

    @Override
    public List<Product> findAllProductByGoodsId(String creatorId, String goodsId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        List<Product> list=productDao.findAllProductByGoodsId(creatorId,goodsId);
      return list;
    }

    @Override
    public int updateProduct(Product pt) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int product=productDaoroductDao.updateProduct(pt);
        return product;
    }

    @Override
    public List<Product> findProductByProductId(String creatorId, String productId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        List<Product> list=productDao.findProductByProductId(creatorId,productId);
        return list;
    }

    @Override
    public int delProductBygoodsId(String goodsId, String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int product=productDaoroductDao.delProductBygoodsId(goodsId,creatorId);
        return product;
    }

    @Override
    public List<Product> sortAllProduct(int currentPage, int lineSize, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        List<Product> list=productDao.findAllProduct(currentPage,lineSize);
        return list;
    }

    @Override
    public int delProductByProductId(String productId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int product=productDaoroductDao.delProductByProductId(productId);
        return product;
    }

    @Override
    public List<Product> findProductByGoodsId(String goodsId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        List<Product> list=productDao.findProductByGoodsId(goodsId);
        return list;
    }

    @Override
    public Product findProductById(String productId) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        Product product=productDao.findProductById(productId);
        return product;
    }

    @Override
    public int delProduct(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int product=productDaoroductDao.delProduct(strs);
        return product;
    }

    @Override
    public List<Product> findProductByProductName(String productName, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDao=session.getMapper(ProductDao.class);
        List<Product> list=productDao.findProductByProductName(productName,lineSize);
        return list;
    }

    @Override
    public int addProduct(Product product) {
        SqlSession session=MybatisUtil.currentSession();
        ProductDao productDaoroductDao=session.getMapper(ProductDao.class);
        int productr=productDaoroductDao.addProduct(product);
        return productr;
    }
}
