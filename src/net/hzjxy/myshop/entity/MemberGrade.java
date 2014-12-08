package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 会员等级
 * Created by 磊 on 2014/11/30.
 */
public class MemberGrade {
    private String id;
    private String typeA;
    private String nameA;
    private double startＡ;
    private double endA;
    private Double incrementＡ;
    private Double multiplypower;
    private String mpstate;
    private Double mpchangepower;
    private Date updatetime;
    private int versiontＡ;
    private Double discount;
    private Date createtime;
    private String creatorid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeA() {
        return typeA;
    }

    public void setTypeA(String typeA) {
        this.typeA = typeA;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public double getStartＡ() {
        return startＡ;
    }

    public void setStartＡ(double startＡ) {
        this.startＡ = startＡ;
    }

    public double getEndA() {
        return endA;
    }

    public void setEndA(double endA) {
        this.endA = endA;
    }

    public Double getIncrementＡ() {
        return incrementＡ;
    }

    public void setIncrementＡ(Double incrementＡ) {
        this.incrementＡ = incrementＡ;
    }

    public Double getMultiplypower() {
        return multiplypower;
    }

    public void setMultiplypower(Double multiplypower) {
        this.multiplypower = multiplypower;
    }

    public String getMpstate() {
        return mpstate;
    }

    public void setMpstate(String mpstate) {
        this.mpstate = mpstate;
    }

    public Double getMpchangepower() {
        return mpchangepower;
    }

    public void setMpchangepower(Double mpchangepower) {
        this.mpchangepower = mpchangepower;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public int getVersiontＡ() {
        return versiontＡ;
    }

    public void setVersiontＡ(int versiontＡ) {
        this.versiontＡ = versiontＡ;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
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
}
