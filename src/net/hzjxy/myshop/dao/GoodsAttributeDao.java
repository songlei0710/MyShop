package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsAttribute;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsAttributeDao {
    /**
     * 更新商品参数
     *
     * @param gat
     * @return
     */
    public int updateGoodsAttributeT(GoodsAttribute gat);

    /**
     * 根据goodstypeid获取参数
     *
     * @param goodsattributeid
     * @return
     */
    public GoodsAttribute findGoodsAttributeTBygoodstypeId(String goodstypeid);

    /**
     * 获取所有的商品参数
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<GoodsAttribute> findAllGoodsAttributeT(final int currentPage,
                                                        final int lineSize);

    /**
     * 统计说去所有的商品参数
     *
     * @return
     */
    public int countfindAllGoodsAttributeT();

    /**
     * 删除商品参数
     *
     * @param list
     * @return
     */
    public int delGoodsAttributeT(String[] list);

    /**
     * 根据商品类型名称获取商品属性参数
     *
     * @param goodsTypeName
     * @return
     */
    public List<GoodsAttribute> findGoodsAttributeTByGoodsTypeName(
            String goodsTypeName);

    /**
     * 根据商品类型名称获取商品属性参数
     *
     * @param goodsTypeName
     * @return
     */
    public List<GoodsAttribute> findGoodsAttributeTBygoodsTypeId(
            String goodsTypeId);

    /**
     * 根据参数统计搜索结果计数
     *
     * @param queryString
     * @return
     */
    public int countsortAllGoodsAttributeT(String queryString);

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<GoodsAttribute> sortAllGoodsAttributeT(final int currentPage,
                                                        final int lineSize, String queryString);

    /**
     * 更新商品参数表中的商品类型名称
     *
     * @param goodsTypeName
     * @param goodsTypeId
     * @return
     */
    public int updateGoodsAttributeTgoodsTypeName(String goodsTypeName,
                                                  String goodsTypeId);

    /**
     * 根据id更新是否支持检索
     *
     * @param goodsattributeid
     * @param issearch
     * @return
     */
    public int updateGoodsAttributeissearchBygoodsattributeid(
            String[] goodsattributeid, String issearch);

    /**
     * 根据id更新是否支持关联检索
     *
     * @param goodsattributeid
     * @param issametolink
     * @return
     */
    public int updateGoodsAttributeissametolinkBygoodsattributeid(
            String[] goodsattributeid, String issametolink);

}
