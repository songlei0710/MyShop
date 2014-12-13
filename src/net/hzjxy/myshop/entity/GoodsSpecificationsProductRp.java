package net.hzjxy.myshop.entity;

/**
 * Created by 磊 on 2014/11/30.
 */
public class GoodsSpecificationsProductRp {
    private String goodsSpecificationsProductRpTid;
    private String goodsId;
    private String specidicationsId;
    private String productId;

    public String getGoodsSpecificationsProductRpTid() {
        return goodsSpecificationsProductRpTid;
    }

    public void setGoodsSpecificationsProductRpTid(String goodsSpecificationsProductRpTid) {
        this.goodsSpecificationsProductRpTid = goodsSpecificationsProductRpTid;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpecidicationsId() {
        return specidicationsId;
    }

    public void setSpecidicationsId(String specidicationsId) {
        this.specidicationsId = specidicationsId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
