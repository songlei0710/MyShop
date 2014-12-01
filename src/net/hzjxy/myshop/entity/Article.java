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
    private Date createtime;        //创建时间
    private String creatorId;       //创建者Id
    private String author;          //作者
    private String isPublication;   //是否发布
    private String isRecommend;     //是否推荐
    private String isTop;           //是否置顶
    private int readCount;          //阅读次数
    private String htmlPath;        //Html路径
    private String isNotice;        //是否公告
    private Date updatetime;        //更新时间
    private String tipContent;      //正文简介
    private String sname;           //二级分类名称
    private String fname;           //一级分类名称
    private String ftypeid;         //一级分类Id
    private String stypeid;         //二级分类Id
    private int sort;               //排序序号
    private String mainPicture;     //主图
    private String isOutsite;       //是否外链
    private String outsitelink;     //外链地址
}
