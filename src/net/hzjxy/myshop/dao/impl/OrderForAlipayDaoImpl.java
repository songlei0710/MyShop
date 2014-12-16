package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.OrderForAlipayDao;
import net.hzjxy.myshop.dao.OrderInvoiceDao;
import net.hzjxy.myshop.entity.Orderr;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class OrderForAlipayDaoImpl implements OrderForAlipayDao {
    @Override
    public int updateOrderPayStateByOrderId(String orderId, String payState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderForAlipayDao OrderForAlipayDao=session.getMapper(OrderForAlipayDao.class);
        int order=OrderForAlipayDao.updateOrderPayStateByOrderId(orderId,payState);
        return order;
    }

    @Override
    public int updateOrderShippingStateByOrderId(String orderId, String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderForAlipayDao OrderForAlipayDao=session.getMapper(OrderForAlipayDao.class);
        int order=OrderForAlipayDao.updateOrderShippingStateByOrderId(orderId, shippingState);
        return order;
    }

    @Override
    public int updateOrderStateByorderId(String orderId, String orderState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderForAlipayDao  OrderForAlipayDao=session.getMapper(OrderForAlipayDao.class);
        int order=OrderForAlipayDao.updateOrderStateByorderId(orderId,orderState);
        return order;
    }

    @Override
    public int addlorderr(Orderr orderr) {
        SqlSession session=MybatisUtil.currentSession();
        OrderForAlipayDao OrderForAlipayDao=session.getMapper(OrderForAlipayDao.class);
        int order=OrderForAlipayDao.addlorderr(orderr);
        return order;
    }
}
