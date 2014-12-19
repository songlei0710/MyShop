package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.ArticleDao;
import net.hzjxy.myshop.entity.Article;
import net.hzjxy.myshop.service.ArticleService;

import java.util.List;

/**
 * Created by Administrator on 2014/12/19.
 */
public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao;
    public ArticleDao getArticleDao() {
        return articleDao;
    }
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Override
    public void delArticle(String[] list) {
        this.getArticleDao().delArticle(list);
    }

    @Override
    public int findAllArticles(int currentPage, int lineSize) {
        this.getArticleDao().findAllArticles(currentPage,lineSize);
        return 0;
    }

    @Override
    public int countFindAllArticle() {
        return 0;
    }

    @Override
    public int updateArticle(Article article) {
        return 0;
    }

    @Override
    public int updateHtmlPath(String articleId, String htmlPath) {
        return 0;
    }

    @Override
    public List<Article> findAllArticlesByStatus(String status) {
        return null;
    }

    @Override
    public List<Article> sortAllArticles(int currentPage, int lineSize, String queryString) {
        return null;
    }

    @Override
    public int updateArticlePositionByArticleCategoryId(String articleCategoryId, String position) {
        return 0;
    }

    @Override
    public int delArticle(String articleId) {
        return 0;
    }

    @Override
    public List<Article> findArticlesByNavId(String navId, String status) {
        return null;
    }

    @Override
    public List<Article> findArticlesByLTypeId(String lTypeId, String status) {
        return null;
    }

    @Override
    public List<Article> findArticlesBySTypeId(String sTypeId, String status) {
        return null;
    }
}
