package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * Created by 磊 on 2014/11/30.
 */
public class GoodsGroup {
    private String groupId;
    private String goodsId;
    private String goodsName;
    private String state;
    private Date beginTime;
    private Date endTime;
    private String creatorId;
    private Date createTime;
    private String cashState;
    private Double cashLimit;
    private int limitBuy;
    private int saleQuantity;
    private int SOrderCount;
    private int totalOrderCount;
    private double sendPoint;
    private String priceLadder;
    private String detail;
    private String pictureUrl;
    private String htmlPath;
    private double memberPrice;
    private double groupPrice;
    private String placeName;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getCashState() {
        return cashState;
    }

    public void setCashState(String cashState) {
        this.cashState = cashState;
    }

    public Double getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(Double cashLimit) {
        this.cashLimit = cashLimit;
    }

    public int getLimitBuy() {
        return limitBuy;
    }

    public void setLimitBuy(int limitBuy) {
        this.limitBuy = limitBuy;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(int saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public int getSOrderCount() {
        return SOrderCount;
    }

    public void setSOrderCount(int SOrderCount) {
        this.SOrderCount = SOrderCount;
    }

    public int getTotalOrderCount() {
        return totalOrderCount;
    }

    public void setTotalOrderCount(int totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
    }

    public double getSendPoint() {
        return sendPoint;
    }

    public void setSendPoint(double sendPoint) {
        this.sendPoint = sendPoint;
    }

    public String getPriceLadder() {
        return priceLadder;
    }

    public void setPriceLadder(String priceLadder) {
        this.priceLadder = priceLadder;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public double getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(double groupPrice) {
        this.groupPrice = groupPrice;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
