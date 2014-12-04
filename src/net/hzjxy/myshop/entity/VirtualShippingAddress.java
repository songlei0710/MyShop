package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 虚拟收货地址..
 * Created by 磊 on 2014/11/30.
 */
public class VirtualShippingAddress {
    private String virtualshippingaddressid;
    private String userid;
    private String username;
    private String mobile;
    private String email;
    private Date createtime;
    private String state;
    private String issend;
    private String orderid;
    private Date updatetime;
    private Date sendtime;

    public String getVirtualshippingaddressid() {
        return virtualshippingaddressid;
    }

    public void setVirtualshippingaddressid(String virtualshippingaddressid) {
        this.virtualshippingaddressid = virtualshippingaddressid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}
