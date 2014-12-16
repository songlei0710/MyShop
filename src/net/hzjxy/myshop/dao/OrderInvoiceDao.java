package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.OrderInvoice;
import net.hzjxy.myshop.entity.UserT;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface OrderInvoiceDao {
    /**
     * 删除订单发票记录
     * @param list
     * @return
     */
    public int delOrderInvoice(String[] list);

    /**
     * 更新是否已经开过发票
     * @param orderInvoiceId
     * @param state
     * @return
     */
    public int updateOrderInvoiceState(String[] orderInvoiceId, String state);

    /**
     * 获取所有订单发票信息
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<OrderInvoice> findAllOrderIvoice(final int currentPage,final int lineSize);

    /**
     * 统计获取所有订单发票信息
     * @return
     */
    public int countFindAllOrderIvoice();

    /**
     * 添加发票
     * @param list
     * @return
     */
    public int addlist(List list);

}
