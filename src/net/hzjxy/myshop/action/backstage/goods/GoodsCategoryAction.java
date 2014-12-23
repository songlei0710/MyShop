package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.GoodsCategory;
import net.hzjxy.myshop.service.GoodsCategoryService;
import net.hzjxy.myshop.service.impl.Serial;
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
public class GoodsCategoryAction extends BaseTAction {
    private String goodsCategoryTid;
    private String grade;   //级别
    private String metaKeywords;    //关键字
    private String metaDes;         //描述
    private String name;            //名称
    private String state;           //状态
    private String path;            //关系路径
    private Integer sort;           //排序
    private String sign;
    private String goodsTypeId;
    private String parentId;
    private Date createTime;
    private String creatorId;
    private String parentName;
    private String htmlPath;
    private Date updateTime;
    private int version;
    private String logo;
    private String mobilesYnc;


    private String basePath;
    private boolean sucFlag;
    private GoodsCategory bean;
    private GoodsCategoryService goodsCategoryService;

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

    public GoodsCategory getBean() {
        return bean;
    }

    public void setBean(GoodsCategory bean) {
        this.bean = bean;
    }

    public GoodsCategoryService getGoodsCategoryService() {
        return goodsCategoryService;
    }

    public void setGoodsCategoryService(GoodsCategoryService goodsCategoryService) {
        this.goodsCategoryService = goodsCategoryService;
    }

    public String getGoodsCategoryTid() {
        return goodsCategoryTid;
    }

    public void setGoodsCategoryTid(String goodsCategoryTid) {
        this.goodsCategoryTid = goodsCategoryTid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDes() {
        return metaDes;
    }

    public void setMetaDes(String metaDes) {
        this.metaDes = metaDes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMobilesYnc() {
        return mobilesYnc;
    }

    public void setMobilesYnc(String mobilesYnc) {
        this.mobilesYnc = mobilesYnc;
    }
    @Action(value="addGoodsCategory",results = {@Result(name="json",type="json")})
    public String addGoodsCategory() {
        GoodsCategory goodsCategory=new GoodsCategory();
        goodsCategory.setGoodsCategoryTid(this.getSerial().SerialId(Serial.GOODSATTRIBUTE));



        this.getGoodsCategoryService().addGoodsCategory(goodsCategory);
        this.setSucFlag(true);
        this.setBean(goodsCategory);
        return JSON;
    }
    @Action(value = "updateGoodscategoryT",results = {@Result(name="json",type = "json")})
    public String updateGoodscategoryT() {
        return JSON;
    }

}
