package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.GoodsAttribute;
import net.hzjxy.myshop.service.GoodsAttributeService;
import net.hzjxy.myshop.service.impl.Serial;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.Date;

/**
 * Created by Lenovo on 2014/12/19.
 */
@Namespace("")
@ParentPackage("myshop")
public class GoodsAttributeAction extends BaseTAction{
    private String goodSatTributeId;        //商品属性Id
    private String goodSatTributeName;      //商品属性名称
    private String goodsTypeId;             //商品类别Id
    private String goodsTypeName;           //商品类别名称
    private Date createTime;                //创建时间
    private String state;                   //状态（0：表示未启用  1：表示启用）
    private String creatorId;               //创建者Id
    private String attributeType;           //属性显示的类型
    private String attributeList;           //属性列表（用逗号分隔）
    private String sort;                    //排序序号
    private String attributeIndex;          //属性下标
    private String isSearch;                //是否支持属性检索
    private String isSameToLink;            //是否开启属性关联

    private String basePath;
    private boolean sucFlag;
    private GoodsAttribute bean;
    private GoodsAttributeService goodsAttributeService;
    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
    public GoodsAttribute getBean() {
        return bean;
    }

    public void setBean(GoodsAttribute bean) {
        this.bean = bean;
    }

    public GoodsAttributeService getGoodsAttributeService() {
        return goodsAttributeService;
    }

    public void setGoodsAttributeService(GoodsAttributeService goodsAttributeService) {
        this.goodsAttributeService = goodsAttributeService;
    }

    public boolean isSucFlag() {
        return sucFlag;
    }

    public void setSucFlag(boolean sucFlag) {
        this.sucFlag = sucFlag;
    }

    public String getIsSameToLink() {
        return isSameToLink;
    }

    public void setIsSameToLink(String isSameToLink) {
        this.isSameToLink = isSameToLink;
    }

    public String getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(String attributeList) {
        this.attributeList = attributeList;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getAttributeIndex() {
        return attributeIndex;
    }

    public void setAttributeIndex(String attributeIndex) {
        this.attributeIndex = attributeIndex;
    }

    public String getIsSearch() {
        return isSearch;
    }

    public void setIsSearch(String isSearch) {
        this.isSearch = isSearch;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public String getGoodSatTributeId() {
        return goodSatTributeId;
    }

    public void setGoodSatTributeId(String goodSatTributeId) {
        this.goodSatTributeId = goodSatTributeId;
    }

    public String getGoodSatTributeName() {
        return goodSatTributeName;
    }

    public void setGoodSatTributeName(String goodSatTributeName) {
        this.goodSatTributeName = goodSatTributeName;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
    @Action(value="addAttribute",results = {@Result(name="json",type="json")})
    public String addGoodsAttribute(){
        GoodsAttribute goodsAttribute=new GoodsAttribute();
        goodsAttribute.setGoodSatTributeId(this.getSerial().SerialId(Serial.GOODSATTRIBUTE));
        goodsAttribute.setGoodSatTributeName(this.getGoodSatTributeName());
        goodsAttribute.setGoodsTypeId(this.getGoodsTypeId());
        goodsAttribute.setGoodsTypeName(this.getGoodsTypeName());
        goodsAttribute.setState(this.getState());
        goodsAttribute.setAttributeType(this.getAttributeType());
        goodsAttribute.setAttributeList(this.getAttributeList());
        goodsAttribute.setSort(this.getSort());
        goodsAttribute.setAttributeIndex(this.getAttributeIndex());
        

        this.getGoodsAttributeService().addGoodsAttribute(goodsAttribute);
        this.setSucFlag(true);
        this.setBean(goodsAttribute);
        return JSON;
    }
    public String updateGoodsAttribute(){
        return JSON;
    }
}
