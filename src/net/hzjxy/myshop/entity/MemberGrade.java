package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 会员等级
 * Created by 磊 on 2014/11/30.
 */
public class MemberGrade {
    private String id;
    private String type;
    private String name;
    private double start;
    private double end;
    private Double increment;
    private Double multiplyPower;
    private String mpState;
    private Double mpChangePower;
    private Date updateTime;
    private int versionT;
    private Double discount;
    private Date createTime;
    private String creatorId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public Double getIncrement() {
        return increment;
    }

    public void setIncrement(Double increment) {
        this.increment = increment;
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

    public int getVersionT() {
        return versionT;
    }

    public void setVersionT(int versionT) {
        this.versionT = versionT;
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
