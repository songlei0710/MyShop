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
    private double startA;
    private double endA;
    private double incrementA;
    private double multiplypower;
    private String mpstate;
    private double mpchangepower;
    private Date updatetime;
    private int versiontA;
    private double discount;
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

    public double getStartA() {
        return startA;
    }

    public void setStartA(double startA) {
        this.startA = startA;
    }

    public double getEndA() {
        return endA;
    }

    public void setEndA(double endA) {
        this.endA = endA;
    }

    public double getIncrementA() {
        return incrementA;
    }

    public void setIncrementA(double incrementA) {
        this.incrementA = incrementA;
    }

    public double getMultiplypower() {
        return multiplypower;
    }

    public void setMultiplypower(double multiplypower) {
        this.multiplypower = multiplypower;
    }

    public String getMpstate() {
        return mpstate;
    }

    public void setMpstate(String mpstate) {
        this.mpstate = mpstate;
    }

    public double getMpchangepower() {
        return mpchangepower;
    }

    public void setMpchangepower(double mpchangepower) {
        this.mpchangepower = mpchangepower;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public int getVersiontA() {
        return versiontA;
    }

    public void setVersiontA(int versiontA) {
        this.versiontA = versiontA;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
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
