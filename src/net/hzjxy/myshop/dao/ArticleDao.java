package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Article;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface ArticleDao {
    /**
     * 批量删除文章
     *
     * @param list
     * @return
     */
    public void delArticleT(String[] strs);

    /**
     * &#x6839;&#x636e;articleid&#x83b7;&#x53d6;&#x6587;&#x7ae0;
     *
     * @param articleid
     * @return
     */
    public Article findArticleByarticleid(String articleid);

    /**
     * 获取所有文章
     *
     * @param currentPage
     * @param lineSize
     * @param status
     * @param creatorid
     * @return
     */
    public List<Article> findAllArticleT(final int currentPage, final int lineSize, final String creatorid);
    /**
     * 获取所有文章
     *
     * @param currentPage
     * @param lineSize
     * @param status
     * @param creatorid
     * @return
     */
    public List<Article> findAllArticleT(final int currentPage,
                                          final int lineSize);
    /**
     * 统计获取所有文章
     *
     * @param creatorid
     * @return
     */
    public int countfindAllArticle(String creatorid);
    /**
     * 统计获取所有文章
     *
     * @return
     */
    public int countfindAllArticle();

    /**
     * 更新文章
     *
     * @param at
     * @return
     */
    public int updateArticleT(Article at);

    /**
     * 更新文章静态页
     *
     * @param articleid
     * @param htmlPath
     */
    public int updateHtmlPath(String articleid, String htmlPath);

    /**
     * 更新文章静态页避免重复生成
     *
     * @param articleid
     * @param htmlPath
     * @param updatetime
     * @return
     */
    public int updateHtmlPath(String articleid, String htmlPath, Date updatetime);

    /**
     * 根据用户id获取文章列表
     *
     * @param creatorid
     * @return
     */
    public List<Article> findAllArticleBycreatorid(String creatorid);

    /**
     * 根据status读取所有文章数据
     *
     * @param status
     * @return
     */
    public List<Article> findAllArticleT(String status);

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @param queryString
     * @return
     */
    public List<Article> sortAllArticleT(final int currentPage,
                                          final int lineSize, final String creatorid, final String queryString);

    /**
     * 根据文章分类跟新文章显示位置
     *
     * @param articleCategoryTid
     * @param position
     * @return
     */
    public int updateArticlepositionByarticleCategoryTid(
            String articleCategoryTid, String position);

    /**
     * 删除文章
     *
     * @param id
     * @return
     */
    public int delArticleT(String id);
    /**
     * 获取一级分类文章列表
     * @param navid
     * @param status
     * @return
     */
    public List<Article>findArticlesByNavid(String navid,String status);

    /**
     * 获取二级分类文章列表
     * @param ltypeid
     * @param status
     * @return
     */
    public List<Article>findArticlesByLtypeid(String ltypeid,String status);
    /**
     * 获取三级分类文章列表
     * @param stypeid
     * @param status
     * @return
     */
    public List<Article>findArticlesByStypeid(String stypeid,String status);
}
