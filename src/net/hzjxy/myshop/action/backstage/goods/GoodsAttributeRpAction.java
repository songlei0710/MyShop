package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.entity.GoodsAttributeRp;
import net.hzjxy.myshop.service.GoodsAttributeRpService;

/**
 * Created by Lenovo on 2014/12/23.
 */
public class GoodsAttributeRpAction {
    private String id;      //编号
    private String goodsId; //商品编号
    private String attrVal; //商品属性值


    private String basePath;
    private boolean sucFlag;
    private GoodsAttributeRp bean;
    private GoodsAttributeRpService goodsAttributeService;

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public boolean isSucFlag() {
        return sucFlag;
    }

    public void setSucFlag(boolean sucFlag) {
        this.sucFlag = sucFlag;
    }

    public GoodsAttributeRp getBean() {
        return bean;
    }

    public void setBean(GoodsAttributeRp bean) {
        this.bean = bean;
    }

    public GoodsAttributeRpService getGoodsAttributeService() {
        return goodsAttributeService;
    }

    public void setGoodsAttributeService(GoodsAttributeRpService goodsAttributeService) {
        this.goodsAttributeService = goodsAttributeService;
    }

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
