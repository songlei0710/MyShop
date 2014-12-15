package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsUnit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface GoodsUnitDao {
    /**
     * 删除商品单位
     *
     * @param list
     * @return
     */
    public int delGoodsunit(@Param("list") String[] list);

    /**
     * 更新商品单位
     *
     * @param u
     * @return
     */
    public int updateGoodsunit(@Param("u") GoodsUnit u);

    /**
     * 查询所有商品单位
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<GoodsUnit> findAllGoodsunit(final @Param("currentPage") int currentPage,
                                            final @Param("lineSize") int lineSize);

    /**
     * 统计所有商品单位
     *
     * @return
     */
    public int countfindAllGoodsunit();

    /**
     * 根据id获取商品单位
     *
     * @param unitid
     * @return
     */
    public GoodsUnit findGoodsunitById(@Param("unitid") String unitid);

    /**
     * 查询所有商品单位json方式
     *
     * @return
     */
    public List<GoodsUnit> findAllGoodsunitjson();

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<GoodsUnit> sortAllGoodsnit(final @Param("currentPage") int currentPage,
                                           final @Param("lineSize") int lineSize, @Param("queryString") String queryString);
    public int add(@Param("goodsUnit") GoodsUnit goodsUnit);
}
