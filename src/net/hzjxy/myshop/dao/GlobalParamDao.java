package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GlobalParam;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface GlobalParamDao {
    /**
     * 更新全局变量
     *
     * @param key
     * @param value
     * @return
     */
    public void updateGolbalParamByKey(GlobalParam gm);

    /**
     * 根据key获取全局值
     *
     * @param key
     * @return
     */
    public GlobalParam findValueByKey(String key);

    /**
     * 获取所有全局变量
     *
     * @return
     */
    public List<GlobalParam> findAllGlobalParam();
    public int addGlobalParam(GlobalParam globalParam);

}
