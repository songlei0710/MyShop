package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 会员账号
 * Created by 磊 on 2014/11/30.
 */
public class MemberRecharge {
    private String id;
    private String memberId;
    private String memberName;
    private double balance;
    private Date createTime;
    private Date updateTime;
    private int versionT;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    private String shopId;
}
