package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 商品规格
 * Created by 磊 on 2014/11/30.
 */
public class ProductSpecification {
    private String specificationsid;
    private String name;
    private String note;
    private String sort;
    private String specificationsType;
    private String specificationsValue;
    private Date createtime;
    private String creatorid;
    private String state;
    private String goodsTypeId;
    private String goodsTypeName;
    private String shopid;

    public String getSpecificationsid() {
        return specificationsid;
    }

    public void setSpecificationsid(String specificationsid) {
        this.specificationsid = specificationsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSpecificationsType() {
        return specificationsType;
    }

    public void setSpecificationsType(String specificationsType) {
        this.specificationsType = specificationsType;
    }

    public String getSpecificationsValue() {
        return specificationsValue;
    }

    public void setSpecificationsValue(String specificationsValue) {
        this.specificationsValue = specificationsValue;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }
}
