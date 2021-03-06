package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 商品类别
 * Created by 磊 on 2014/11/30.
 */
public class GoodsCategory {
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
}
