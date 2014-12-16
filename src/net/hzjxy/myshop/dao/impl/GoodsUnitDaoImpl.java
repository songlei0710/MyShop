package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsUnitDao;
import net.hzjxy.myshop.entity.GoodsUnit;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/14.
 */
public class GoodsUnitDaoImpl implements GoodsUnitDao {
    @Override
    public int delGoodsunit(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        goodsUnitDao.delGoodsunit(list);
        session.commit();
        return goodsUnitDao.delGoodsunit(list);
    }

    @Override
    public int updateGoodsunit(GoodsUnit u) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        int update=goodsUnitDao.updateGoodsunit(u);
        return update;
    }

    @Override
    public List<GoodsUnit> findAllGoodsunit(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        List<GoodsUnit> goodsunit=goodsUnitDao.findAllGoodsunit(currentPage,lineSize);
        return goodsunit;
    }

    @Override
    public int countfindAllGoodsunit() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        int countfindall=goodsUnitDao.countfindAllGoodsunit();
        return goodsUnitDao.countfindAllGoodsunit();
    }

    @Override
    public GoodsUnit findGoodsunitById(String unitid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        GoodsUnit goodsUnit=goodsUnitDao.findGoodsunitById(unitid);
        return goodsUnit;
    }

    @Override
    public List<GoodsUnit> findAllGoodsunitjson() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        List<GoodsUnit> goodsunitfind=goodsUnitDao.findAllGoodsunitjson();
        return goodsunitfind;
    }

    @Override
    public List<GoodsUnit> sortAllGoodsnit(int currentPage, int lineSize, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        List<GoodsUnit> goodsunitsort=goodsUnitDao.sortAllGoodsnit(currentPage,lineSize,queryString);
        return goodsunitsort;
    }

    @Override
    public int add(GoodsUnit goodsUnit) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsUnitDao goodsUnitDao=session.getMapper(GoodsUnitDao.class);
        int add=goodsUnitDao.add(goodsUnit);
        return add;
    }
}
