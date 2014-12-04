package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * Created by 磊 on 2014/11/30.
 */
public class GoodsUnit {
    private String unitId;
    private String unitName;
    private String engUnitName;
    private String creatorId;
    private Date createTime;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getEngUnitName() {
        return engUnitName;
    }

    public void setEngUnitName(String engUnitName) {
        this.engUnitName = engUnitName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
