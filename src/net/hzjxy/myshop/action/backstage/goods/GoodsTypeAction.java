package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.GoodsType;
import net.hzjxy.myshop.service.GoodsTypeService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.Date;

/**
 * Created by Lenovo on 2014/12/23.
 */
@Namespace("")
@ParentPackage("myshop")
public class GoodsTypeAction extends BaseTAction {
    private String goodsTypeId;
    private String name;
    private Date createTime;
    private String creatorId;
    private String goodsParameter;

    private String basePath;
    private boolean sucFlag;
    private GoodsType bean;
    private GoodsTypeService goodsAttributeService;

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

    public GoodsType getBean() {
        return bean;
    }

    public void setBean(GoodsType bean) {
        this.bean = bean;
    }

    public GoodsTypeService getGoodsAttributeService() {
        return goodsAttributeService;
    }

    public void setGoodsAttributeService(GoodsTypeService goodsAttributeService) {
        this.goodsAttributeService = goodsAttributeService;
    }

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
