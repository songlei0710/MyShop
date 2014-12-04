package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 会员分组
 * Created by 磊 on 2014/11/30.
 */
public class MemberGroup {
    private String id;
    private String nameA;
    private String status;
    private Date createTime;
    private String creatorId;
    private Date updateTime;
    private Integer versionT;
    private String attrs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersionT() {
        return versionT;
    }

    public void setVersionT(Integer versionT) {
        this.versionT = versionT;
    }

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }
}
