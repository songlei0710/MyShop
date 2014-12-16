package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.OrderrDao;
import net.hzjxy.myshop.entity.Orderr;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class OrderrDaoImpl  implements OrderrDao {
    @Override
    public List<Orderr> findAllOrderByOrderState(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findAllOrderByOrderState(currentPage,lineSize,memberId,orderState,payState,shippingState);
        return orderrs;
    }

    @Override
    public int countFindAllOrderByOrderState(@Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countFindAllOrderByOrderState(memberId,orderState,payState,shippingState);
        return Order;
    }

    @Override
    public int delOrderByOrderId(@Param("memberId") String memberId, @Param("orderId") String orderId, @Param("orderState") String orderState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.delOrderByOrderId(memberId,orderId,orderState);
        return Order;
    }

    @Override
    public List<Orderr> findAllOrderByOrderStateForOn(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findAllOrderByOrderStateForOn(currentPage,lineSize,memberId,orderState,payState,shippingState);
        return orderrs;
    }

    @Override
    public int countFindAllOrderByOrderStateForOn(@Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countFindAllOrderByOrderStateForOn(memberId,orderState,payState,shippingState);
        return Order;
    }

    @Override
    public Orderr findOrderDetailByorderId(@Param("orderId") String orderId) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        return orderrDao.findOrderDetailByorderId(orderId);
    }

    @Override
    public int updateOrder(Orderr orderr) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateOrder(orderr);
        return Order;
    }

    @Override
    public int updateOrderPayStateByOrderId(@Param("orderId") String orderId, @Param("payState") String payState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateOrderPayStateByOrderId(orderId,payState);
        return Order;
    }

    @Override
    public int updateOrderShippingStateByOrderId(@Param("orderId") String orderId, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateOrderShippingStateByOrderId(orderId,shippingState);
        return Order;
    }

    @Override
    public int updateOrderStateByOrderId(@Param("orderId") String orderId, @Param("orderState") String orderState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateOrderStateByOrderId(orderId,orderState);
        return Order;
    }

    @Override
    public List<Orderr> findAllOrder(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findAllOrder(currentPage,lineSize);
        return orderrs;
    }

    @Override
    public int countFindAllOrder() {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countFindAllOrder();
        return Order;
    }

    @Override
    public List<Orderr> findOrderByOrderId(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("orderId") String orderId) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findOrderByOrderId(currentPage,lineSize,orderId);
        return orderrs;
    }

    @Override
    public int countFindOrderbyOrderId(@Param("orderId") String orderId) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countFindOrderbyOrderId(orderId);
        return Order;
    }

    @Override
    public List<Orderr> findOrderByShippingUsername(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("shippingUsername") String shippingUsername) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findOrderByShippingUsername(currentPage,lineSize,shippingUsername);
        return orderrs;
    }

    @Override
    public int countFindOrderByShippingUsername(@Param("shippingUsername") String shippingUsername) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countFindOrderByShippingUsername(shippingUsername);
        return Order;
    }

    @Override
    public int updateOrderPayShippingState(@Param("orderId") String orderId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateOrderPayShippingState(orderId,orderState,payState,shippingState);
        return Order;
    }

    @Override
    public List<Orderr> findAllToBeShippedOrders(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findAllToBeShippedOrders(currentPage,lineSize,orderState,payState,shippingState);
        return orderrs;
    }

    @Override
    public int countFindAllToBeShippedOrders(@Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countFindAllToBeShippedOrders(orderState,payState,shippingState);
        return Order;
    }

    @Override
    public int updateExpressNumberByOrderId(@Param("orderId") String orderId, @Param("expressNumber") String expressNumber) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateExpressNumberByOrderId(orderId,expressNumber);
        return Order;
    }

    @Override
    public int updateInvoiceNumberByOrderId(@Param("orderId") String orderId, @Param("invoiceNumber") String invoiceNumber, @Param("deliveryTime") Date deliveryTime) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateInvoiceNumberByOrderId(orderId,invoiceNumber,deliveryTime);
        return Order;
    }

    @Override
    public int updateInvoiceByOrderId(@Param("orderId") String orderId, @Param("invoice") String invoice) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.updateInvoiceByOrderId(orderId,invoice);
        return Order;
    }

    @Override
    public List<Orderr> selectAllOrder(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.selectAllOrder(currentPage,lineSize,queryString);
        return orderrs;
    }

    @Override
    public List<Orderr> findAllHaveShippedOrder(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findAllHaveShippedOrder(currentPage,lineSize,shippingState);
        return orderrs;
    }

    @Override
    public int countAllHaveshippedOrder(@Param("shippingState") String shippingState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countAllHaveshippedOrder(shippingState);
        return Order;
    }

    @Override
    public List<Orderr> findAllReturnOrder(int currentPage, int lineSize, String orderState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        List<Orderr> orderrs=orderrDao.findAllReturnOrder(currentPage,lineSize,orderState);
        return orderrs;
    }

    @Override
    public int countAllReturnOrder(String orderState) {
        SqlSession session=MybatisUtil.currentSession();
        OrderrDao orderrDao=session.getMapper(OrderrDao.class);
        int Order=orderrDao.countAllReturnOrder(orderState);
        return Order;
    }
}
