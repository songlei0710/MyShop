package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.imgDao;
import net.hzjxy.myshop.entity.Img;
import net.hzjxy.myshop.service.impl.Serial;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/16.
 */
public class imgDaoImpl implements imgDao {
    @Override
    public List<Img> findAllImgT(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        List<Img>imgs=imgDao.findAllImgT(currentPage,lineSize);
        return imgs;
    }

    @Override
    public int countfindAllImgT() {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        imgDao.countfindAllImgT();
        return imgDao.countfindAllImgT();
    }

    @Override
    public Img findImgTByImgName(String imgName) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        imgDao.findImgTByImgName(imgName);
        return imgDao.findImgTByImgName(imgName);
    }

    @Override
    public List<Img> findImgTByusedGoodsidandusedPositionId(String imgId) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        imgDao.findImgTByusedGoodsidandusedPositionId(imgId);
        return imgDao.findImgTByusedGoodsidandusedPositionId(imgId);
    }

    @Override
    public List<Img> findImgTByusedGoodsid(String usedGoodsid) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        List<Img>imgs=findImgTByusedGoodsid(usedGoodsid);
        return imgs;
    }

    @Override
    public List<Img> findImgTByusedGoodsidandPositionIdisNull(String usedGoodsid) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        List<Img>imgs=findImgTByusedGoodsidandPositionIdisNull(usedGoodsid);
        return imgs;
    }

    @Override
    public int updateImgState(String imgId, String state) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        int imgs=imgDao.updateImgState(imgId,state);
        return imgs;
    }

    @Override
    public List<Img> findAllImgTByImgName(int currentPage, int lineSize, String imgName) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        List<Img>imgs=imgDao.findAllImgTByImgName(currentPage,lineSize,imgName);
        return imgs;
    }

    @Override
    public int countfindAllImgTByImgName(String imgName) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        imgDao.countfindAllImgTByImgName(imgName);
        return imgDao.countfindAllImgTByImgName(imgName);
    }

    @Override
    public List<Img> sortAllImgT(int currentPage, int lineSize, String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        List<Img>imgs=sortAllImgT(currentPage,lineSize,queryString);
        return imgs;
    }

    @Override
    public int delImgT(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        imgDao.delImgT(list);
        session.commit();
        return imgDao.delImgT(list);
    }

    @Override
    public int updateImgT(Img i) {
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        int imgs=imgDao.updateImgT(i);
        return imgs;
    }
    @Override
    public int addimg(Img img){
        SqlSession session=MybatisUtil.currentSession();
        imgDao imgDao=session.getMapper(imgDao.class);
        int imgs=imgDao.addimg(img);
        return imgs;
    }


}
