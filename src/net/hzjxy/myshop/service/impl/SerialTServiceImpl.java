package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.SerialTDao;
import net.hzjxy.myshop.entity.SerialT;
import net.hzjxy.myshop.service.SerialService;

/**
 * Created by Administrator on 2014/12/18.
 */
public class SerialTServiceImpl implements SerialService {
    private SerialTDao serialTDao;

    public SerialTDao getSerialTDao() {
        return serialTDao;
    }

    public void setSerialTDao(SerialTDao serialTDao) {
        this.serialTDao = serialTDao;
    }

    @Override
    public SerialT findByBaseId(String biz) {
        return this.getSerialTDao().findByBaseId(biz);
    }

    @Override
    public int updateByBaseId(SerialT biz) {
        return this.getSerialTDao().updateByBaseId(biz);
    }

    @Override
    public SerialT SerialTLastId(String biz) {
        SerialT serialT=this.getSerialTDao().findByBaseId(biz);
        if(serialT!=null){
            this.getSerialTDao().updateByBaseId(serialT);
        }
        return serialT;
    }
}
