package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.BrandDao;
import net.hzjxy.myshop.entity.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by wx on 2014/12/15.
 */
public  class BrandDaoImpl implements BrandDao{
    @Override
    public void delBrandt(@Param("list") String[] list, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        brandDao.delBrandt(list,creatorid);
        session.commit();
        return ;
    }

    @Override
    public void updateBrandt(Brand bt) {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        brandDao.updateBrandt(bt);
        return ;
    }

    @Override
    public List<Brand> findAllBrandt(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        List<Brand> brands=brandDao.findAllBrandt(currentPage,lineSize,creatorid);
        return brands;
    }

    @Override
    public int countfindAllBrandt(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        brandDao.countfindAllBrandt(creatorid);
        return brandDao.countfindAllBrandt(creatorid);
    }

    @Override
    public String findBrandById(String brandid) {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        brandDao.findBrandById(brandid);
        return brandid;
    }

    @Override
    public List<Brand> findAllBrandt() {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        List<Brand> brands=brandDao.findAllBrandt();
        return brands;
    }

    @Override
    public List<Brand> sortAllBrandt(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        BrandDao brandDao=session.getMapper(BrandDao.class);
        List<Brand> brands=brandDao.sortAllBrandt(currentPage,lineSize,creatorid,queryString);
        return brands;
    }

    @Override
    public int addBrand(Brand brand) {
        return 0;
    }
}
