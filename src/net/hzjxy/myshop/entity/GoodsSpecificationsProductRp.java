package net.hzjxy.myshop.entity;

/**
 * Created by 磊 on 2014/11/30.
 */
public class GoodsSpecificationsProductRp {
    private String goodsSpPrRpTid;  //goodsSpecificationsProductRpTid
    private String goodsId;
    private String specificationsId;
    private String productId;

    public String getGoodsSpecificationsProductRpTid() {
        return goodsSpPrRpTid;
    }

    public void setGoodsSpecificationsProductRpTid(String goodsSpecificationsProductRpTid) {
        this.goodsSpPrRpTid = goodsSpecificationsProductRpTid;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpecificationsId() {
        return specificationsId;
    }

    public void setSpecificationsId(String specificationsId) {
        this.specificationsId = specificationsId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
