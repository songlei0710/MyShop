package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Product;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface ProductDao {
    /**
     * 查询所有产品根据CreatorId
     * from ProductT as pt where pt.creatorid=:creatorid order by productid desc
     * @param currentPage
     * @param lineSize
     * @param creatorId
     * @return
     */
    public List<Product> findAllProductByCreatorId(final int currentPage, final int lineSize, final String creatorId);

    /**
     * 查询所有产品
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Product>findAllProduct(final int currentPage,final int lineSize);

    /**
     * 统计查询所有产品根据CreatorId
     * @param creatorid
     * @return
     */
    public int countFindAllProduct(String creatorId);
    /**
     * 统计查询所有货物
     * @return
     */
    public int countFineAllProduct();

    /**
     * 根据商品id获取货品数据
     * @param creatorId
     * @param goodsId
     * @return
     */
    public List<Product> findAllProductByGoodsId(String creatorId,String goodsId);

    /**
     * 更新产品
     * @param pt
     * @return
     */
    public int updateProduct(Product pt);

    /**
     * 根据productid查询产品
     * @param creatorId
     * @param productId
     * @return
     */
    public List<Product> findProductByProductId(String creatorId, String productId);

    /**
     * 根据 goodsid删除货品
     * @param goodsId
     * @param creatorId
     * @return
     */
    public int delProductBygoodsId(String goodsId, String creatorId);

    /**
     * 根据排序方式进行排序
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Product> sortAllProduct(final int currentPage, final int lineSize,String queryString);

    /**
     * 根据产品id删除产品
     * @param productId
     * @return
     */
    public int delProductByProductId(String productId);

    /**
     * 根据商品id获取货品列表
     * @param goodsId
     * @return
     */
    public List<Product> findProductByGoodsId(String goodsId);
    /**
     * 根据主键id获取货物记录
     * @param productId
     * @return
     */
    public Product findProductById(String productId);
    /**
     * 批量删除货物
     * @param strs
     * @return
     */
    public int delProduct(String[] strs);
    /**
     * 根据货物名称获取货物信息
     * @param productName
     * @param lineSize
     * @return
     */
    public List<Product> findProductByProductName(String productName,final int lineSize);
    /**
     *添加
     */
    public int addProduct(Product product);
}
