package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.ArticleCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章分类Dao
 * Created by Administrator on 2014/12/4.
 */
public interface ArticleCategoryDao {
    /**
     * 获取父路径数据
     * @param parentId 父路径Id
     * @param creatorId 创建者Id
     * @return
     */
    public ArticleCategory findPathParentIdByParentId(@Param("parentId") String parentId, @Param("creatorId") String creatorId);

    /**
     * 根据分类级数获取文章分类
     * @param grade
     * @param status
     * @param creatorId
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByGrade(@Param("grade") String grade, @Param("status") String status, @Param("creatorId") String creatorId);

    /**
     * 检测文章分类名称
     * @param name
     * @param creatorId
     * @return
     */
    public ArticleCategory checkArticleCategoryName(@Param("name") String name, @Param("creatorId") String creatorId);

    /**
     * 检测文章分类名称
     * @param name
     * @return
     */
    public ArticleCategory checkArticleCategoryName(String name);

    /**
     * 检测文章分类标记
     * @param sign
     * @param creatorId
     * @return
     */
    public ArticleCategory checkArticleCategorySignByCreateId(@Param("sign") String sign, @Param("creatorId") String creatorId);

    /**
     * 检测文章分类标记
     * @param sign
     * @return
     */
    public ArticleCategory checkArticleCategorySign(String sign);

    /**
     * 删除文章分类status=0
     * @return
     */
    public void delArticleCategory(ArticleCategory act);
    /**
     * 删除文章分类
     * @param strs
     * @return
     */
    public void delArticleCategory(String strs[]);

    /**
     * 获取所有激活的文章分类status=1
     * @param currentPage
     * @param status
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> findAllArticleCategoryT(final int currentPage, final String status, final String creatorid);

    /**
     * 统计所有激活的文章分类
     * @param status
     * @param creatorid
     * @return
     */
    public int countfindAllArticleCategoryT(@Param("status") String status, @Param("creatorid") String creatorid);

    /**
     * 根据分类级数获取文章分类
     * @param currentPage
     * @param status
     * @param grade
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> findAllArticleCategoryTByGrade(final int currentPage, final String status, final String grade, final String creatorid);

    /**
     * 统计根据分类级数获取文章分类
     * @param grade
     * @param status
     * @param creatorid
     * @return
     */
    public int countfindAllArticleCategoryTByGrade(@Param("grade") String grade, @Param("status") String status, @Param("creatorid") String creatorid);

    /**
     * 根据分类id获取文章分类
     *
     * @param articleCategoryTid
     * @return
     */
    public ArticleCategoryDao findArticleCategoryByarticleCategoryTid(
            String articleCategoryTid);

    /**
     * 排除自己获取文章分类名称
     *
     * @param articleCategoryTid
     * @param name
     * @param creatorid
     * @return
     */
    public int checkArticleCategoryNamewithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("name") String name, @Param("creatorid") String creatorid);
    /**
     * 排除自己获取文章分类名称
     *
     * @param articleCategoryTid
     * @param name
     * @param creatorid
     * @return
     */
    public int checkArticleCategoryNamewithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("name") String name);
    /**
     * 排除自己检测文章标记
     *
     * @param articleCategoryTid
     * @param sign
     * @param creatorid
     * @return
     */
    public int checkArticleCategorySignwithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("sign") String sign);
    /**
     * 排除自己检测文章标记
     *
     * @param articleCategoryTid
     * @param sign
     * @param creatorid
     * @return
     */
    public int checkArticleCategorySignwithoutMe(@Param("articleCategoryTid") String articleCategoryTid, @Param("sign") String sign, @Param("creatorid") String creatorid);

    /**
     * 根据parentId获取文章分类
     *
     * @param status
     * @param parentId
     * @param creatroid
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByparentId(@Param("status") String status,
                                                                @Param("parentId") String parentId, @Param("creatorid") String creatorid);

    /**
     * 根据parentId 是 null获取文章分类
     *
     * @param status
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByparentIdnull(
            @Param("status") String status, @Param("creatorid") String creatorid);

    /**
     * 根据用户id获取所有文章分类
     *
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> findAllArticleCategoryBycreatorid(
            String creatorid);

    /**
     * 根据position获取文章分类
     *
     * @param position
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByposition(
            final @Param("lineSize") int lineSize, @Param("status") String status, @Param("position") String position, @Param("creatorid") String creatorid);

    /**
     * 根据position获取文章分类无用户id
     *
     * @param position
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByposition(final int lineSize, String status, String position);

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param status
     * @param creatorid
     * @return
     */
    public List<ArticleCategory> sortAllArticleCategoryT(
            final String currentPage, final int lineSize, final int status,
            final String creatorid, String queryString);

    /**
     * 根据分类级数获取文章分类无用户id
     *
     * @param grade
     * @param state
     * @return
     */
    public List<ArticleCategory> findArticleCategoryByGrade(@Param("grade") String grade, @Param("status") String status);

    /**
     * 根据parentid获取文章分类
     * @param parentId
     * @param status
     * @return
     */
    public List<ArticleCategory>findArticleCategoryByparentId(@Param("status") String status);



}
