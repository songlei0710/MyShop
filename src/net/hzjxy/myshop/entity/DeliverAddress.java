package net.hzjxy.myshop.entity;

import java.util.Date;

/**收货地址
 * Created by 磊 on 2014/11/30.
 */
public class DeliverAddress {
    private String addressid;   //收货地址编号
    private String memberid;        //地址所有者Id
    private String shippingusername;    //收货人名称
    private String province;    //省份
    private String city;        //城市
    private String district;    //区域
    private String street;      //街道
    private String postcode;    //邮编
    private String telno;       //座机
    private String mobile;      //手机
    private String email;       //邮箱
    private Date createtime;    //创建时间
    private Date updatetiem;    //更新时间
    private String state;       //状态（0：无对应订单的地址  1：有对应订单的地址  2：过去的订单地址）
    private String country;     //国家
}
