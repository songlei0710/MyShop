package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.SerialT;

/**
 * Created by 磊 on 2014/11/30.
 */
public interface SerialTDao{
    /**
     * 根据id查找
     * @param biz 编号
     * @return
     */
    public  SerialT findByBaseId(String biz);
    /**
     * 更新 update SerialT as st set st.lastid=st.lastid+st.increment where st.biz=:biz
     * @param biz
     * @return
     */
    public int updateByBaseId(String biz);

    /**
     * 添加
     * @param serialT
     * @return
     */
    public int addSerialT(SerialT serialT);
}
