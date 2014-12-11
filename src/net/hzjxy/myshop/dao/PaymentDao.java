package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Payment;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface PaymentDao {
    /**
     * 开启支付方式使用
     * Update PaymentM as pm set pm.state='1' where pm.paymentid=:paymentid
     * @param list
     * @return
     */
    public int openPayment(String[] list);

    /**
     * 更新支付方式信息
     * @param pm
     * @return
     */
    public int updatePayment(Payment pm);

    /**
     * 查询所有支付方式
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Payment> findAllPayment(final int currentPage, final int lineSize);

    /**
     * 统计所有支付方式
     * @return
     */
    public int countFindAllPayment();

    /**
     * 根据id获取支付方式
     * @param paymentId
     * @return
     */
    public Payment findPaymentById(String paymentId);

    /**
     * 禁止支付方式
     * Update PaymentM as pm set pm.state='0' where pm.paymentid=:paymentid
     * @param list
     * @return
     */
    public int closePayment(String[] list);

    /**
     * 根据state获取的支付方式
     * @return
     */
    public List<Payment>(String state);
    /**
     * 根据id批量删除支付方式
     * @param str
     * @return
     */
    public int delPaymentById(String []str);
}
