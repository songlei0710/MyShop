package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsTypeDao;
import net.hzjxy.myshop.entity.GoodsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsTypeDaoImpl implements GoodsTypeDao{
    @Override
    public int delGoodsTypeTN(String[] list) {
        return 0;
    }

    @Override
    public int updateGoodsTypeTN(GoodsType gtn) {
        return 0;
    }

    @Override
    public List<GoodsType> findAllGoodsTypeTN(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindAllGoodsTypeTN() {
        return 0;
    }

    @Override
    public List<GoodsType> findGoodsTypeTNById(String goodsTypeId) {
        return null;
    }

    @Override
    public List<GoodsType> findAllGoodsTypeTNNopage() {
        return null;
    }

    @Override
    public List<GoodsType> sortAllGoodsTypeTN(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public int countsortAllGoodsTypeTN(String queryString) {
        return 0;
    }

    @Override
    public List<GoodsType> findGoodsTypeTNByName(String name) {
        return null;
    }
}
