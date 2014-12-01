package net.hzjxy.myshop.entity;

/**
 * 商品属性关系
 * Created by 磊 on 2014/11/30.
 */
public class GoodsAttributeRp {
    private String id;      //编号
    private String goodsId; //商品编号
    private String attrVal; //商品属性值

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getAttrVal() {
        return attrVal;
    }

    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal;
    }
}
