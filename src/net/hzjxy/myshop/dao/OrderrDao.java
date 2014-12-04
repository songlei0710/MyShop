package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Orderr;

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
    public List<Orderr> findAllOrderByOrderState(final int currentPage, final int lineSize, final String memberId, final String orderState, String payState, String shippingState);

    /**
     * 统计根据订单状态获取订单信息
     * @param memberId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int countFindAllOrderByOrderState(String memberId, String orderState, String payState, String shippingState);

    /**
     * 用户删除自己订单
     * @param memberId
     * @param orderId
     * @param orderState
     * @return
     */
    public int delOrderByOrderId(String memberId, String orderId, String orderState);

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
    public List<Orderr> findAllOrderByOrderStateForOn(final int currentPage, final int lineSize, final String memberId, final String orderState, final String payState, final String shippingState);

    /**
     * 统计获取用户需要处理的订单，及包含paystate是1and0，shippingstate是1and0，orderstate不是8
     * @param memberId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int countFindAllOrderByOrderStateForOn(String memberId, String orderState, String payState, String shippingState);

    /**
     * 根据订单号获取订单详细信息
     * @param orderId
     * @return
     */
    public Orderr findOrderDetailByorderId(String orderId);

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
    public int updateOrderPayStateByOrderId(String orderId, String payState);

    /**
     * 支付宝返回数据，更新订单是否发货
     * @param orderId
     * @param shippingState
     * @return
     */
    public int updateOrderShippingStateByOrderId(String orderId, String shippingState);

    /**
     * 支付宝返回数据，更新订单状态
     * @param orderId
     * @param orderState
     * @return
     */
    public int updateOrderStateByOrderId(String orderId, String orderState);

    /**
     * 查询所有订单（后台）
     * from OrderT as o  order by purchasetime desc
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Orderr> findAllOrder(final int currentPage, final int lineSize);
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
    public List<Orderr> findOrderByOrderId(final int currentPage, final int lineSize, final String orderId);

    /**
     * 统计根据订单id查询订单列表
     * @param orderId
     * @return
     */
    public int countFindOrderbyOrderId(String orderId);

    /**
     * 根据收货人查询订单
     * @param currentPage
     * @param lineSize
     * @param shippingUsername
     * @return
     */
    public List<Orderr> findOrderByShippingUsername(final int currentPage, final int lineSize, final String shippingUsername);

    /**
     * 统计收货人查询订单
     * @param shippingUsername
     * @return
     */
    public int countFindOrderByShippingUsername(String shippingUsername);

    /**
     * 更新订单状态，支付状态，发货状态
     * @param orderId
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int updateOrderPayShippingState(String orderId, String orderState, String payState, String shippingState);

    /**
     * 获取待发货订单
     * @param currentPage
     * @param lineSize
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public List<Orderr> findAllToBeShippedOrders(final int currentPage, final int lineSize, String orderState,String payState, String shippingState);

    /**
     * 统计获取待发货订单
     * @param orderState
     * @param payState
     * @param shippingState
     * @return
     */
    public int countFindAllToBeShippedOrders(String orderState,String payState,String shippingState);

    /**
     * 更新订单快递单号
     * @param orderId
     * @param expressNumber
     * @return
     */
    public int updateExpressNumberByOrderId(String orderId, String expressNumber);

    /**
     * 更新发货单号
     * @param orderId
     * @param invoiceNumber
     * @param deliveryTime
     * @return
     */
    public int updateInvoiceNumberByOrderId(String orderId,
                                            String invoiceNumber, Date deliveryTime);

    /**
     * 更新订单是否要开票
     * @param orderId
     * @param invoice
     * @return
     */
    public int updateInvoiceByOrderId(String orderId, String invoice);

    /**
     * 根据排序方式查询所有
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Orderr> sortAllOrder(final int currentPage, final int lineSize, String queryString);

    /**
     * 根据发货状态获取已发货商品
     * @param currentPage
     * @param lineSize
     * @param shippingState
     * @return
     */
    public List<Orderr> findAllHaveShippedOrder(final int currentPage, final int lineSize, String shippingState);

    /**
     * 计算所有已发货订单
     * @param shippingState
     * @return
     */
    public int countAllHaveshippedOrder(String shippingState);

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
}
