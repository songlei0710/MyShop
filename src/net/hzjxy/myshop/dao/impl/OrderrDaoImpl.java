package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.OrderrDao;
import net.hzjxy.myshop.entity.Orderr;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class OrderrDaoImpl  implements OrderrDao {
    @Override
    public List<Orderr> findAllOrderByOrderState(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return null;
    }

    @Override
    public int countFindAllOrderByOrderState(@Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return 0;
    }

    @Override
    public int delOrderByOrderId(@Param("memberId") String memberId, @Param("orderId") String orderId, @Param("orderState") String orderState) {
        return 0;
    }

    @Override
    public List<Orderr> findAllOrderByOrderStateForOn(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return null;
    }

    @Override
    public int countFindAllOrderByOrderStateForOn(@Param("memberId") String memberId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return 0;
    }

    @Override
    public Orderr findOrderDetailByorderId(@Param("orderId") String orderId) {
        return null;
    }

    @Override
    public int updateOrder(Orderr orderr) {
        return 0;
    }

    @Override
    public int updateOrderPayStateByOrderId(@Param("orderId") String orderId, @Param("payState") String payState) {
        return 0;
    }

    @Override
    public int updateOrderShippingStateByOrderId(@Param("orderId") String orderId, @Param("shippingState") String shippingState) {
        return 0;
    }

    @Override
    public int updateOrderStateByOrderId(@Param("orderId") String orderId, @Param("orderState") String orderState) {
        return 0;
    }

    @Override
    public List<Orderr> findAllOrder(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countFindAllOrder() {
        return 0;
    }

    @Override
    public List<Orderr> findOrderByOrderId(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("orderId") String orderId) {
        return null;
    }

    @Override
    public int countFindOrderbyOrderId(@Param("orderId") String orderId) {
        return 0;
    }

    @Override
    public List<Orderr> findOrderByShippingUsername(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("shippingUsername") String shippingUsername) {
        return null;
    }

    @Override
    public int countFindOrderByShippingUsername(@Param("shippingUsername") String shippingUsername) {
        return 0;
    }

    @Override
    public int updateOrderPayShippingState(@Param("orderId") String orderId, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return 0;
    }

    @Override
    public List<Orderr> findAllToBeShippedOrders(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return null;
    }

    @Override
    public int countFindAllToBeShippedOrders(@Param("orderState") String orderState, @Param("payState") String payState, @Param("shippingState") String shippingState) {
        return 0;
    }

    @Override
    public int updateExpressNumberByOrderId(@Param("orderId") String orderId, @Param("expressNumber") String expressNumber) {
        return 0;
    }

    @Override
    public int updateInvoiceNumberByOrderId(@Param("orderId") String orderId, @Param("invoiceNumber") String invoiceNumber, @Param("deliveryTime") Date deliveryTime) {
        return 0;
    }

    @Override
    public int updateInvoiceByOrderId(@Param("orderId") String orderId, @Param("invoice") String invoice) {
        return 0;
    }

    @Override
    public List<Orderr> selectAllOrder(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public List<Orderr> findAllHaveShippedOrder(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("shippingState") String shippingState) {
        return null;
    }

    @Override
    public int countAllHaveshippedOrder(@Param("shippingState") String shippingState) {
        return 0;
    }

    @Override
    public List<Orderr> findAllReturnOrder(int currentPage, int lineSize, String orderState) {
        return null;
    }

    @Override
    public int countAllReturnOrder(String orderState) {
        return 0;
    }
}
