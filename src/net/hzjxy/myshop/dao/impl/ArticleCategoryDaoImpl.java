package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.ArticleCategoryDao;
import net.hzjxy.myshop.entity.ArticleCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by wx on 2014/12/13.
 */
public abstract class ArticleCategoryDaoImpl  implements ArticleCategoryDao {
    @Override
    public ArticleCategory findPathParentIdByParentId(String parentId, String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        ArticleCategory articleCategory=articleCategoryDao.findPathParentIdByParentId(parentId,creatorId);
        return articleCategory;
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByGrade(String grade, String status, String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao= session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByGrade(grade,status,creatorId);
        return articleCategories;
    }

    @Override
    public ArticleCategory checkArticleCategoryName(String name, String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        ArticleCategory articleCategory=articleCategoryDao.checkArticleCategoryName(name,creatorId);
        return articleCategory;
    }

    @Override
    public ArticleCategory checkArticleCategoryName(String name) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        ArticleCategory articleCategory=articleCategoryDao.checkArticleCategoryName(name);
        return articleCategory;
    }

    @Override
    public ArticleCategory checkArticleCategorySignByCreateId(String sign, String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        ArticleCategory articleCategory=articleCategoryDao.checkArticleCategoryName(sign,creatorId);
        return articleCategory;
    }

    @Override
    public ArticleCategory checkArticleCategorySign(String sign) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        ArticleCategory articleCategory=articleCategoryDao.checkArticleCategoryName(sign);
        return articleCategory;
    }

    @Override
    public void delArticleCategory(ArticleCategory act) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        articleCategoryDao.delArticleCategory( act);
        session.commit();
        return;
    }

    @Override
    public void delArticleCategory(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        articleCategoryDao.delArticleCategory(strs);
        session.commit();
        return ;
    }

    @Override
    public List<ArticleCategory> findAllArticleCategoryT(int currentPage, String status, String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findAllArticleCategoryT(currentPage,status,creatorid);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findAllArticleCategoryTByGrade(int currentPage, String status, String grade, String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findAllArticleCategoryTByGrade(currentPage,status,grade,creatorid);
        return articleCategories;
    }

    @Override
    public int countfindAllArticleCategoryT(@Param("status") String status, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        articleCategoryDao.countfindAllArticleCategoryT(status,creatorid);
        return articleCategoryDao.countfindAllArticleCategoryT(status,creatorid);
    }

    @Override
    public int countfindAllArticleCategoryTByGrade(@Param("grade") String grade, @Param("status") String status, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        articleCategoryDao.countfindAllArticleCategoryTByGrade(grade,status,creatorid);
        return articleCategoryDao.countfindAllArticleCategoryTByGrade(grade,status,creatorid);
    }

    @Override
    public ArticleCategoryDao findArticleCategoryByarticleCategoryTid(String articleCategoryTid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        articleCategoryDao.findArticleCategoryByarticleCategoryTid(articleCategoryTid);
        return articleCategoryDao;
    }

    @Override
    public int checkArticleCategoryNamewithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("name") String name, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,name,creatorid);
        return articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,name,creatorid);
    }

    @Override
    public int checkArticleCategoryNamewithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("name") String name) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,name);
        return articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,name);
    }

    @Override
    public int checkArticleCategorySignwithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("sign") String sign) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,sign);
        return articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,sign);
    }

    @Override
    public int checkArticleCategorySignwithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("sign") String sign, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper( ArticleCategoryDao.class);
        articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,sign,creatorid);
        return articleCategoryDao.checkArticleCategoryNamewithoutMe(articleCategoryTid,sign,creatorid);
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByparentId(@Param("status") String status, @Param("parentId") String parentId, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByparentId(status,parentId,creatorid);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByparentIdnull(@Param("status") String status, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByparentIdnull(status,creatorid);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findAllArticleCategoryBycreatorid(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByparentId(creatorid);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByposition(@Param("lineSize") int lineSize, @Param("status") String status, @Param("position") String position, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByposition(lineSize,status,position,creatorid);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByposition(int lineSize, String status, String position) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByposition(lineSize,status,position);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> sortAllArticleCategoryT(String currentPage, int lineSize, int status, String creatorid, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.sortAllArticleCategoryT(currentPage,status,lineSize,creatorid,queryString);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByGrade(@Param("grade") String grade, @Param("status") String status) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByGrade(grade,status);
        return articleCategories;
    }

    @Override
    public List<ArticleCategory> findArticleCategoryByparentId(@Param("status") String status) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleCategoryDao articleCategoryDao=session.getMapper(ArticleCategoryDao.class);
        List<ArticleCategory> articleCategories=articleCategoryDao.findArticleCategoryByparentId(status);
        return articleCategories;
    }

}
