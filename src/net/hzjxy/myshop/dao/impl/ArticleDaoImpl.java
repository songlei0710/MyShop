package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.ArticleDao;
import net.hzjxy.myshop.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

/**
 * Created by wx on 2014/12/15.
 */
public abstract class ArticleDaoImpl  implements ArticleDao {
    @Override
    public void delArticleT(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        articleDao.delArticleT(strs);
        session.commit();
        return ;
    }

    @Override
    public Article findArticleByarticleid(String articleid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.findArticleByarticleid(articleid);
        return article;
    }

    @Override
    public List<Article> findAllArticleT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findAllArticleT(currentPage,lineSize,creatorid);
        return articles;
    }

    @Override
    public List<Article> findAllArticleT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findAllArticleT(currentPage,lineSize);
        return articles;
    }

    @Override
    public Article countfindAllArticle(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.countfindAllArticle(creatorid);
        return article;
    }

    @Override
    public Article countfindAllArticle() {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.countfindAllArticle();
        return article;
    }

    @Override
    public Article updateArticleT(Article at) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.updateArticleT(at);
        return article;
    }

    @Override
    public Article updateHtmlPath(@Param("articleid") String articleid, @Param("htmlPath") String htmlPath) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.updateHtmlPath(articleid,htmlPath);
        return article;
    }

    @Override
    public Article updateHtmlPath(@Param("articleid") String articleid, @Param("htmlPath") String htmlPath, @Param("updatetime") Date updatetime) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.updateHtmlPath(articleid,htmlPath,updatetime);
        return article;
    }

    @Override
    public List<Article> findAllArticleBycreatorid(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findAllArticleBycreatorid(creatorid);
        return articles;
    }

    @Override
    public List<Article> findAllArticleT(String status) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findAllArticleT(status);
        return articles;
    }

    @Override
    public List<Article> sortAllArticleT(int currentPage, int lineSize, String creatorid, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.sortAllArticleT(currentPage,lineSize,creatorid,queryString);
        return articles;
    }

    @Override
    public Article updateArticlepositionByarticleCategoryTid(@Param("articleCategoryTid") String articleCategoryTid, @Param("position") String position) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        Article article=articleDao.updateArticlepositionByarticleCategoryTid(articleCategoryTid,position);
        return article;
    }

    @Override
    public int delArticleT(String id) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        articleDao.delArticleT(id);
        session.commit();
        return articleDao.delArticleT(id);
    }

    @Override
    public List<Article> findArticlesByNavid(@Param("navid") String navid, @Param("status") String status) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findArticlesByNavid(navid,status);
        return articles;
    }

    @Override
    public List<Article> findArticlesByLtypeid(@Param("ltypeid") String ltypeid, @Param("status") String status) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findArticlesByLtypeid(ltypeid,status);
        return articles;
    }

    @Override
    public List<Article> findArticlesByStypeid(@Param("stypeid") String stypeid, @Param("status") String status) {
        SqlSession session=MybatisUtil.currentSession();
        ArticleDao articleDao=session.getMapper(ArticleDao.class);
        List<Article> articles=articleDao.findArticlesByStypeid(stypeid,status);
        return articles;
    }

}
