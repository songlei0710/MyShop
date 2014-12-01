package net.hzjxy.myshop.entity;

import java.util.Date;

/**收货地址
 * Created by 磊 on 2014/11/30.
 */
public class DeliverAddress {
    private String addressId;   //收货地址编号
    private String memberId;        //地址所有者Id
    private String shipPingUserName;    //收货人名称
    private String province;    //省份
    private String city;        //城市
    private String district;    //区域
    private String street;      //街道
    private String postcode;    //邮编
    private String telNo;       //座机
    private String mobile;      //手机
    private String email;       //邮箱
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间
    private String state;       //状态（0：无对应订单的地址  1：有对应订单的地址  2：过去的订单地址）
    private String country;     //国家

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getShipPingUserName() {
        return shipPingUserName;
    }

    public void setShipPingUserName(String shipPingUserName) {
        this.shipPingUserName = shipPingUserName;
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

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
