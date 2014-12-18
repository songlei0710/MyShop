package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Voucher;
import org.apache.ibatis.annotations.Param;

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
    public int delVoucher(@Param("list") String[] list);

    /**
     * 更新优惠券
     * @param vt
     * @return
     */
    public int updateVoucher(@Param("vt") Voucher vt);

    /**
     * 查询所有优惠券
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Voucher> findAllVoucher(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

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
    public List<Voucher> findVoucherByName(@Param("voucherName") String voucherName);

    /**
     * 兑现抵用券
     * @param voucherName
     * @return
     */
    public Voucher findVoucherForHonor(@Param("voucherName") String voucherName);

    /**
     * 检索用户抵用券
     * @param userId
     * @return
     */
    public List<Voucher> findUserVoucher(final @Param("userId") String userId, final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

    /**
     * 统计检索用户抵用券
     * @param userId
     * @return
     */
    public int countFindUserVoucher(@Param("userId") String userId);
    /**
     *
     */
    public int addVoucher(@Param("voucher") Voucher voucher);
}
