package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 优惠券
 * Created by 磊 on 2014/11/30.
 */
public class Voucher {
    private String vouchersid;
    private String vouchersname;
    private String begintime;
    private String endtime;
    private String voucherscontent;
    private double limitprice;
    private String givenmemberid;
    private String voucherstate;
    private String voucheruseway;
    private String state;
    private Date createtime;
    private String creatorid;
    private String mobilesync;

    public String getVouchersid() {
        return vouchersid;
    }

    public void setVouchersid(String vouchersid) {
        this.vouchersid = vouchersid;
    }

    public String getVouchersname() {
        return vouchersname;
    }

    public void setVouchersname(String vouchersname) {
        this.vouchersname = vouchersname;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getVoucherscontent() {
        return voucherscontent;
    }

    public void setVoucherscontent(String voucherscontent) {
        this.voucherscontent = voucherscontent;
    }

    public double getLimitprice() {
        return limitprice;
    }

    public void setLimitprice(double limitprice) {
        this.limitprice = limitprice;
    }

    public String getGivenmemberid() {
        return givenmemberid;
    }

    public void setGivenmemberid(String givenmemberid) {
        this.givenmemberid = givenmemberid;
    }

    public String getVoucherstate() {
        return voucherstate;
    }

    public void setVoucherstate(String voucherstate) {
        this.voucherstate = voucherstate;
    }

    public String getVoucheruseway() {
        return voucheruseway;
    }

    public void setVoucheruseway(String voucheruseway) {
        this.voucheruseway = voucheruseway;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public String getMobilesync() {
        return mobilesync;
    }

    public void setMobilesync(String mobilesync) {
        this.mobilesync = mobilesync;
    }
}
