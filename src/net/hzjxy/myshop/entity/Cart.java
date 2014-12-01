package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 购物车
 * Created by 磊 on 2014/11/30.
 */
public class Cart {
    private String cartId;     //购物车Id
    private String orderId;     //所属订单Id
    private String goodsId;     //商品Id
    private String goodsName;   //商品名称
    private String userId;      //系统人员Id
    private String userName;    //系统人员用户名
    private int needQuantity;   //数量
    private double price;       //市场价
    private double favorable;   //会员价
    private double changePrice; //差价
    private double points;      //积分
    private double subtotal;    //价格小计
    private Date addTime;       //加入购物车的时间
    private int quantity;       //库存
    private String picture;     //图片
    private String userSetNum;  //商品编号
    private String weight;      //重量
    private String state;       //状态（1：新加入购物车的商品  2：从购物车中删除的商品  3：被加入订单的商品）
    private String htmlPath;    //商品信息静态路径
    private String productId;   //货物Id
    private String orderTag;    //订单来源标记
    private String productName; //货物名称
    private String cartTag;     //购物车标记
    private String memberId;    //会员Id
    private String memberName;  //会员名称
    private int storeTag;   //库存状态标记

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNeedQuantity() {
        return needQuantity;
    }

    public void setNeedQuantity(int needQuantity) {
        this.needQuantity = needQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFavorable() {
        return favorable;
    }

    public void setFavorable(double favorable) {
        this.favorable = favorable;
    }

    public double getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(double changePrice) {
        this.changePrice = changePrice;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserSetNum() {
        return userSetNum;
    }

    public void setUserSetNum(String userSetNum) {
        this.userSetNum = userSetNum;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCartTag() {
        return cartTag;
    }

    public void setCartTag(String cartTag) {
        this.cartTag = cartTag;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getStoreTag() {
        return storeTag;
    }

    public void setStoreTag(int storeTag) {
        this.storeTag = storeTag;
    }
}
