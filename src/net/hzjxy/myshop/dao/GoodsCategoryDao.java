package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsCategory;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsCategoryDao {
    /**
     * 获取父路径数据
     *
     * @param parentId
     * @return
     */
    public GoodsCategory findPathParentIdByParentId(String parentId);

    /**
     * 根据分类级数获取商品分类
     *
     * @param state
     * @param grade
     * @return
     */
    public List<GoodsCategory> findGoodsCategoryByGrade(String grade,
                                                         String state);

    /**
     * 检测商品分类名称
     *
     * @param name
     * @return
     */
    public int checkGoodscategoryName(String name);

    /**
     * 检测商品分类标记
     *
     * @param sign
     * @return
     */
    public int checkGoodscategorySign(String sign);

    /**
     * 删除商品分类state=0
     *
     * @param goodscategoryid
     */
    public int delGoodscategoryT(String goodsCategoryTid, String state);

    /**
     * 删除商品分类
     *
     * @param strs
     * @return
     */
    public int delGoodscategoryT(String strs[]);

    /**
     * 更新商品分类
     *
     * @param gct
     */
    public int updateGoodscategoryT(GoodsCategory gct);

    /**
     * 获取所有激活的商品分类state=1
     *
     * @param currentPage
     * @param lineSize
     * @param state
     * @return
     */
    public List<GoodsCategory> findAllGoodsCategoryT(final int currentPage,
                                                      final int lineSize, final String state);

    /**
     * 统计所有激活的商品分类
     *
     * @param state
     * @return
     */
    public int countfindAllGoodsCategoryT(String state);

    /**
     * 根据分类级数获取商品分类
     *
     * @param currentPage
     * @param lineSize
     * @param grade
     * @param state
     * @return
     */
    public List<GoodsCategory> findAllGoodsCategoryTByGrade(
            final int currentPage, final int lineSize, final String grade,
            final String state);

    /**
     * 统计根据分类级数获取商品分类
     *
     * @param grade
     * @param state
     * @return
     */
    public int countfindAllGoodsCategoryTByGrade(String grade, String state);

    /**
     * 根据分类id获取商品分类
     *
     * @param goodsCategoryTid
     * @return
     */
    public GoodsCategory findGoodscategoryBygoodscategoryId(
            String goodsCategoryTid);

    /**
     * 排除自己获取商品分类名称
     *
     * @param goodsCategoryTid
     * @param name
     * @return
     */
    public int checkGoodscategoryNamewithoutMe(String goodsCategoryTid,
                                               String name);

    /**
     * 排除自己检测商品分级
     *
     * @param goodsCategoryTid
     * @param sign
     * @return
     */
    public int checkGoodscategorySignwithoutMe(String goodsCategoryTid,
                                               String sign);

    /**
     * 根据parentid获取商品分类
     *
     * @param state
     * @param parentId
     * @return
     */
    public List<GoodsCategory> findGoodscategoryByparentId(String state,
                                                            String parentId);

    /**
     * 获取parentid null的商品分类
     *
     * @param state
     * @return
     */
    public List<GoodsCategory> findGoodscategoryByparentIdnull(String state);

    /**
     * 根据用户id获取所有商品分类
     *
     * @param creatorid
     * @return
     */
    public List<GoodsCategory> findAllGoodsCategoryBycreatorid(String creatorid);

    /**
     * 更新商品分类静态页路劲
     *
     * @param goodscategoryId
     * @param htmlPath
     * @return
     */
    public int updateHtmlPath(String goodsCategoryTid, String htmlpath);

    /**
     * 获取所有激活的商品分类state=1
     *
     * @param currentPage
     * @param lineSize
     * @param state
     * @return
     */
    public List<GoodsCategory> findAllGoodsCategoryT(String state);

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param state
     * @param queryString
     * @return
     */
    public List<GoodsCategory> sortAllGoodsCategoryT(final int currentPage,
                                                      final int lineSize, final String state, String queryString);

    /**
     * 查询所有没有条件商品分类
     *
     * @return
     */
    public List<GoodsCategory> findAllCategoryByNoTrem();
}
