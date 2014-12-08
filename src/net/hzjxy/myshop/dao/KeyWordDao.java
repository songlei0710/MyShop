package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Keyword;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface KeyWordDao {
    /**
     * 删除关键字（更新显示到隐藏）
     *
     * @param list
     * @return
     */
    public int delKeywordT(String[] list);

    /**
     * 更新关键字（排序和前台显示有关系数字越大越靠前）
     *
     * @param kt
     * @return
     */
    public int updateKeywordT(Keyword kt);

    /**
     * 查询所有关键字
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Keyword> findAllKeywordT(final int currentPage,
                                          final int lineSize);

    /**
     * 统计所有关键字
     *
     * @return
     */
    public int countAllKeywordT();

    /**
     * 根据id获取关键字
     *
     * @param keywordid
     * @return
     */
    public Keyword findKeywordById(String keywordid);

    /**
     * 根据关键字名称更新关键字使用次数
     *
     * @param keywordname
     * @return
     */
    public int updatekeywordsearchcount(String keywordname);

    /**
     * 查询所有关键字json方式
     *
     * @return
     */
    public List<Keyword> findAllKeywordTjson();

    /**
     * 获取指定个数的关键字，前台index使用
     *
     * @param limit
     * @return
     */
    public List<Keyword> findKeywordLimit(int limit);
}
