package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.ExpressTemplate;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface ExpressTemplateDao {
    /**
     * 删除快递单模板
     *
     * @param list
     * @return
     */
    public int delExpresstemplete(String[] list);

    /**
     * 更新快递单模板
     *
     * @param et
     * @return
     */
    public int updateExpresstemplete(ExpressTemplate et);

    /**
     * 根据物流商id获取快递单模板
     *
     * @param logisticsid
     * @return
     */
    public ExpressTemplate findExpresstempleteByLogisticsid(String logisticsid);

    /**
     * 查询所有物流商的快递单模板
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<ExpressTemplate> findAllExpresstempleteT(
            final int currentPage, final int lineSize);

    /**
     * 统计查询所有物流商的快递单模板
     *
     * @return
     */
    public int countfindAllExpresstempleteT();

    /**
     * 根据快递单模板编号获取信息
     *
     * @param expresstempleteid
     * @return
     */
    public ExpressTemplate findExpresstempleteBytempleteid(
            String expresstempleteid);

}
