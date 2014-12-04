package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Img;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface imgDao {
    /**
     * 删除图片数据
     *
     * @param list
     * @return
     */
    public int delImgT(String[] list);

    /**
     * 更新图片数据
     *
     * @param i
     * @return
     */
    public int updateImgT(Img i);

    /**
     * 查询所有图片数据
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Img> findAllImgT(final int currentPage, final int lineSize);

    /**
     * 统计查询所有图片数据
     *
     * @return
     */
    public int countfindAllImgT();

    /**
     * 根据图片名称获取图片数据
     *
     * @param imgName
     * @return
     */
    public Img findImgTByImgName(String imgName);

    /**
     * 查找图片是否被引用
     *
     * @return
     */
    public List<Img> findImgTByusedGoodsidandusedPositionId(String imgId);

    /**
     * 根据被商品引用id获取数据
     *
     * @param usedGoodsid
     * @return
     */
    public List<Img> findImgTByusedGoodsid(String usedGoodsid);

    /**
     * 获取被商品引用但是未被自定义引用的图片
     *
     * @param usedGoodsid
     * @return
     */
    public List<Img> findImgTByusedGoodsidandPositionIdisNull(
            String usedGoodsid);

    /**
     * 根据被商品引用id更新状态
     *
     * @param usedGoodsid
     * @param state
     * @return
     */
    public int updateImgState(String imgId, String state);

    /**
     * 根据图片名称获取图片被引用数据
     *
     * @param imgName
     * @return
     */
    public List<Img> findAllImgTByImgName(final int currentPage,
                                           final int lineSize, final String imgName);

    /**
     * 统计根据图片名称获取图片被引用数据
     *
     * @param imgName
     * @return
     */
    public int countfindAllImgTByImgName(String imgName);

    /**
     * 根据排序方式排序所有
     *
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Img> sortAllImgT(final int currentPage, final int lineSize,
                                  String queryString);

}
