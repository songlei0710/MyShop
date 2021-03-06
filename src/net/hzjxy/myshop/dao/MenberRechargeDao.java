package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.MemberRecharge;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface MenberRechargeDao {
    /**
     * 查询所有充值账户余额
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<MemberRecharge> findAllMemberRechargeT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize);
    /**
     * 统计查询所有充值账户余额
     * @return
     */
    public int countfindAllMemberRechargeT();
    /**
     * 更新充值账户余额信息
     * @param mrt
     */
    public void updateMemberRechargeT(@Param("mrt") MemberRecharge mrt);
    /**
     * 删除充值账户信息
     * @param strs
     */
    public void delMemberRechargeT(@Param("strs") String[] strs);
    /**
     * 根据id查询
     * @param id
     * @return
     */
    public MemberRecharge findMemberRechargeTById(@Param("id") String id);
    /**
     * 根据会员id查询
     * @param memberid
     * @return
     */
    public MemberRecharge findMemberRechargeTByMemberId(@Param("memberid") String memberid);
    public int add(@Param("menberRecharge") int menberRecharge);
}
