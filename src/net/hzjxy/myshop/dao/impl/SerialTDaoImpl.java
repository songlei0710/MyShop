package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.SerialTDao;
import net.hzjxy.myshop.entity.SerialT;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by 磊 on 2014/11/30.
 */
public class SerialTDaoImpl implements SerialTDao {
    @Override
    public SerialT findByBaseId(String biz) {
        SqlSession session = MybatisUtil.currentSession();
        SerialTDao serialTDao = session.getMapper(SerialTDao.class);
        return serialTDao.findByBaseId(biz);
    }

    @Override
    public int updateByBaseId(SerialT biz) {
        SqlSession session = MybatisUtil.currentSession();
        SerialTDao serialTDao = session.getMapper(SerialTDao.class);
        int serial = serialTDao.updateByBaseId(biz);
        return serial;
    }


    @Override
    public int addSerialT(SerialT serialT) {
        SqlSession session = MybatisUtil.currentSession();
        SerialTDao serialTDao = session.getMapper(SerialTDao.class);
        int serial = serialTDao.addSerialT(serialT);
        return serial;
    }

}