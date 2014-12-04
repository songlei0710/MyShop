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
    private Double incrementA;
    private Double multiplyPower;
    private String mpState;
    private Double mpChangePower;
    private Date updateTime;
    private int versionTA;
    private Double discount;
    private Date createTime;
    private String creatorId;

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

    public Double getIncrementA() {
        return incrementA;
    }

    public void setIncrementA(Double incrementA) {
        this.incrementA = incrementA;
    }

    public Double getMultiplyPower() {
        return multiplyPower;
    }

    public void setMultiplyPower(Double multiplyPower) {
        this.multiplyPower = multiplyPower;
    }

    public String getMpState() {
        return mpState;
    }

    public void setMpState(String mpState) {
        this.mpState = mpState;
    }

    public Double getMpChangePower() {
        return mpChangePower;
    }

    public void setMpChangePower(Double mpChangePower) {
        this.mpChangePower = mpChangePower;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getVersionTA() {
        return versionTA;
    }

    public void setVersionTA(int versionTA) {
        this.versionTA = versionTA;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
}
