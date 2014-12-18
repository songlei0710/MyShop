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
