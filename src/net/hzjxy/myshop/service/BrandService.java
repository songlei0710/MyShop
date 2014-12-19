package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.Brand;
import net.hzjxy.myshop.entity.GoodsTypeBrand;

import java.util.List;

/**
 * Created by 磊 on 2014/11/30.
 */
public interface BrandService {
    /**
     * 删除商品品牌
     * @param list
     */
    public void delBrand(String[] list);

    /**
     * 查询所有商品品牌
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Brand> findAllBrands(final int currentPage,final int lineSize);

    /**
     * 统计所有品牌的个数
     * @return
     */
    public int countFindAllBrands();

    /**
     * 根据Id获取商品品牌
     * @param brandId
     * @return
     */
    public Brand findBrandById(String brandId);

    /**
     * 根据排序字段按照排序方式排序
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Brand> sortAllBrands(final int currentPage,final int lineSize,final String queryString);

    /**
     * 保存品牌及商品品牌和商品类型的关系
     * @param brand
     * @param goodsTypeBrand
     */
    public void saveBrand(Brand brand,GoodsTypeBrand goodsTypeBrand);

}
