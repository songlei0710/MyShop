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
     *
     * @param currentPage
     * @param lineSize
     * @param memberid
     * @param orderstate
     * @return
     */
    public List<Orderr> findAllOrderByorderstate(final int currentPage,
                                                 final int lineSize, final String memberid, final String orderstate,
                                                 String paystate, String shippingstate);

    /**
     * 统计根据订单状态获取订单信息
     *
     * @param memberid
     * @param orderstate
     * @return
     */
    public int countfindAllOrderByorderstate(String memberid, String orderstate,
                                             String paystate, String shippingstate);

    /**
     * 用户删除自己订单
     *
     * @param memberid
     * @param orderid
     * @param orderstate
     * @return
     */
    public int delOrderByorderid(String memberid, String orderid,
                                 String orderstate);

    /**
     * 获取用户需要处理的订单，及包含paystate是1and0，shippingstate是1and0，orderstate不是8
     *
     * @param currentPage
     * @param lineSize
     * @param memberid
     * @param orderstate
     * @param paystate
     * @param shippingstate
     * @return
     */
    public List<Orderr> findAllOrderByorderstateForOn(final int currentPage,
                                                      final int lineSize, final String memberid, final String orderstate,
                                                      final String paystate, final String shippingstate);

    /**
     * 统计获取用户需要处理的订单，及包含paystate是1and0，shippingstate是1and0，orderstate不是8
     *
     * @param memberid
     * @param orderstate
     * @param paystate
     * @param shippingstate
     * @return
     */
    public int countfindAllOrderByorderstateForOn(String memberid,
                                                  String orderstate, String paystate, String shippingstate);

    /**
     * 根据订单号获取订单详细信息
     *
     * @param orderid
     * @return
     */
    public Orderr findOrderDetailByorderid(String orderid);

    /**
     * 更新订单
     *
     * @param o
     * @return
     */
    public void updateOrder(Orderr o);

    /**
     * 支付宝返回数据，更新订单是否付款标记
     *
     * @param orderid
     * @param paystate
     * @return
     */
    public int updateOrderPaystateByorderid(String orderid, String paystate);

    /**
     * 支付宝返回数据，更新订单是否发货
     *
     * @param orderid
     * @param shippingstate
     * @return
     */
    public int updateOrderShippingstateByorderid(String orderid,
                                                 String shippingstate);

    /**
     * 支付宝返回数据，更新订单状态
     *
     * @param orderid
     * @param orderstate
     * @return
     */
    public int updateOrderStateByorderid(String orderid, String orderstate);

    /**
     * 查询所有订单（后台）
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Orderr> findAllOrderT(final int currentPage, final int lineSize);

    /**
     * 统计查询所有订单（后台）
     *
     * @return
     */
    public int countfindAllOrderT();

    /**
     * 根据订单id查询订单列表（其实就只能查出唯一的一条）
     *
     * @param currentPage
     * @param lineSize
     * @param orderid
     * @return
     */
    public List<Orderr> findOrderByOrderid(final int currentPage,
                                           final int lineSize, final String orderid);

    /**
     * 统计根据订单id查询订单列表
     *
     * @param orderid
     * @return
     */
    public int countfindOrderbyOrderid(String orderid);

    /**
     * 根据收货人查询订单
     *
     * @param currentPage
     * @param lineSize
     * @param shippingusername
     * @return
     */
    public List<Orderr> findOrderByShippingUsername(final int currentPage,
                                                    final int lineSize, final String shippingusername);

    /**
     * 统计收货人查询订单
     *
     * @param shippingusername
     * @return
     */
    public int countfindOrderByShippingUsername(String shippingusername);

    /**
     * 更新订单状态，支付状态，发货状态
     *
     * @param orderid
     * @param orderstate
     * @param paystate
     * @param shippingstate
     * @return
     */
    public int updateOrderPayShippingState(String orderid, String orderstate,
                                           String paystate, String shippingstate);

    /**
     * 获取待发货订单
     *
     * @param currentPage
     * @param lineSize
     * @param shippingstate
     * @return
     */
    public List<Orderr> findAllTobeShippedOrders(final int currentPage,
                                                 final int lineSize, String orderstate,String paystate, String shippingstate);




    /**
     * 统计获取待发货订单
     *
     * @param shippingstate
     * @return
     */
    public int countfindAllTobeShippedOrders(String orderstate,String paystate,String shippingstate);

    /**
     * 更新订单快递单号
     *
     * @param orderid
     * @param expressnumber
     * @return
     */
    public int updateExpressnumberByOrderId(String orderid, String expressnumber);

    /**
     * 更新发货单号
     *
     * @param orderid
     * @param invoicenumber
     * @param time
     * @return
     */
    public int updateInvoicenumberByOrderId(String orderid,
                                            String invoicenumber, Date deliverytime);

    /**
     * 更新订单是否要开票
     *
     * @param orderid
     * @param invoice
     * @return
     */
    public int updateInvoiceByOrderId(String orderid, String invoice);

    /**
     * 根据排序方式查询所有
     *
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Orderr> sortAllOrderT(final int currentPage,
                                      final int lineSize, String queryString);

    /**
     * 根据发货状态获取已发货商品
     *
     * @param currentPage
     * @param lineSize
     * @param orderstate
     * @return
     */
    public List<Orderr> findAllhaveshippedOrder(final int currentPage,
                                                final int lineSize, String shippingstate);

    /**
     * 计算所有已发货订单
     *
     * @param shippingstate
     * @return
     */
    public int countAllhaveshippedOrder(String shippingstate);

    /**
     * 根据订单状态获取已退货商品
     *
     * @param currentPage
     * @param lineSize
     * @param orderstate
     * @return
     */
    public List<Orderr> findAllreturnOrder(final int currentPage,
                                           final int lineSize, String orderstate);

    /**
     * 计算所有退货的订单
     *
     * @param shippingstate
     * @return
     */
    public int countAllreturnOrder(String orderstate);
}
