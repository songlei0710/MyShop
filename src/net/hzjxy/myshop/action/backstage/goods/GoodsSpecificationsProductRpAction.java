package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.GoodsSpecificationsProductRp;
import net.hzjxy.myshop.service.GoodsSpecificationsProductRpService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Lenovo on 2014/12/23.
 */
@Namespace("")
@ParentPackage("myshop")
public class GoodsSpecificationsProductRpAction extends BaseTAction {
    private String goodsSpecificationsProductRpTid;
    private String goodsId;
    private String specificationsId;
    private String productId;



    private String basePath;
    private boolean sucFlag;
    private GoodsSpecificationsProductRp bean;
    private GoodsSpecificationsProductRpService goodsAttributeService;

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

    public GoodsSpecificationsProductRp getBean() {
        return bean;
    }

    public void setBean(GoodsSpecificationsProductRp bean) {
        this.bean = bean;
    }

    public GoodsSpecificationsProductRpService getGoodsAttributeService() {
        return goodsAttributeService;
    }

    public void setGoodsAttributeService(GoodsSpecificationsProductRpService goodsAttributeService) {
        this.goodsAttributeService = goodsAttributeService;
    }

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
