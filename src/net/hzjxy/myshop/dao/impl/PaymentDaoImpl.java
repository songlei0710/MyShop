package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.PaymentDao;
import net.hzjxy.myshop.entity.Payment;

import java.util.List;

/**
 * Created by SI 商 on 2014/12/15.
 */
public class PaymentDaoImpl implements PaymentDao {
    @Override
    public int openPayment(String[] list) {
        return 0;
    }

    @Override
    public int updatePayment(Payment pm) {
        return 0;
    }

    @Override
    public List<Payment> findAllPayment(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countFindAllPayment() {
        return 0;
    }

    @Override
    public Payment findPaymentById(String paymentId) {
        return null;
    }

    @Override
    public int closePayment(String[] list) {
        return 0;
    }

    @Override
    public List<Payment> findAllPayments(String state) {
        return null;
    }

    @Override
    public int delPaymentById(String[] str) {
        return 0;
    }
}
