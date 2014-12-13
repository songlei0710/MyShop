package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.GoodsBlinked;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsBlinkedDao {
    /**
     * 更新关联商品（只在单向关联时使用）
     *
     * @param gbel
     * @return
     */
    public int updateGoodsBelinked(GoodsBlinked gbel);

    /**
     * 根据主关联id获取关联商品
     *
     * @param maingoodsid
     * @return
     */
    public List<GoodsBlinked> findGoodsBelinkedBymaingoodsid(
            String maingoodsid);

    /**
     * 查询所有关联商品
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<GoodsBlinked> findAllGoodsBelinked(@Param("currentPage") int currentPage,
                                                     @Param("lineSize") int lineSize);

    /**
     * 统计所有关联商品
     * @return
     */
    public int countfindAllGoodsBelinked();

    /**
     * 根据主商品id单向删除关联商品
     *
     * @param maingoodsid
     * @return
     */
    public int delGoodsBelinkedBymaingoodsid(String maingoodsid);

    /**
     * 双向删除关联 商品
     *
     * @param maingoodsid
     * @param sxlinkedgoodsid
     * @return
     */
    public int delGoodsBelinkedBymaingoodsidandsxlinkedgoodsid(
            @Param("maingoodsid") String maingoodsid, @Param("sxlinkedgoodsid") String sxlinkedgoodsid);

    /**
     * 根据主键删除关联商品记录
     *
     * @param strs
     */
    public void delGoodsBelinked(String[] strs);

}
