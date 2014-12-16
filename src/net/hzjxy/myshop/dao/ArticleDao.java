package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Article;
import org.apache.ibatis.annotations.Param;

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
     * 根据articleid获取文章;
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
    public List<Article> findAllArticleT(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, final @Param("creatorid") String creatorid);
    /**
     * 获取所有文章
     *
     * @param currentPage
     * @param lineSize
     * @param status
     * @param creatorid
     * @return
     */
    public List<Article> findAllArticleT(final @Param("currentPage") int currentPage,
                                          final @Param("lineSize") int lineSize);
    /**
     * 统计获取所有文章
     *
     * @param creatorid
     * @return
     */
    public Article countfindAllArticle(String creatorid);
    /**
     * 统计获取所有文章
     *
     * @return
     */
    public Article countfindAllArticle();

    /**
     * 更新文章
     *
     * @param at
     * @return
     */
    public Article updateArticleT(Article at);

    /**
     * 更新文章静态页
     *  @param articleid
     * @param htmlPath
     */
    public Article updateHtmlPath(@Param("articleid") String articleid, @Param("htmlPath") String htmlPath);

    /**
     * 更新文章静态页避免重复生成
     *
     * @param articleid
     * @param htmlPath
     * @param updatetime
     * @return
     */
    public Article updateHtmlPath(@Param("articleid") String articleid, @Param("htmlPath") String htmlPath, @Param("updatetime") Date updatetime);

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
    public Article updateArticlepositionByarticleCategoryTid(
            @Param("articleCategoryTid") String articleCategoryTid, @Param("position") String position);

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
    public List<Article>findArticlesByNavid(@Param("navid") String navid, @Param("status") String status);

    /**
     * 获取二级分类文章列表
     * @param ltypeid
     * @param status
     * @return
     */
    public List<Article>findArticlesByLtypeid(@Param("ltypeid") String ltypeid, @Param("status") String status);
    /**
     * 获取三级分类文章列表
     * @param stypeid
     * @param status
     * @return
     */
    public List<Article>findArticlesByStypeid(@Param("stypeid") String stypeid, @Param("status") String status);
}
