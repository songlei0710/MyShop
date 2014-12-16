package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.VirtualShippingAddress;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface VirtualShippingAddressDao {
    /**
     * 根据发货地址id查询一系列发货地址（是否变更过地址等）
     * @param virtualShippingAddressId
     * @param state
     * @return
     */
    public List<VirtualShippingAddress> findVirtualShippingAddressByIdAndState(String virtualShippingAddressId, String state);

    /**
     * 根据订单号查询虚拟发货地址（邮箱和手机）
     *
     * @param state
     * @param orderId
     * @return
     */
    public List<VirtualShippingAddress> findVirtualShippingAddressByStateAndOrderId(String state, String orderId);

    /**
     * 根据订单号变更发货地址状态
     * @param orderId
     * @param state
     * @return
     */
    public int updateVirtualShippingAddressByOrderAndState(String orderId, String state);

    /**
     * 根据订单号和发货状态获取发货地址，地址状态是最新的可用地址，state=1
     *
     * @param orderId
     * @param state
     * @return
     */
    public VirtualShippingAddress findVirtualShippingAddressByOrderIdAndState(String orderId, String state);

    /**
     * 批量删除虚拟收获地址
     * @param strs
     * @return
     */
    public int delVirtualShippingAddress(String[] strs);

    /**
     * 更新虚拟收获地址
     * @param vsa
     * @return
     */
    public int updateVirtualShippingAddress(VirtualShippingAddress vsa);

    /**
     * 获取所有虚拟收获地址
     *
     * @return
     */
    public List<VirtualShippingAddress> findAllVirtualShippingAddress();
}
