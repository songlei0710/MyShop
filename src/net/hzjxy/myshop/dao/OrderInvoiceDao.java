package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.OrderInvoice;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface OrderInvoiceDao {
    /**
     * 删除订单发票记录
     *
     * @param list
     * @return
     */
    public int delOrderInvoice(String[] list);

    /**
     * 更新是否已经开过发票
     *
     * @param orderinvoiceid
     * @param state
     * @return
     */
    public int updateOrderInvoiceState(String[] orderinvoiceid, String state);

    /**
     * 获取所有订单发票信息
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<OrderInvoice> findAllOrderIvoice(final int currentPage,
                                                  final int lineSize);

    /**
     * 统计获取所有订单发票信息
     *
     * @return
     */
    public int countfindAllOrderIvoice();

}
