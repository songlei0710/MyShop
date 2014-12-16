package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.VoucherDao;
import net.hzjxy.myshop.entity.Voucher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public class VoucherDaoImpl implements VoucherDao{

    @Override
    public int delVoucher(@Param("list") String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        int voucher=voucherDao.delVoucher(list);
        return voucher;
    }

    @Override
    public int updateVoucher(@Param("vt") Voucher vt) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        int voucher=voucherDao.updateVoucher(vt);
        return voucher;
    }

    @Override
    public List<Voucher> findAllVoucher(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        List<Voucher> vouchers=voucherDao.findAllVoucher(currentPage,lineSize);
        return vouchers;
    }

    @Override
    public int countFindAllVoucher() {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        voucherDao.countFindAllVoucher();
        return voucherDao.countFindAllVoucher();
    }

    @Override
    public List<Voucher> findVoucherByName(@Param("voucherName") String voucherName) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        List<Voucher> vouchers=voucherDao.findVoucherByName(voucherName);
        return vouchers;
    }

    @Override
    public Voucher findVoucherForHonor(@Param("voucherName") String voucherName) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        Voucher voucher=voucherDao.findVoucherForHonor(voucherName);
        return voucher;
    }

    @Override
    public List<Voucher> findUserVoucher(@Param("userId") String userId, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        List<Voucher> vouchers=voucherDao.findUserVoucher(userId,currentPage,lineSize);
        return vouchers;
    }

    @Override
    public int countFindUserVoucher(@Param("userId") String userId) {
        SqlSession session=MybatisUtil.currentSession();
        VoucherDao voucherDao=session.getMapper(VoucherDao.class);
        int voucher=voucherDao.countFindUserVoucher(userId);
        return voucher;
    }
}
