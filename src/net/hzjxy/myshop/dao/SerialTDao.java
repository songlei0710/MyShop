package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.SerialT;

/**
 * Created by 磊 on 2014/11/30.
 */
public interface SerialTDao{
    /**
     * 查找新的逻辑id
     * @param baseid
     * @return
     */
    public  SerialT findByBaseId(String biz);
    /**
     * 更新新的逻辑id
     * @param baseid
     * @return
     */
    public  int updateByBaseId(SerialT transientInstance);
}
