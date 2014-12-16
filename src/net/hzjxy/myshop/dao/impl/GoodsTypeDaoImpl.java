package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsTypeDao;
import net.hzjxy.myshop.entity.GoodsType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsTypeDaoImpl implements GoodsTypeDao{
    @Override
    public int delGoodsTypeTN(String[] list)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao  goodsTypeDao=session.getMapper( GoodsTypeDao.class);
        goodsTypeDao.delGoodsTypeTN(list);
        session.commit();
        return goodsTypeDao.delGoodsTypeTN(list);
    }

    @Override
    public int updateGoodsTypeTN(GoodsType gtn)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao  goodsTypeDao=session.getMapper( GoodsTypeDao.class);
        goodsTypeDao.updateGoodsTypeTN(gtn);
        session.commit();
        return goodsTypeDao.updateGoodsTypeTN(gtn);
    }

    @Override
    public List<GoodsType> findAllGoodsTypeTN(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao goodsTypeDao=session.getMapper(GoodsTypeDao.class);
        List<GoodsType> goodsType=goodsTypeDao.findAllGoodsTypeTN(currentPage,lineSize);
        return goodsType;
    }

    @Override
    public int countfindAllGoodsTypeTN() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao  goodsTypeDao=session.getMapper( GoodsTypeDao.class);
        goodsTypeDao.countfindAllGoodsTypeTN();
        return goodsTypeDao.countfindAllGoodsTypeTN();
    }

    @Override
    public List<GoodsType> findGoodsTypeTNById(String goodsTypeId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao goodsTypeDao=session.getMapper(GoodsTypeDao.class);
        List<GoodsType> goodsType=goodsTypeDao.findGoodsTypeTNById(goodsTypeId);
        return goodsType;
    }

    @Override
    public List<GoodsType> findAllGoodsTypeTNNopage() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao goodsTypeDao=session.getMapper(GoodsTypeDao.class);
        List<GoodsType> goodsType=goodsTypeDao.findAllGoodsTypeTNNopage();
        return goodsType;
    }

    @Override
    public List<GoodsType> sortAllGoodsTypeTN(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao goodsTypeDao=session.getMapper(GoodsTypeDao.class);
        List<GoodsType> goodsType=goodsTypeDao.sortAllGoodsTypeTN(currentPage,lineSize,queryString);
        return goodsType;
    }

    @Override
    public int countsortAllGoodsTypeTN(String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao  goodsTypeDao=session.getMapper( GoodsTypeDao.class);
        goodsTypeDao.countsortAllGoodsTypeTN(queryString);
        return goodsTypeDao.countsortAllGoodsTypeTN(queryString);
    }

    @Override
    public List<GoodsType> findGoodsTypeTNByName(String name)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao goodsTypeDao=session.getMapper(GoodsTypeDao.class);
        List<GoodsType> goodsType=goodsTypeDao.findGoodsTypeTNByName(name);
        return goodsType;

    }

    @Override
    public int addGoodsType(GoodsType goodsType) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsTypeDao  goodsTypeDao=session.getMapper( GoodsTypeDao.class);
        goodsTypeDao.addGoodsType(goodsType);
        session.commit();
        return goodsTypeDao.addGoodsType(goodsType);
    }
}
