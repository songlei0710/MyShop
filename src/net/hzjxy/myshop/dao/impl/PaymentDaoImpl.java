package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.PaymentDao;
import net.hzjxy.myshop.entity.Payment;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class PaymentDaoImpl implements PaymentDao {
    @Override
    public int openPayment(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        paymentDao.openPayment(list);
        session.commit();
        return paymentDao.openPayment(list);
    }

    @Override
    public int updatePayment(Payment pm) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        int payment=paymentDao.updatePayment(pm);
        return payment;
    }

    @Override
    public List<Payment> findAllPayment(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        List<Payment> payment=paymentDao.findAllPayment(currentPage,lineSize);
        return payment;
    }

    @Override
    public int countFindAllPayment() {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        int payment=paymentDao.countFindAllPayment();
        return payment;
    }

    @Override
    public Payment findPaymentById(String paymentId) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        Payment payment=paymentDao.findPaymentById(paymentId);
        return payment;
    }

    @Override
    public int closePayment(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        paymentDao.closePayment(list);
        session.commit();
        return paymentDao.closePayment(list);
    }

    @Override
    public List<Payment> findAllPayments(String state) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        List<Payment> payment=paymentDao.findAllPayments(state);
        return payment;
    }

    @Override
    public int delPaymentById(String[] str) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        paymentDao.delPaymentById(str);
        session.commit();
        return paymentDao.delPaymentById(str);
    }

    @Override
    public int addPayment(Paymen paymen) {
        SqlSession session=MybatisUtil.currentSession();
        PaymentDao paymentDao=session.getMapper(PaymentDao.class);
        int payment=paymentDao.addPayment(paymen);
        return payment;
    }
}
