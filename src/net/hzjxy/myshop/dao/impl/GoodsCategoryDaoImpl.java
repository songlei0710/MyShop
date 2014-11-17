package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsCategoryDao;
import net.hzjxy.myshop.entity.GoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsCategoryDaoImpl implements GoodsCategoryDao {
    @Override
    public GoodsCategory findPathParentIdByParentId(String parentId) {
        return null;
    }

    @Override
    public List<GoodsCategory> findGoodsCategoryByGrade(@Param("grade") String grade, @Param("state") String state) {
        return null;
    }

    @Override
    public int checkGoodscategoryName(String name) {
        return 0;
    }

    @Override
    public int checkGoodscategorySign(String sign) {
        return 0;
    }

    @Override
    public int delGoodscategoryS(@Param("goodsCategoryTid") String goodsCategoryTid, @Param("state") String state) {
        return 0;
    }

    @Override
    public int delGoodscategoryT(String[] strs) {
        return 0;
    }

    @Override
    public int updateGoodscategoryT(GoodsCategory gct) {
        return 0;
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryTByPage(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("state") String state) {
        return null;
    }

    @Override
    public int countfindAllGoodsCategoryT(String state) {
        return 0;
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryTByGrade(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("grade") String grade, @Param("state") String state) {
        return null;
    }

    @Override
    public int countfindAllGoodsCategoryTByGrade(@Param("grade") String grade, @Param("state") String state) {
        return 0;
    }

    @Override
    public GoodsCategory findGoodscategoryBygoodscategoryId(String goodsCategoryTid) {
        return null;
    }

    @Override
    public int checkGoodscategoryNamewithoutMe(@Param("goodsCategoryTid") String goodsCategoryTid, @Param("name") String name) {
        return 0;
    }

    @Override
    public int checkGoodscategorySignwithoutMe(@Param("goodsCategoryTid") String goodsCategoryTid, @Param("sign") String sign) {
        return 0;
    }

    @Override
    public List<GoodsCategory> findGoodscategoryByparentId(@Param("state") String state, @Param("parentId") String parentId) {
        return null;
    }

    @Override
    public List<GoodsCategory> findGoodscategoryByparentIdnull(String state) {
        return null;
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryBycreatorid(String creatorid) {
        return null;
    }

    @Override
    public int updateHtmlPath(String goodsCategoryTid, String htmlpath) {
        return 0;
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategoryT(String state) {
        return null;
    }

    @Override
    public List<GoodsCategory> sortAllGoodsCategoryT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("state") String state, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public List<GoodsCategory> findAllCategoryByNoTrem() {
        return null;
    }
}
