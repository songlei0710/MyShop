package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 订单
 * Created by 磊 on 2014/11/30.
 */
public class Orderr {
    private String OrderId;//订单编号
    private String memberid;//发货id
    private String membername;//发货地址
    private String paymentname;//
    private String delivermode;//
    private String deliverynumber;//
    private String orderstate;//
    private String logisticsid;//
    private double freight;//运费
    private double amount;//
    private double points;
    private Date purchasetime;
    private Date deliverytime;
    private String isinvoice;
    private String shippingaddressid;
    private String customerordernotes;
    private String logisticswebaddress;
    private Date paytime;
    private String orderTag;
    private String toBuyerNotes;
    private double shouldpay;
    private double usepoints;
    private String c;
    private int needquantity;
    private String paystate;
    private String shippingstate;
    private String deliveraddressid;
    private String shippingusername;
    private Date createtime;
    private String isprintexpress;
    private String isprintinvoice;
    private String isprintfpinvoice;
    private String expressnumber;
    private String tradeNo;
    private String userid;
    private String username;
    private String logisticsname;
    private String errorOrderTag;
    private String productinfo;
    private Integer versiont;
    private String ordername;
    private String shopid;
    private Date memberdelivertime;
    private String mainpicture;
    private Date updatetime;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getPaymentname() {
        return paymentname;
    }

    public void setPaymentname(String paymentname) {
        this.paymentname = paymentname;
    }

    public String getDelivermode() {
        return delivermode;
    }

    public void setDelivermode(String delivermode) {
        this.delivermode = delivermode;
    }

    public String getDeliverynumber() {
        return deliverynumber;
    }

    public void setDeliverynumber(String deliverynumber) {
        this.deliverynumber = deliverynumber;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public String getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(String logisticsid) {
        this.logisticsid = logisticsid;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public Date getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(Date purchasetime) {
        this.purchasetime = purchasetime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(String isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getShippingaddressid() {
        return shippingaddressid;
    }

    public void setShippingaddressid(String shippingaddressid) {
        this.shippingaddressid = shippingaddressid;
    }

    public String getCustomerordernotes() {
        return customerordernotes;
    }

    public void setCustomerordernotes(String customerordernotes) {
        this.customerordernotes = customerordernotes;
    }

    public String getLogisticswebaddress() {
        return logisticswebaddress;
    }

    public void setLogisticswebaddress(String logisticswebaddress) {
        this.logisticswebaddress = logisticswebaddress;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag;
    }

    public String getToBuyerNotes() {
        return toBuyerNotes;
    }

    public void setToBuyerNotes(String toBuyerNotes) {
        this.toBuyerNotes = toBuyerNotes;
    }

    public double getShouldpay() {
        return shouldpay;
    }

    public void setShouldpay(double shouldpay) {
        this.shouldpay = shouldpay;
    }

    public double getUsepoints() {
        return usepoints;
    }

    public void setUsepoints(double usepoints) {
        this.usepoints = usepoints;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int getNeedquantity() {
        return needquantity;
    }

    public void setNeedquantity(int needquantity) {
        this.needquantity = needquantity;
    }

    public String getPaystate() {
        return paystate;
    }

    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    public String getShippingstate() {
        return shippingstate;
    }

    public void setShippingstate(String shippingstate) {
        this.shippingstate = shippingstate;
    }

    public String getDeliveraddressid() {
        return deliveraddressid;
    }

    public void setDeliveraddressid(String deliveraddressid) {
        this.deliveraddressid = deliveraddressid;
    }

    public String getShippingusername() {
        return shippingusername;
    }

    public void setShippingusername(String shippingusername) {
        this.shippingusername = shippingusername;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getIsprintexpress() {
        return isprintexpress;
    }

    public void setIsprintexpress(String isprintexpress) {
        this.isprintexpress = isprintexpress;
    }

    public String getIsprintinvoice() {
        return isprintinvoice;
    }

    public void setIsprintinvoice(String isprintinvoice) {
        this.isprintinvoice = isprintinvoice;
    }

    public String getIsprintfpinvoice() {
        return isprintfpinvoice;
    }

    public void setIsprintfpinvoice(String isprintfpinvoice) {
        this.isprintfpinvoice = isprintfpinvoice;
    }

    public String getExpressnumber() {
        return expressnumber;
    }

    public void setExpressnumber(String expressnumber) {
        this.expressnumber = expressnumber;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public String getLogisticsname() {
        return logisticsname;
    }

    public void setLogisticsname(String logisticsname) {
        this.logisticsname = logisticsname;
    }

    public String getErrorOrderTag() {
        return errorOrderTag;
    }

    public void setErrorOrderTag(String errorOrderTag) {
        this.errorOrderTag = errorOrderTag;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo;
    }

    public Integer getVersiont() {
        return versiont;
    }

    public void setVersiont(Integer versiont) {
        this.versiont = versiont;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public Date getMemberdelivertime() {
        return memberdelivertime;
    }

    public void setMemberdelivertime(Date memberdelivertime) {
        this.memberdelivertime = memberdelivertime;
    }

    public String getMainpicture() {
        return mainpicture;
    }

    public void setMainpicture(String mainpicture) {
        this.mainpicture = mainpicture;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
