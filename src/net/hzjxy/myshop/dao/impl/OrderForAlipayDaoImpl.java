package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.OrderForAlipayDao;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class OrderForAlipayDaoImpl implements OrderForAlipayDao {
    @Override
    public int updateOrderPayStateByOrderId(String orderId, String payState) {
        return 0;
    }

    @Override
    public int updateOrderShippingStateByOrderId(String orderId, String shippingState) {
        return 0;
    }

    @Override
    public int updateOrderStateByorderId(String orderId, String orderState) {
        return 0;
    }
}
