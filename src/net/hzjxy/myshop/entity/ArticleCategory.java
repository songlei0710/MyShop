package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 文章分类
 * Created by 磊 on 2014/11/30.
 */
public class ArticleCategory {
    private String articleCategoryId;  //文章文类编号
    private String grade;               //级别
    private String metaKeywords;        //页面关键字
    private String metaDes;             //页面描述
    private String name;                //名称
    private String status;              //状态
    private Date createTime;            //创建时间
    private String creatorId;           //创建人Id
    private int sort;                   //排序序号
    private String parentId;            //父类别编号
    private String parentName;          //富类别名称
    private Date updateTime;            //更新时间
    private String htmlPath;            //html路径
    private String logo;                //logo地址

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getArticleCategoryId() {
        return articleCategoryId;
    }

    public void setArticleCategoryId(String articleCategoryId) {
        this.articleCategoryId = articleCategoryId;
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

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }
}
