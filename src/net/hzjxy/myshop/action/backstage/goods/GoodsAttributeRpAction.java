package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.GoodsAttributeRp;
import net.hzjxy.myshop.service.GoodsAttributeRpService;
import net.hzjxy.myshop.service.impl.Serial;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Lenovo on 2014/12/23.
 */

@Namespace("")
@ParentPackage("myshop")
public class GoodsAttributeRpAction extends BaseTAction {
    private String id;      //编号
    private String goodsId; //商品编号
    private String attrVal; //商品属性值


    private String basePath;
    private boolean sucFlag;
    private GoodsAttributeRp bean;
    private GoodsAttributeRpService goodsAttributeRpService;

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

    public GoodsAttributeRpService getGoodsAttributeRpService() {
        return goodsAttributeRpService;
    }

    public void setGoodsAttributeRpService(GoodsAttributeRpService goodsAttributeRpService) {
        this.goodsAttributeRpService = goodsAttributeRpService;
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
    @Action(value="addGoodsAttributeRp",results = {@Result(name="json",type="json")})
    public String addGoodsAttributeRp(){
        GoodsAttributeRp goodsAttributeRp=new GoodsAttributeRp();
        goodsAttributeRp.setId(this.getSerial().SerialId(Serial.GOODSATTRIBUTERP));
        goodsAttributeRp.setGoodsId(this.getGoodsId());
        goodsAttributeRp.setAttrVal(this.getAttrVal());

        this.getGoodsAttributeRpService().addGoodsAttributeRp(goodsAttributeRp);
        this.setSucFlag(true);
        this.setBean(goodsAttributeRp);
        return JSON;
    }

}
