package net.hzjxy.myshop.entity;

import java.util.Date;
/**
 * 商品属性
 * Created by 磊 on 2014/11/30.
 */
public class GoodsAttribute {

    private String goodsattributeid;        //商品属性Id
    private String goodsattributename;      //商品属性名称
    private String goodsTypeId;             //商品类别Id
    private String goodsTypeName;           //商品类别名称
    private Date createtime;                //创建时间
    private String state;                   //状态（0：表示未启用  1：表示启用）
    private String creatorid;               //创建者Id
    private String attributeType;           //属性显示的类型
    private String attributelist;           //属性列表（用逗号分隔）
    private String sort;                    //排序序号
    private String attributeIndex;          //属性下标
    private String issearch;                //是否支持属性检索
    private String issametolink;            //是否开启属性关联
}
