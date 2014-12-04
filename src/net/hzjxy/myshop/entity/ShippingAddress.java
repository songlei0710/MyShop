package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 发货地址
 * Created by 磊 on 2014/11/30...
 */
public class ShippingAddress {
    private String shippingaddressid;
    private String memberid;
    private String shippingusername;
    private String province;
    private String city;
    private String district;
    private String street;
    private String postcode;
    private String telno;
    private String mobile;
    private String email;
    private Date createtime;
    private String state;
    private String issend;
    private String deliveraddressid;
    private String orderid;
    private String country;
    private String shopid;

    public String getShippingaddressid() {
        return shippingaddressid;
    }

    public void setShippingaddressid(String shippingaddressid) {
        this.shippingaddressid = shippingaddressid;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getShippingusername() {
        return shippingusername;
    }

    public void setShippingusername(String shippingusername) {
        this.shippingusername = shippingusername;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIssend() {
        return issend;
    }

    public void setIssend(String issend) {
        this.issend = issend;
    }

    public String getDeliveraddressid() {
        return deliveraddressid;
    }

    public void setDeliveraddressid(String deliveraddressid) {
        this.deliveraddressid = deliveraddressid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }
}
