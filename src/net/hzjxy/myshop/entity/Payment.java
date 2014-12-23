package net.hzjxy.myshop.entity;

/**
 * 支付方式
 * Created by 磊 on 2014/11/30.
 */
public class Payment {
    private String paymentid;//付费设置ID
    private String paymentname;//付费设置名称
    private String paymentCode;//支付密码
    private String paymentFree;//自由支付
    private String paymentInterface;//支出
    private String account;//账户
    private String safecode;//实模式
    private String partnerid;//合作伙伴
    private String des;//的
    private String isFast;//快
    private String state;//状态

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
