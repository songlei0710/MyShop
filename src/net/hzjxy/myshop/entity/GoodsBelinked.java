package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 关联商品
 * Created by 磊 on 2014/11/30.
 */
public class GoodsBelinked {
    private String id;                      //编号
    private String maingoodsid;             //主商品Id
    private String belinkedproductinfo;     //关联商品信息
    private String mode;
    private String state;
    private String creatorid;
    private Date createtime;
    private Date updatetime;
    private String sxlinkedgoodsid;
    private String mainproductid;
    private String shopid;
    private String maingoodsname;
}
