package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 关联商品
 * Created by 磊 on 2014/11/30.
 */
public class GoodsBlinked {
    private String id;                      //编号
    private String mainGoodsId;             //主商品Id
    private String beLinkedProductInfo;     //关联商品信息
    private String bMode;
    private String state;
    private String creatorId;
    private Date createTime;
    private Date updateTime;
    private String sxLinkedGoodsId;
    private String mainProductId;
    private String shopId;
    private String mainGoodsName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainGoodsId() {
        return mainGoodsId;
    }

    public void setMainGoodsId(String mainGoodsId) {
        this.mainGoodsId = mainGoodsId;
    }

    public String getBeLinkedProductInfo() {
        return beLinkedProductInfo;
    }

    public void setBeLinkedProductInfo(String beLinkedProductInfo) {
        this.beLinkedProductInfo = beLinkedProductInfo;
    }

    public String getbMode() {
        return bMode;
    }

    public void setbMode(String bMode) {
        this.bMode = bMode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSxLinkedGoodsId() {
        return sxLinkedGoodsId;
    }

    public void setSxLinkedGoodsId(String sxLinkedGoodsId) {
        this.sxLinkedGoodsId = sxLinkedGoodsId;
    }

    public String getMainProductId() {
        return mainProductId;
    }

    public void setMainProductId(String mainProductId) {
        this.mainProductId = mainProductId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getMainGoodsName() {
        return mainGoodsName;
    }

    public void setMainGoodsName(String mainGoodsName) {
        this.mainGoodsName = mainGoodsName;
    }
}
