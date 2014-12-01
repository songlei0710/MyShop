package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 购物车
 * Created by 磊 on 2014/11/30.
 */
public class Cart {
    private String cartid;      //购物车Id
    private String orderId;     //所属订单Id
    private String goodsId;     //商品Id
    private String goodsName;   //商品名称
    private String userId;      //系统人员Id
    private String username;    //系统人员用户名
    private int needQuantity;   //数量
    private double price;       //市场价
    private double favorable;   //会员价
    private double changeprice; //差价
    private double points;      //积分
    private double subtotal;    //价格小计
    private Date addtime;       //加入购物车的时间
    private int quantity;       //库存
    private String picture;     //图片
    private String usersetnum;  //商品编号
    private String weight;      //重量
    private String state;       //状态（1：新加入购物车的商品  2：从购物车中删除的商品  3：被加入订单的商品）
    private String htmlpath;    //商品信息静态路径
    private String productid;   //货物Id
    private String orderTag;    //订单来源标记
    private String productName; //货物名称
    private String cartTag;     //购物车标记
    private String memberid;    //会员Id
    private String membername;  //会员名称
    private int storeTag;   //库存状态标记
}
