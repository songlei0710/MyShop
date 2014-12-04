package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Product;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface ProductDao {
    /**
     * 查询所有产品
     *
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @return
     */
    public List<Product> findAllProductT(final int currentPage,
                                          final int lineSize, final String creatorid);

    /**
     * 查询所有货物
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Product>findAllProductT(final int currentPage,final int lineSize);

    /**
     * 统计查询所有产品
     *
     * @param creatorid
     * @return
     */
    public int countfindAllProductT(String creatorid);
    /**
     * 统计查询所有货物
     * @return
     */
    public int countfineAllProductT();

    /**
     * 根据商品id获取货品数据
     *
     * @param creatorid
     * @param goodsid
     * @return
     */
    public List<Product> findAllProductTByGoodsid(String creatorid,
                                                   String goodsid);

    /**
     * 根据productid更新产品
     *
     * @param pt
     * @return
     */
    public void  updateProductT(Product pt);

    /**
     * 根据productid查询产品
     *
     * @param creatorid
     * @param productid
     * @return
     */
    public List<Product> findProductTByproductid(String creatorid,
                                                  String productid);

    /**
     * 根据 goodsid删除货品
     *
     * @param goodsid
     * @param creatorid
     * @return
     */
    public int delProductTBygoodsid(String goodsid, String creatorid);

    /**
     * 根据排序方式进行排序
     *
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @param queryString
     * @return
     */
    public List<Product> sortAllProductT(final int currentPage,
                                          final int lineSize,String queryString);

    /**
     * 根据产品id删除产品
     *
     * @param productid
     * @return
     */
    public int delProductTByproductid(String productid);

    /**
     * 根据商品id获取货品列表
     *
     * @param goodsid
     * @return
     */
    public List<Product> findProductTByGoodsid(String goodsid);
    /**
     * 根据主键id获取货物记录
     * @param productid
     * @return
     */
    public Product findProductByProductid(String productid);
    /**
     * 批量删除货物
     * @param strs
     * @return
     */
    public int delProductT(String []strs);
    /**
     * 根据货物名称获取货物信息
     * @param productName
     * @param lineSzie
     * @return
     */
    public List<Product>findProductByproductName(String productName,final int lineSize);
}
