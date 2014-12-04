package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 订单发票
 * Created by 磊 on 2014/11/30.
 */
public class OrderInvoice {
    private String orderInvoiceid;
    private String orderid;
    private String invType;
    private String invPayee;
    private String amount;
    private String memberid;
    private String state;
    private String membername;
    private String invContent;
    private Date createtime;
    private Date updatetime;
    private int versiont;
    private String shopid;

    public String getOrderInvoiceid() {
        return orderInvoiceid;
    }

    public void setOrderInvoiceid(String orderInvoiceid) {
        this.orderInvoiceid = orderInvoiceid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public String getInvPayee() {
        return invPayee;
    }

    public void setInvPayee(String invPayee) {
        this.invPayee = invPayee;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getInvContent() {
        return invContent;
    }

    public void setInvContent(String invContent) {
        this.invContent = invContent;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public int getVersiont() {
        return versiont;
    }

    public void setVersiont(int versiont) {
        this.versiont = versiont;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }
}
