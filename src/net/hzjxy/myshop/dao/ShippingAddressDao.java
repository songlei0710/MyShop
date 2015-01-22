package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.ShippingAddress;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface ShippingAddressDao {
    /**
     * 根据发货地址id查询一系列发货地址（是否变更过地址等）
     *
     * @param shippingAddressId
     * @param state
     * @return
     */
    public List<ShippingAddress> findShippingAddressByIdAndState(String shippingAddressId, String state);

    /**
     * 根据收货地址id查询是否有对应的发货地址信息
     * @param deliverAddressId
     * @param state
     * @param orderId
     * @return
     */
    public List<ShippingAddress> findShippingAddressByDeliverAddressIdAndState(String deliverAddressId, String state, String orderId);

    /**
     * 根据订单编号把地址设定到state2
     *
     * @param orderId
     * @param state
     * @return
     */
    public int updateShippingAddressByOrderAndState(String orderId, String state);

    /**
     * 根据订单号和地址状态获取发货地址，地址状态是最新的可用地址，state=1
     *
     * @param orderId
     * @param state
     * @return
     */
    public ShippingAddress findShippingAddressByOrderId(String orderId, String state);

    /**
     * 根据订单号和地址状态获取发货地址
     * @param orderId
     * @return
     */
    public List<ShippingAddress>findShippingAddressByOrderId(String orderId);
}
