package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsBlinkedDao;
import net.hzjxy.myshop.entity.GoodsBlinked;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsBlinkedDaoImpl implements GoodsBlinkedDao {
    @Override
    public int updateGoodsBelinked(GoodsBlinked gbel) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        goodsBlinkedDao.updateGoodsBelinked(gbel);
        session.commit();
        return goodsBlinkedDao.updateGoodsBelinked(gbel);
    }

    @Override
    public List<GoodsBlinked> findGoodsBelinkedBymaingoodsid(String maingoodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        List<GoodsBlinked> goodsBlinked =goodsBlinkedDao.findGoodsBelinkedBymaingoodsid(maingoodsid);
        return goodsBlinked;
    }

    @Override
    public List<GoodsBlinked> findAllGoodsBelinked(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        List<GoodsBlinked> goodsBlinked =goodsBlinkedDao.findAllGoodsBelinked(currentPage,lineSize);
        return goodsBlinked;
    }

    @Override
    public int countfindAllGoodsBelinked() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        goodsBlinkedDao.countfindAllGoodsBelinked();
        return goodsBlinkedDao.countfindAllGoodsBelinked();
    }

    @Override
    public int delGoodsBelinkedBymaingoodsid(String maingoodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        goodsBlinkedDao.delGoodsBelinkedBymaingoodsid(maingoodsid);
        session.commit();
        return goodsBlinkedDao.delGoodsBelinkedBymaingoodsid(maingoodsid);
    }

    @Override
    public int delGoodsBelinkedBymaingoodsidandsxlinkedgoodsid(@Param("maingoodsid") String maingoodsid, @Param("sxlinkedgoodsid") String sxlinkedgoodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        goodsBlinkedDao.delGoodsBelinkedBymaingoodsidandsxlinkedgoodsid(maingoodsid,sxlinkedgoodsid);
        session.commit();
        return goodsBlinkedDao.delGoodsBelinkedBymaingoodsidandsxlinkedgoodsid(maingoodsid,sxlinkedgoodsid);
    }

    @Override
    public void delGoodsBelinked(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsBlinkedDao goodsBlinkedDao=session.getMapper(GoodsBlinkedDao.class);
        goodsBlinkedDao.delGoodsBelinked(strs);
        session.commit();
    }
}
