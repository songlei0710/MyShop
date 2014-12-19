package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.Article;

import java.util.List;

/**
 * Created by Administrator on 2014/12/19.
 */
public interface  ArticleService {
    /**
     * 批量删除文章
     * @param list
     */
    public void delArticle(String[] list);

    /**
     * 获取所有文章
     * @param currentPage
     * @param lineSize
     * @return
     */
    public void findAllArticles(final int currentPage, final int lineSize);

    /**
     * 统计所有文章的个数
     * @return
     */
    public int countFindAllArticle();

    /**
     * 更新文章
     * @param article
     * @return
     */
    public int updateArticle(Article article);

    /**
     * 更新文章静态页
     * @param articleId
     * @param htmlPath
     * @return
     */
    public int updateHtmlPath(String articleId,String htmlPath);

    /**
     * 根据status读取所有文章数据
     * @param status
     * @return
     */
    public List<Article> findAllArticlesByStatus(String status);

    /**
     * 根据排序方式进行排序
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Article> sortAllArticles(final int currentPage,final int lineSize,final String queryString);

    /**
     * 根据文章分类更新文章显示位置
     * @param articleCategoryId
     * @param position
     * @return
     */
    public int updateArticlePositionByArticleCategoryId(String articleCategoryId,String position);

    /**
     * 根据文章编号删除文章
     * @param articleId
     * @return
     */
    public int delArticle(String articleId);

    /**
     * 获取一级分类文章列表
     * @param navId
     * @param status
     * @return
     */
    public List<Article> findArticlesByNavId(String navId,String status);

    /**
     * 获取二级分类文章列表
     * @param lTypeId
     * @param status
     * @return
     */
    public List<Article> findArticlesByLTypeId(String lTypeId,String status);

    /**
     * 获取三级分类文章列表
     * @param sTypeId
     * @param status
     * @return
     */
    public List<Article> findArticlesBySTypeId(String sTypeId,String status);
}
