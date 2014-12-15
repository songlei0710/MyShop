package net.hzjxy.myshop.dao.impl;


import net.hzjxy.myshop.dao.OrderInvoiceDao;
import net.hzjxy.myshop.entity.OrderInvoice;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class OrderInvoiceDaoImpl implements OrderInvoiceDao {

    @Override
    public int delOrderInvoice(String[] list) {
        return 0;
    }

    @Override
    public int updateOrderInvoiceState(String[] orderInvoiceId, String state) {
        return 0;
    }

    @Override
    public List<OrderInvoice> findAllOrderIvoice(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countFindAllOrderIvoice() {
        return 0;
    }
}
