package net.hzjxy.myshop.entity;

import java.util.Date;
/**
 * 商品属性
 * Created by 磊 on 2014/11/30.
 */
public class GoodsAttribute {

    private String goodSatTributeId;        //商品属性Id
    private String goodSatTributeName;      //商品属性名称
    private String goodsTypeId;             //商品类别Id
    private String goodsTypeName;           //商品类别名称
    private Date createTime;                //创建时间
    private String state;                   //状态（0：表示未启用  1：表示启用）
    private String creatorId;               //创建者Id
    private String attributeType;           //属性显示的类型
    private String attributeList;           //属性列表（用逗号分隔）
    private String sort;                    //排序序号
    private String attributeIndex;          //属性下标
    private String isSearch;                //是否支持属性检索
    private String isSameToLink;            //是否开启属性关联

    public String getGoodSatTributeId() {
        return goodSatTributeId;
    }

    public void setGoodSatTributeId(String goodSatTributeId) {
        this.goodSatTributeId = goodSatTributeId;
    }

    public String getGoodSatTributeName() {
        return goodSatTributeName;
    }

    public void setGoodSatTributeName(String goodSatTributeName) {
        this.goodSatTributeName = goodSatTributeName;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public String getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(String attributeList) {
        this.attributeList = attributeList;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAttributeIndex() {
        return attributeIndex;
    }

    public void setAttributeIndex(String attributeIndex) {
        this.attributeIndex = attributeIndex;
    }

    public String getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(String isSearch) {
        this.isSearch = isSearch;
    }

    public String getIsSameToLink() {
        return isSameToLink;
    }

    public void setIsSameToLink(String isSameToLink) {
        this.isSameToLink = isSameToLink;
    }


}
