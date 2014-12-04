package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Function;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface FunctionDao {
    /**
     * 更新模块功能
     *
     * @param fm
     */
    public void updateFunctionM(Function fm);

    /**
     * 根据功能id获取功能信息
     *
     * @param id
     * @return
     */
    public Function findFunctionMById(String id);

    /**
     * 批量删除功能信息
     *
     * @param strs
     * @return
     */
    public int delFunctionM(String[] strs);

    /**
     * 获取所有功能信息
     *
     * @return
     */
    public List<Function> findAllFunctionM();

    /**
     * 根据模块id获取功能列表数据
     *
     * @param moduleid
     * @return
     */
    public List<Function> findAllFunctionMBymoduleid(String moduleid);
}
