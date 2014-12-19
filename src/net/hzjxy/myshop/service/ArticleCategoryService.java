package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.Article;
import net.hzjxy.myshop.entity.ArticleCategory;

import java.util.List;

/**
 * Created by Administrator on 2014/12/16.
 */
public interface ArticleCategoryService {
    /**
     * 获取父路径数据
     * @param parentId
     * @return
     */
    public ArticleCategory findPathParentIdByParentId(String parentId);

    /**
     * 根据ParentId获取文章分类
     * @param status
     * @param parentId
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByParentId(String status,String parentId);

    /**
     * 根据分类级数获取文章分类
     * @param grade
     * @param status
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByGrade(String grade,String status);

    /**
     * 检测文章分类名称
     * @param name
     * @return
     */
    public int checkArticleCategoryName(String name);

    /**
     * 检测文章分类标记
     * @param sign
     * @return
     */
    public int checkArticleCateGorySign(String sign);

    /**
     * 删除文章分类
     * @param list
     */
    public void delArticleCategory(String[] list);

    /**
     * 获取所有激活的文章分类status=1
     * @param currentPage
     * @param lineSize
     * @param status
     * @return
     */
    public List<ArticleCategory> findAllArticleCategory(final int currentPage,final int lineSize,final String status);

    /**
     * 统计所有激活的文章分类个数
     * @param status
     * @return
     */
    public int countFindAllArticleCategory(String status);

    /**
     * 根据分类级数获取文章分类
     * @param currentPage
     * @param lineSize
     * @param status
     * @param grade
     * @return
     */
    public List<ArticleCategory> findAllArticleCategoryByGrade(final int currentPage,final int lineSize,final String status,final String grade);

    /**
     * 统计根据分类级数获取文章分类的个数
     * @param grade
     * @param status
     * @return
     */
    public int countFindAllArticleCategoryByGrade(String grade,String status);

    /**
     * 根据分类Id获取文章分类
     * @param articleCategoryId
     * @return
     */
    public ArticleCategory findArticleCategoryByArticleCategoryId(String articleCategoryId);

    /**
     * 根据parentId是null获取文章分类
     * @param status
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByParentIdNull(String status);


    /**
     * 根据position获取文章分类
     * @param lineSize
     * @param status
     * @param position
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByPosition(final int lineSize,String status,String position);

    /**
     * 根据排序方式进行排序
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<ArticleCategory> sortAllArticleCategory(final int currentPage,final int lineSize,String queryString);

}
