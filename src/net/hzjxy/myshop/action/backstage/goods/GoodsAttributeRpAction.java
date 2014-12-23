package net.hzjxy.myshop.action.backstage.goods;

/**
 * Created by Lenovo on 2014/12/23.
 */
public class GoodsAttributeRpAction {
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
