package net.hzjxy.myshop.dao;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface OrderForAlipayDao {
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
}
