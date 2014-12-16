package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Orderr;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface OrderrDao {

    /**
     * 根据订单状态获取订单信息
     * from OrderT as o where o.orderstate!=:orderstate and o.memberid=:memberid and o.paystate=:paystate and o.shippingstate=:shippingstate order by purchasetime desc
     * @param currentPage
     * @param lineSize
     * @param memberId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public List<Orderr> findAllOrderByOrderState(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, final @Param("memberId") String memberId, final @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState);

    /**
     * 统计根据订单状态获取订单信息
     * @param memberId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int countFindAllOrderByOrderState(@Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState);

    /**
     * 用户删除自己订单
     * @param memberId
     * @param orderId
     * @param orderState
     * @return
     */
    public int delOrderByOrderId(@Param("memberId") String memberId, @Param("orderId") String orderId, @Param("orderState") String orderState);

    /**
     * 获取用户需要处理的订单，及包含paystate是1and0，shippingstate是1and0，orderstate不是8
     * from OrderT as o where o.orderstate!=:orderstate and o.memberid=:memberid and o.paystate!=:paystate and o.shippingstate!=:shippingstate order by purchasetime desc
     * @param currentPage
     * @param lineSize
     * @param memberId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public List<Orderr> findAllOrderByOrderStateForOn(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, final @Param("memberId") String memberId, final @Param("orderState") String orderState, final @Param("payState") String payState, final @Param("shippingState") String shippingState);

    /**
     * 统计获取用户需要处理的订单，及包含paystate是1and0，shippingstate是1and0，orderstate不是8
     * @param memberId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int countFindAllOrderByOrderStateForOn(@Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState);

    /**
     * 根据订单号获取订单详细信息
     * @param orderId
     * @return
     */
    public Orderr findOrderDetailByorderId(@Param("orderId") String orderId);

    /**
     * 更新订单
     * @param orderr
     * @return
     */
    public int updateOrder(Orderr orderr);

    /**
     * 支付宝返回数据，更新订单是否付款标记
     * @param orderId
     * @param payState
     * @return
     */
    public int updateOrderPayStateByOrderId(@Param("orderId") String orderId, @Param("payState") String payState);

    /**
     * 支付宝返回数据，更新订单是否发货
     * @param orderId
     * @param shippingState
     * @return
     */
    public int updateOrderShippingStateByOrderId(@Param("orderId") String orderId, @Param("shippingState") String shippingState);

    /**
     * 支付宝返回数据，更新订单状态
     * @param orderId
     * @param orderState
     * @return
     */
    public int updateOrderStateByOrderId(@Param("orderId") String orderId, @Param("orderState") String orderState);

    /**
     * 查询所有订单（后台）
     * from OrderT as o  order by purchasetime desc
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Orderr> findAllOrder(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);
    /**
     * 统计查询所有订单（后台）
     * @return
     */
    public int countFindAllOrder();

    /**
     * 根据订单id查询订单列表（其实就只能查出唯一的一条）
     * @param currentPage
     * @param lineSize
     * @param orderId
     * @return
     */
    public List<Orderr> findOrderByOrderId(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, final @Param("orderId") String orderId);

    /**
     * 统计根据订单id查询订单列表
     * @param orderId
     * @return
     */
    public int countFindOrderbyOrderId(@Param("orderId") String orderId);

    /**
     * 根据收货人查询订单
     * @param currentPage
     * @param lineSize
     * @param shippingUsername
     * @return
     */
    public List<Orderr> findOrderByShippingUsername(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, final @Param("shippingUsername") String shippingUsername);

    /**
     * 统计收货人查询订单
     * @param shippingUsername
     * @return
     */
    public int countFindOrderByShippingUsername(@Param("shippingUsername") String shippingUsername);

    /**
     * 更新订单状态，支付状态，发货状态
     * @param orderId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int updateOrderPayShippingState(@Param("orderId") String orderId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState);

    /**
     * 获取待发货订单
     * @param currentPage
     * @param lineSize
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public List<Orderr> findAllToBeShippedOrders(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState);

    /**
     * 统计获取待发货订单
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int countFindAllToBeShippedOrders(@Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState);

    /**
     * 更新订单快递单号
     * @param orderId
     * @param expressNumber
     * @return
     */
    public int updateExpressNumberByOrderId(@Param("orderId") String orderId, @Param("expressNumber") String expressNumber);

    /**
     * 更新发货单号
     * @param orderId
     * @param invoiceNumber
     * @param deliveryTime
     * @return
     */
    public int updateInvoiceNumberByOrderId(@Param("orderId") String orderId,
                                            @Param("invoiceNumber") String invoiceNumber, @Param("deliveryTime") Date deliveryTime);

    /**
     * 更新订单是否要开票
     * @param orderId
     * @param invoice
     * @return
     */
    public int updateInvoiceByOrderId(@Param("orderId") String orderId, @Param("invoice") String invoice);

    /**
     * 根据排序方式查询所有
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Orderr> selectAllOrder(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, @Param("queryString") String queryString);

    /**
     * 根据发货状态获取已发货商品
     * @param currentPage
     * @param lineSize
     * @param shippingState
     * @return
     */
    public List<Orderr> findAllHaveShippedOrder(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, @Param("shippingState") String shippingState);

    /**
     * 计算所有已发货订单
     * @param shippingState
     * @return
     */
    public int countAllHaveshippedOrder(@Param("shippingState") String shippingState);

    /**
     * 根据订单状态获取已退货商品
     * @param currentPage
     * @param lineSize
     * @param orderState
     * @return
     */
    public List<Orderr> findAllReturnOrder(final int currentPage, final int lineSize, String orderState);

    /**
     * 计算所有退货的订单
     * @param orderState
     * @return
     */
    public int countAllReturnOrder(String orderState);
    /**
     * 添加
     */
    public int addOrderr(Orderr orderr);
}
