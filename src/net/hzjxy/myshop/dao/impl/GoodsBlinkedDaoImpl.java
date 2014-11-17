package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsBlinkedDao;
import net.hzjxy.myshop.entity.GoodsBlinked;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsBlinkedDaoImpl implements GoodsBlinkedDao {
    @Override
    public int updateGoodsBelinked(GoodsBlinked gbel) {
        return 0;
    }

    @Override
    public List<GoodsBlinked> findGoodsBelinkedBymaingoodsid(String maingoodsid) {
        return null;
    }

    @Override
    public List<GoodsBlinked> findAllGoodsBelinked(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindAllGoodsBelinked() {
        return 0;
    }

    @Override
    public int delGoodsBelinkedBymaingoodsid(String maingoodsid) {
        return 0;
    }

    @Override
    public int delGoodsBelinkedBymaingoodsidandsxlinkedgoodsid(@Param("maingoodsid") String maingoodsid, @Param("sxlinkedgoodsid") String sxlinkedgoodsid) {
        return 0;
    }

    @Override
    public void delGoodsBelinked(String[] strs) {

    }
}
