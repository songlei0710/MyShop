package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.DeliverAddress;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface DeliverAddressDao {
    /**
     * 删除收获地址
     *
     * @param list
     * @return
     */
    public int delDeliverAddress(String[] list);

    /**
     * 更新收获地址
     *
     * @param d
     * @return
     */
    public int updateDeliverAddress(DeliverAddress d);

    /**
     * 查询所有收获地址
     *
     * @return
     */
    public List<DeliverAddress> findAllDeliverAddress();

    /**
     * 根据用户id获取用户收货地址
     *
     * @param memberid
     * @return
     */
    public List<DeliverAddress> findDeliverAddressBymemberid(String memberid);

    /**
     * 根据地址id获取地址信息
     *
     * @param addressid
     * @return
     */
    public DeliverAddress findDeliverAddressById(String addressid);
}
