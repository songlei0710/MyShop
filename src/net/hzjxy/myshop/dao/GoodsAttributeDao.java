package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsAttribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 赵翠翠 on 2014/12/4.
 */
public interface GoodsAttributeDao {
    /**
     * 更新商品参数
     * @param gat
     * @return
     */
    public int updateGoodsAttribute(GoodsAttribute gat);

    /**
     * 根据goodstypeid获取参数
     * @param goodsTypeId
     * @return
     */
    public GoodsAttribute findGoodsAttributeBygoodsTypeId(String goodsTypeId);

    /**
     * 获取所有的商品参数
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<GoodsAttribute> findAllGoodsAttribute(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

    /**
     * 统计所有的商品参数
     * @return
     */
    public int countFindAllGoodsAttribute();

    /**
     * 删除商品参数
     * @param list
     * @return
     */
    public int delGoodsAttribute(String[] list);

    /**
     * 根据商品类型名称获取商品属性参数
     * @param goodsTypeName
     * @return
     */
    public List<GoodsAttribute> findGoodsAttributeByGoodsTypeName(String goodsTypeName);

    /**
     * 根据商品类型名称获取商品属性参数
     * @param goodsTypeId
     * @return
     */
    public List<GoodsAttribute> findGoodsAttributeByGoodsTypeId(String goodsTypeId);

    /**
     * 根据参数统计搜索结果计数
     * @param queryString
     * @return
     */
    public int countSortAllGoodsAttribute(String queryString);

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<GoodsAttribute> sortAllGoodsAttribute(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, @Param("queryString") String queryString);

    /**
     * 更新商品参数表中的商品类型名称
     * @param goodsTypeName
     * @param goodsTypeId
     * @return
     */
    public int updateGoodsAttributeGoodsTypeName(@Param("goodsTypeName") String goodsTypeName, @Param("goodsTypeId") String goodsTypeId);

    /**
     * 根据id更新是否支持检索
     * @param goodsattributeId
     * @param isSearch
     * @return
     */
    public int updateGoodsAttributeIsSearchByGoodsAttributeId(@Param("goodsattributeId") String[] goodsattributeId, @Param("isSearch") String isSearch);

    /**
     * 根据id更新是否支持关联检索
     * @param goodsAttributeId
     * @param isSameToLink
     * @return
     */
    public int updateGoodsAttributeIsSameToLinkByGoodsAttributeId(@Param("goodsAttributeId") String[] goodsAttributeId, @Param("isSameToLink") String isSameToLink);

}
