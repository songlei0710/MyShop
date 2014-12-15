package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface CartDao {
    /**
     * 查询所有购物车 后台
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Cart> findAllCart(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

    /**
     * 统计查询所有购物车 后台
     *
     * @return
     */
    public void countfindAllCart();

    /**
     * 根据userid查询购物车内容 前台
     *
     * @param userid
     * @param state
     *            商品在购物车中的状态
     * @param orderTag
     *            商品的类型是虚拟还是普通
     * @return
     */
    public List<Cart> findAllCartByUserId(@Param("userid") String userid, @Param("state") String state,
                                           @Param("orderTag") String orderTag);



    /**
     * 查询商品是否已经在购物车中
     *
     * @param userid
     * @param goodsid
     * @param state
     *            1表示新增，2表示删除，3表示已经和订单对应
     * @return
     */
    public Cart findGoodsInCartOrNot(@Param("userid") String userid, @Param("goodsid") String goodsid,
                                      @Param("state") String state);

    /**
     * 查询商品是否已经在购物车中
     *
     * @param userid
     * @param goodsid
     * @param state
     *            1表示新增，2表示删除，3表示已经和订单对应
     * @param productid
     * @return
     */
    public Cart findGoodsInCartOrNot(@Param("userid") String userid, @Param("goodsid") String goodsid,
                                      String productid, @Param("state") String state);

    /**
     * 更新购物车中的商品数量
     *
     * @param userid
     * @param goodsid
     * @param needquantity
     * @return
     */
    public int updateCartNeedquantityByGoodsid(@Param("userid") String userid, @Param("goodsid") String goodsid,
                                               @Param("needquantity") int needquantity, @Param("state") String state);

    /**
     * 更新购物车中的商品数量
     *
     * @param userid
     * @param goodsid
     * @param needquantity
     * @param productid
     * @return
     */
    public int updateCartNeedquantityByGoodsid(@Param("userid") String userid, @Param("goodsid") String goodsid,
                                               @Param("productid") String productid, @Param("needquantity") int needquantity, @Param("state") String state);

    /**
     * 减少需要的商品数量
     *
     * @param userid
     * @param goodsid
     * @param needquantity
     * @return
     */
    public int reduceCartNeddquantityByGoodsid(@Param("userid") String userid, @Param("goodsid") String goodsid,
                                               @Param("needquantity") int needquantity);

    /**
     * 删除购物车商品加入state=1的条件表示只会删除新增加入的商品会在购物车中删除时生效。
     *
     * @param userid
     * @param goodsid
     * @param state
     * @return
     */
    public int delCartByGoodsId(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("state") String state);

    /**
     * 更新购物车商品数量
     *
     * @param userid
     * @param goodsid
     * @param needquantity
     * @return
     */
    public int updateCartNeedquantity(@Param("userid") String userid, @Param("goodsid") String goodsid,
                                      @Param("needquantity") int needquantity);

    /**
     * 更新商品价格小计
     *
     * @param userid
     * @param goodsid
     * @param subtotal
     * @return
     */
    public int updateCartSubtotal(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("subtotal") double subtotal);

    /**
     * 更新购物车中商品状态
     *
     * @param userid
     * @param goodsid
     * @param state
     * @return
     */
    public int updateCartState(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("state") String state);

    /**
     * 更新购物车中的商品状态，根据商品id集合,并作订单更新
     *
     * @param userid
     * @param goodsid
     * @param state
     * @param orderid
     * @param cartid
     * @returnString []goodsid
     */
    public int updateCartStateandOrderidByGoodsidList(@Param("cartid") String cartid,
                                                      @Param("orderid") String orderid, @Param("userid") String userid, @Param("state") String state);

    /**
     * 更新购物车中的商品状态，根据商品id集合
     *
     * @param userid
     * @param goodsid
     * @param state
     * @return
     */
    public int updateCartStateByGoodsidList(@Param("userid") String userid, @Param("goodsid") String[] goodsid,
                                            @Param("state") String state);

    /**
     * 根据订单号在购物车中查询对应的商品记录
     *
     * @param orderid
     * @return
     */
    public List<Cart> findCartGoodsByOrderid(String orderid);

    /**
     * 根据goodsid更新购物车id，表示次购物车下的商品同属一个购物车
     *
     * @param memberid
     * @param goodsid
     * @param state
     * @return
     */
    public int updateCartIdBygoodsid(@Param("cartid") String cartid, @Param("memberid") String memberid,
                                     @Param("goodsid") String goodsid, @Param("state") String state);

    /**
     * 根据productid更新购物车id，表示次购物车下的商品同属一个购物车
     *
     * @param cartid
     * @param userid
     * @param productid
     * @param state
     * @return
     */
    public int updateCartIdByproductid(@Param("cartid") String cartid, @Param("userid") String userid,
                                       @Param("productid") String productid, @Param("state") String state);

    /**
     * 检查被加入订单的购物车商品是否已经有订单号，如果有则不再更新订单号，防止多次提交订单操作，导致订单异常
     *
     * @param state
     *            =3
     * @param cartid
     * @return
     */
    public List<Cart> findCartByCartid(@Param("cartid") String cartid, @Param("state") String state);

    /**
     * 根据购物车id删除购物车
     *
     * @param id
     * @return
     */
    public int delCartByid(String id);

    /**
     * 查询购物车中是否存在该货物
     * @param memberid
     * @param productid
     * @param goodsid
     * @param state
     * @return
     */
    public Cart findProductInCart(@Param("memberid") String memberid, @Param("goodsid") String goodsid, @Param("productid") String productid, @Param("state") String state);

    /**
     * 根据memberid查询购物车内容 前台
     *
     * @param userid
     * @param state
     *            商品在购物车中的状态
     * @param orderTag
     *            商品的类型是虚拟还是普通
     * @return
     */
    public List<Cart> findAllCartByMemberId(@Param("memberid") String memberid, @Param("state") String state,
                                             @Param("orderTag") String orderTag);
}
