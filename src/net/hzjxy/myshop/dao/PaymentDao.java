package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Payment;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface PaymentDao {
    /**
     * 开启支付方式使用
     *
     * @param list
     * @return
     */
    public int openPayment(String[] list);

    /**
     * 更新支付方式信息
     *
     * @param pm
     * @return
     */
    public int updatePayment(Payment pm);

    /**
     * 查询所有支付方式
     *
     * @param currenPage
     * @param lineSize
     * @return
     */
    public List<Payment> findAllPayment(final int currentPage, final int lineSize);

    /**
     * 统计所有支付方式
     *
     * @return
     */
    public int countfindAllPayment();

    /**
     * 根据id获取支付方式
     *
     * @param paymentid
     * @return
     */
    public Payment findPaymentbyId(String paymentid);

    /**
     * 禁止支付方式
     *
     * @param list
     * @return
     */
    public int closePayment(String[] list);

    /**
     * 获取所有启用的支付方式
     *
     * @return
     */
    public List<Payment> findAllPayment(String state);
    /**
     * 根据id批量删除支付方式
     * @param str
     * @return
     */
    public int delPaymentByid(String []str);
}
