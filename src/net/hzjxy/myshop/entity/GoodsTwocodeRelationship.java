package net.hzjxy.myshop.entity;

/**
 * Created by 磊 on 2014/11/30.
 */
public class GoodsTwocodeRelationship {
    private String id;
    private String goodsId;
    private String goodsName;
    private String twoCodePath;
    private String state;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getTwoCodePath() {
        return twoCodePath;
    }

    public void setTwoCodePath(String twoCodePath) {
        this.twoCodePath = twoCodePath;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
