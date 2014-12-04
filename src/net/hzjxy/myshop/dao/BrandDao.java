package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Brand;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface BrandDao {
    /**
     * 删除商品品牌
     *
     * @param brandid
     * @return
     */
    public void delBrandt(String[] list, String creatorid);

    /**
     * 更新商品品牌
     *
     * @param bt
     * @return
     */
    public void updateBrandt(Brand bt);

    /**
     * 查询所有商品品牌
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Brand> findAllBrandt(final int currentPage,
                                      final int lineSize, final String creatorid);

    /**
     * 统计所有商品品牌
     *
     * @return
     */
    public int countfindAllBrandt(String creatorid);

    /**
     * 根据id获取商品品牌
     *
     * @param brandid
     * @return
     */
    public Brand findBrandById(String brandid);

    /**
     * 查询所有商品品牌json方式
     *
     * @return
     */
    public List<Brand> findAllBrandt();

    /**
     * 根据排序字段按照排序方式排序
     *
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @param queryString
     * @return
     */
    public List<Brand> sortAllBrandt(final int currentPage,
                                      final int lineSize, final String creatorid, final String queryString);
}
