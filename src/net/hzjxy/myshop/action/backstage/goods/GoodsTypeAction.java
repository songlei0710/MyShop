package net.hzjxy.myshop.action.backstage.goods;

import java.util.Date;

/**
 * Created by Lenovo on 2014/12/23.
 */
public class GoodsTypeAction {
    private String goodsTypeId;
    private String name;
    private Date createTime;
    private String creatorId;
    private String goodsParameter;

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGoodsParameter() {
        return goodsParameter;
    }

    public void setGoodsParameter(String goodsParameter) {
        this.goodsParameter = goodsParameter;
    }
}
