package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 文章
 * Created by 磊 on 2014/11/30.
 */
public class Article {
    private String articleId;       //文章编号
    private String title;           //标题
    private String metaKeywords;    //页面关键字
    private String metaDes;         //页面描述
    private String contentValue;    //页面内容
    private String status;           //文章状态
    private Date createTime;        //创建时间
    private String creatorId;       //创建者Id
    private String author;          //作者
    private String isPublication;   //是否发布
    private String isRecommend;     //是否推荐
    private String isTop;           //是否置顶
    private int readCount;          //阅读次数
    private String htmlPath;        //Html路径
    private String isNotice;        //是否公告
    private Date updateTime;        //更新时间
    private String tipContent;      //正文简介
    private String sName;           //二级分类名称
    private String fName;           //一级分类名称
    private String fTypeId;         //一级分类Id
    private String sTypeId;         //二级分类Id
    private int sort;               //排序序号
    private String mainPicture;     //主图
    private String isOutSite;       //是否外链
    private String outSiteLink;     //外链地址

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getContentValue() {
        return contentValue;
    }

    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsPublication() {
        return isPublication;
    }

    public void setIsPublication(String isPublication) {
        this.isPublication = isPublication;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfTypeId() {
        return fTypeId;
    }

    public void setfTypeId(String fTypeId) {
        this.fTypeId = fTypeId;
    }

    public String getsTypeId() {
        return sTypeId;
    }

    public void setsTypeId(String sTypeId) {
        this.sTypeId = sTypeId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    public String getIsOutSite() {
        return isOutSite;
    }

    public void setIsOutSite(String isOutSite) {
        this.isOutSite = isOutSite;
    }

    public String getOutSiteLink() {
        return outSiteLink;
    }

    public void setOutSiteLink(String outSiteLink) {
        this.outSiteLink = outSiteLink;
    }
}
