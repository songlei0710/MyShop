package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.entity.SerialT;
import net.hzjxy.myshop.service.SerialService;

/**
 * Created by 磊 on 2014/11/30.
 */
public class Serial {
    //用户表主键生成
    public static final String USER="user";
    //商品品牌表主键生成
    public static final String BRAND="Brand";

    public static final String ARTICLE="article";
    public static final String GOODSATTRIBUTE="GoodsAttribute";
    public static final String GOODS="Goods";
    public static final String GOODSATTRIBUTERP="GoodsAttributeRp";
    public static final String GOODSBLINKED="GoodsBlinked";
    public static final String GOODSCATEGORY="GoodsCategory";
    public static final String GOODSCOMMENT="GoodsComment";
    public static final String GOODSDETAIL="GoodsDetail";
    public static final String GOODSSPECIFICATIONSPRODUCTRP="GoodsSpecificationsProductRp";
    public static final String GOODSTYPE="GoodsType";

    private SerialService serialService;

    public SerialService getSerialService() {
        return serialService;
    }

    public void setSerialService(SerialService serialService) {
        this.serialService = serialService;
    }

    public String SerialId(String serialKey){
        String serialId=null;
        SerialT serialT=this.getSerialService().SerialTLastId(serialKey);
        serialId=serialT.getHead()+serialT.getLastId();
        return serialId;
    }

}
