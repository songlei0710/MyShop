package net.hzjxy.myshop.dao.impl;


import net.hzjxy.myshop.dao.OrderForAlipayDao;
import net.hzjxy.myshop.dao.OrderInvoiceDao;
import net.hzjxy.myshop.dao.UserTDao;
import net.hzjxy.myshop.entity.OrderInvoice;
import net.hzjxy.myshop.entity.UserT;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public  class OrderInvoiceDaoImpl implements OrderInvoiceDao {

    @Override
    public int delOrderInvoice(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        OrderInvoiceDao OrderInvoiceDao=session.getMapper(OrderInvoiceDao.class);
        OrderInvoiceDao.delOrderInvoice(list);
        session.commit();
        return OrderInvoiceDao.delOrderInvoice(list);
    }

    @Override
    public int updateOrderInvoiceState(String[] orderInvoiceId, String state) {
        SqlSession session=MybatisUtil.currentSession();
        OrderInvoiceDao OrderInvoiceDao=session.getMapper(OrderInvoiceDao.class);
        int voice=OrderInvoiceDao.updateOrderInvoiceState(orderInvoiceId,state);
        return voice;
    }

    @Override
    public List<OrderInvoice> findAllOrderIvoice(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        OrderInvoiceDao OrderInvoiceDao=session.getMapper(OrderInvoiceDao.class);
        List<OrderInvoice> list=OrderInvoiceDao.findAllOrderIvoice(currentPage,lineSize);
        return null;
    }

    @Override
    public int countFindAllOrderIvoice() {
        SqlSession session=MybatisUtil.currentSession();
        OrderInvoiceDao OrderInvoiceDao=session.getMapper(OrderInvoiceDao.class);
        OrderInvoiceDao.countFindAllOrderIvoice();
        return OrderInvoiceDao.countFindAllOrderIvoice();
    }

    @Override
    public int addlist(List list) {
        SqlSession session=MybatisUtil.currentSession();
        OrderInvoiceDao OrderInvoiceDao=session.getMapper(OrderInvoiceDao.class);
        int state=OrderInvoiceDao.addlist(list);
        return state;
    }
}
