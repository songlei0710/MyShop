package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.SerialTDao;
import net.hzjxy.myshop.entity.SerialT;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by 磊 on 2014/11/30.
 */
public class SerialTDaoImpl implements SerialTDao {
    private static final Log log= LogFactory.getLog(SerialTDaoImpl.class);


    @Override
    public SerialT findByBaseId(String biz) {
       log.debug("findByBaseId");
        return null;
    }

    @Override
    public int updateByBaseId(SerialT transientInstance) {
        return 0;
    }
}
