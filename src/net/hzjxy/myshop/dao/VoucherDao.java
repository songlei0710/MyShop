package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Voucher;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface VoucherDao {
    /**
     * 删除优惠券
     * @param list
     * @return
     */
    public int delVoucher(String[] list);

    /**
     * 更新优惠券
     * @param vt
     * @return
     */
    public int updateVoucher(Voucher vt);

    /**
     * 查询所有优惠券
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Voucher> findAllVoucher(final int currentPage, final int lineSize);

    /**
     * 统计所有优惠券
     * @return
     */
    public int countFindAllVoucher();

    /**
     * 根据抵用券编码查询是否有相同编码的抵用券
     * @param voucherName
     * @return
     */
    public List<Voucher> findVoucherByName(String voucherName);

    /**
     * 兑现抵用券
     * @param voucherName
     * @return
     */
    public Voucher findVoucherForHonor(String voucherName);

    /**
     * 检索用户抵用券
     * @param userId
     * @return
     */
    public List<Voucher> findUserVoucher(final String userId, final int currentPage, final int lineSize);

    /**
     * 统计检索用户抵用券
     * @param userId
     * @return
     */
    public int countFindUserVoucher(String userId);
}
