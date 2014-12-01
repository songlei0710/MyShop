package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 文章分类
 * Created by 磊 on 2014/11/30.
 */
public class ArticleCategory {
    private String articleCategoryId;   //文章文类编号
    private String grade;               //级别
    private String metaKeywords;        //页面关键字
    private String metaDes;             //页面描述
    private String name;                //名称
    private String status;              //状态
    private Date createtime;            //创建时间
    private String creatorId;           //创建人Id
    private int sort;                   //排序序号
    private String parentId;            //父类别编号
    private String parentName;          //富类别名称
    private Date updatetime;            //更新时间
    private String htmlpath;            //html路径
    private String logo;                //logo地址
}
