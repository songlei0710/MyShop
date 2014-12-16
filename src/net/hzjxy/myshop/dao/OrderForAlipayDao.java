package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Orderr;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface OrderForAlipayDao {
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
     *
     * @param orderId
     * @param orderState
     * @return
     */
    public int updateOrderStateByorderId(String orderId, String orderState);
    /**
     * 添加数据
     * @param orderr
     * @return
     */
    public int addlorderr(Orderr orderr);
}
