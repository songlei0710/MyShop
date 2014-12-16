package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsCategoryDao;
import net.hzjxy.myshop.entity.GoodsCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsCategoryDaoImpl implements GoodsCategoryDao {
    @Override
    public GoodsCategory findPathParentIdByParentId(String parentId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        GoodsCategory goodsCategory=goodsCategoryDao.findPathParentIdByParentId(parentId);
        return goodsCategory;
    }

    @Override
    public List<GoodsCategory> findGoodsCategoryByGrade(@Param("grade") String grade, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findGoodsCategoryByGrade(grade,state);
        return goodsCategory;
    }

    @Override
    public int checkGoodscategoryName(String name) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.checkGoodscategoryName(name);
        return goodsCategoryDao.checkGoodscategoryName(name);
    }

    @Override
    public int checkGoodscategorySign(String sign)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.checkGoodscategorySign(sign);
        return goodsCategoryDao.checkGoodscategorySign(sign);
    }

    @Override
    public int delGoodscategoryS(@Param("goodsCategoryTid") String goodsCategoryTid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.delGoodscategoryS(goodsCategoryTid,state);
        session.commit();
        return goodsCategoryDao.delGoodscategoryS(goodsCategoryTid,state);
    }

    @Override
    public int delGoodscategoryT(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.delGoodscategoryT(strs);
        session.commit();
        return goodsCategoryDao.delGoodscategoryT(strs);
    }

    @Override
    public int updateGoodscategoryT(GoodsCategory gct)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.updateGoodscategoryT(gct);
        session.commit();
        return goodsCategoryDao.updateGoodscategoryT(gct);
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryTByPage(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findAllGoodsCategoryTByPage(currentPage,lineSize,state);
        return goodsCategory;
    }

    @Override
    public int countfindAllGoodsCategoryT(String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.countfindAllGoodsCategoryT(state);
        return goodsCategoryDao.countfindAllGoodsCategoryT(state);
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryTByGrade(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("grade") String grade, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findAllGoodsCategoryTByGrade(currentPage, lineSize, grade, state);
        return goodsCategory;
    }

    @Override
    public int countfindAllGoodsCategoryTByGrade(@Param("grade") String grade, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.countfindAllGoodsCategoryTByGrade(grade,state);
        return  goodsCategoryDao.countfindAllGoodsCategoryTByGrade(grade,state);
    }

    @Override
    public GoodsCategory findGoodscategoryBygoodscategoryId(String goodsCategoryTid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        GoodsCategory goodsCategory =goodsCategoryDao.findGoodscategoryBygoodscategoryId(goodsCategoryTid);
        return goodsCategory;

    }

    @Override
    public int checkGoodscategoryNamewithoutMe(@Param("goodsCategoryTid") String goodsCategoryTid, @Param("name") String name) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.checkGoodscategoryNamewithoutMe(goodsCategoryTid,name);
       return goodsCategoryDao.checkGoodscategoryNamewithoutMe(goodsCategoryTid,name);
    }

    @Override
    public int checkGoodscategorySignwithoutMe(@Param("goodsCategoryTid") String goodsCategoryTid, @Param("sign") String sign) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.checkGoodscategorySignwithoutMe(goodsCategoryTid, sign);
        return goodsCategoryDao.checkGoodscategorySignwithoutMe(goodsCategoryTid,sign);
    }

    @Override
    public List<GoodsCategory> findGoodscategoryByparentId(@Param("state") String state, @Param("parentId") String parentId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findGoodscategoryByparentId(state, parentId);
        return goodsCategory;
    }

    @Override
    public List<GoodsCategory> findGoodscategoryByparentIdnull(String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findGoodscategoryByparentIdnull(state);
        return goodsCategory;
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryBycreatorid(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findAllGoodsCategoryBycreatorid(creatorid);
        return goodsCategory;
    }

    @Override
    public int updateHtmlPath(String goodsCategoryTid, String htmlpath) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        goodsCategoryDao.updateHtmlPath(goodsCategoryTid, htmlpath);
        return  goodsCategoryDao.updateHtmlPath(goodsCategoryTid, htmlpath);
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryT(String state) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findAllGoodsCategoryT(state);
        return goodsCategory;
    }

    @Override
    public int addGoodsCategory(GoodsCategory goodsCategory) {
        return 0;
    }

    @Override
    public List<GoodsCategory> sortAllGoodsCategoryT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("state") String state, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.sortAllGoodsCategoryT(currentPage, lineSize, state, queryString);
        return goodsCategory;
    }

    @Override
    public List<GoodsCategory> findAllCategoryByNoTrem() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCategoryDao goodsCategoryDao=session.getMapper(GoodsCategoryDao.class);
        List<GoodsCategory> goodsCategory =goodsCategoryDao.findAllCategoryByNoTrem();
        return goodsCategory;
    }
}
