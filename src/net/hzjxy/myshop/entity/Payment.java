package net.hzjxy.myshop.entity;

/**
 * 支付方式
 * Created by 磊 on 2014/11/30.
 */
public class Payment {
    private String paymentid;
    private String paymentname;
    private String paymentCode;
    private String paymentFree;
    private String paymentInterface;
    private String account;
    private String safecode;
    private String partnerid;
    private String des;
    private String isFast;
    private String state;

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentname() {
        return paymentname;
    }

    public void setPaymentname(String paymentname) {
        this.paymentname = paymentname;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentFree() {
        return paymentFree;
    }

    public void setPaymentFree(String paymentFree) {
        this.paymentFree = paymentFree;
    }

    public String getPaymentInterface() {
        return paymentInterface;
    }

    public void setPaymentInterface(String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSafecode() {
        return safecode;
    }

    public void setSafecode(String safecode) {
        this.safecode = safecode;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getIsFast() {
        return isFast;
    }

    public void setIsFast(String isFast) {
        this.isFast = isFast;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
