package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.GoodsDetail;
import net.hzjxy.myshop.service.GoodsDetailService;
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
public class GoodsDetailAction extends BaseTAction {
    private String id;
    private String goodsId;
    private String detail;


    private String basePath;
    private boolean sucFlag;
    private GoodsDetail bean;
    private GoodsDetailService goodsDetailService;

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

    public GoodsDetail getBean() {
        return bean;
    }

    public void setBean(GoodsDetail bean) {
        this.bean = bean;
    }

    public GoodsDetailService getGoodsDetailService() {
        return goodsDetailService;
    }

    public void setGoodsDetailService(GoodsDetailService goodsDetailService) {
        this.goodsDetailService = goodsDetailService;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    @Action(value="addGoodsDetail",results={@Result(name="json",type="json")})
    public String addGoodsDetail(){
        GoodsDetail goodsDetail=new GoodsDetail();
        goodsDetail.setId(this.getSerial().SerialId(Serial.GOODSDETAIL));
        goodsDetail.setDetail(this.getDetail());
        goodsDetail.setGoodsId(this.getGoodsId());

        this.getGoodsDetailService().addGoodsDetail(goodsDetail);
        this.setSucFlag(true);
        this.setBean(goodsDetail);
        return  JSON;
    }
  @Action(value = "update",results = {@Result(name="json",type = "json")})
    public String update(){  return JSON;}
}
