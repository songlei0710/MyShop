package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.ProductSpecification;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface ProductSpecificationDao {
    /**
     * 更新商品规格
     * @param pst
     */
    public int updateProductSpecification(ProductSpecification pst);

    /**
     * 根据规格id获取规格值
     * @param specificationId 商品规格Id
     * @return
     */
    public ProductSpecification findProductSpecificationsBySpecificationId(String specificationId);

    /**
     * 查询所有商品规格
     * @param currentPage 当前第几页
     * @param lineSize 每页条数
     * @return
     */
    public List<ProductSpecification> findAllProductSpecification(final int currentPage, final int lineSize);

    /**
     * 统计查询所有商品规格个数
     * @return
     */
    public int countFindAllProductSpecification();

    /**
     * 删除商品规格
     * @param list
     * @return
     */
    public int delProductSpecification(String[] list);

    /**
     * 根据状态获取规格值 from ProductSpecificationsT as pst where pst.state=:state order by createtime desc
     * @param state
     * @return
     */
    public List<ProductSpecification> findAllProductSpecificati(String state);

    /**
     * 根据排序方式进行排序
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<ProductSpecification> sortAllProductSpecification(final int currentPage, final int lineSize, String queryString);
    /**
     * 根据商品类型获取规格值信息
     * from ProductSpecificationsT as pst where pst.goodsTypeId=:goodsTypeId and pst.state=:state order by createtime desc
     * @param goodsTypeId
     * @return
     */
    public List<ProductSpecification> findAllProductSpecificationByGoodsTypeId(String goodsTypeId,String state);
    /**
     * 添加
     */
    public int addProductSpecification(PaymentDao paymentDao);
}
