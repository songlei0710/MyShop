package net.hzjxy.myshop.service;

import net.hzjxy.myshop.entity.SerialT;

/**
 * Created by 磊 on 2014/11/30.
 */
public interface SerialService {
    /**
     * 查找新的逻辑id
     * @param biz
     * @return
     */
    public SerialT findByBaseId(String biz);

    /**
     * 更新新的逻辑id
     * @param biz
     * @return
     */
    public int updateByBaseId(SerialT biz);

    /**
     * 获取最新的主键id
     * @return
     */
    public SerialT SerialTLastId(String biz);

}
