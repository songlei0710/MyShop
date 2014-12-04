package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsType;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsTypeDao {
    /**
     * 批量删除商品类型
     *
     * @param list
     * @return
     */
    public int delGoodsTypeTN(String[] list);

    /**
     * 更新商品类型
     *
     * @param gtn
     * @return
     */
    public int updateGoodsTypeTN(GoodsType gtn);

    /**
     * 查询所有商品类型
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<GoodsType> findAllGoodsTypeTN(final int currentPage,
                                                final int lineSize);

    /**
     * 统计查询所有商品类型
     *
     * @return
     */
    public int countfindAllGoodsTypeTN();

    /**
     * 根据id获取商品类型
     *
     * @param goodstypetnid
     * @return
     */
    public List<GoodsType> findGoodsTypeTNById(String goodsTypeId);

    /**
     * 不分页查询所有商品类型
     *
     * @return
     */
    public List<GoodsType> findAllGoodsTypeTNNopage();

    /**
     * 根据不同排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<GoodsType> sortAllGoodsTypeTN(final int currentPage,
                                                final int lineSize, String queryString);

    /**
     * 根据参数统计搜索结果计数
     *
     * @param queryString
     * @return
     */
    public int countsortAllGoodsTypeTN(String queryString);

    /**
     * 根据商品类型名称获取记录
     *
     * @param name
     * @return
     */
    public List<GoodsType> findGoodsTypeTNByName(String name);
}
