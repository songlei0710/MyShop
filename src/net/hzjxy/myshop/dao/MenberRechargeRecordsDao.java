package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.MemberRechargeRecords;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface MenberRechargeRecordsDao {
    /**
     * 查询所有充值记录
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<MemberRechargeRecords> findAllMemberRechargeRecordsT(
            int currentPage, int lineSize);

    /**
     * 统计查询所有充值记录
     *
     * @return
     */
    public int countfindAllMemberRechargeRecordsT();

    /**
     * 删除所有充值记录
     *
     * @param strs
     */
    public void delMemberRechargeRecordsT(String[] strs);
}
