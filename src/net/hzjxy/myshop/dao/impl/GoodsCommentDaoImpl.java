package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsCommentDao;
import net.hzjxy.myshop.entity.GoodsComment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsCommentDaoImpl implements GoodsCommentDao {
    @Override
    public int delGoodsComment(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        goodsCommentDao.delGoodsComment(list);
        session.commit();
        return  goodsCommentDao.delGoodsComment(list);
    }

    @Override
    public int updateGoodsCommentorReplyByState(String state, String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        goodsCommentDao.updateGoodsCommentorReplyByState(state,list);
        session.commit();
        return  goodsCommentDao.updateGoodsCommentorReplyByState(state,list);
    }

    @Override
    public List<GoodsComment> findGoodsCommentByGoodsid(String goodsid, int currentPage, int lineSize) {
            SqlSession session=MybatisUtil.currentSession();
            GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
            List< GoodsComment>  goodsComment =goodsCommentDao.findGoodsCommentByGoodsid(goodsid,currentPage,lineSize);
            return  goodsComment;
    }

    @Override
    public int countfindGoodsCommentByGoodsid(String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        goodsCommentDao.countfindGoodsCommentByGoodsid(goodsid);
        return goodsCommentDao.countfindGoodsCommentByGoodsid(goodsid);
    }

    @Override
    public List<GoodsComment> findAllGoodsComment(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        List< GoodsComment>  goodsComment =goodsCommentDao.findAllGoodsComment(currentPage, lineSize);
        return  goodsComment;
    }

    @Override
    public int countfindAllGoodsComment() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        goodsCommentDao.countfindAllGoodsComment();
        return goodsCommentDao.countfindAllGoodsComment();
    }

    @Override
    public List<GoodsComment> sortAllGoodsComment(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        List< GoodsComment>  goodsComment =goodsCommentDao.sortAllGoodsComment(currentPage, lineSize, queryString);
        return  goodsComment;
    }

    @Override
    public GoodsComment findGoodsCommentById(String id) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        goodsCommentDao.findGoodsCommentById(id);
        return  goodsCommentDao.findGoodsCommentById(id);
    }

    @Override
    public void updateGoodsComment(GoodsComment gct) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsCommentDao goodsCommentDao=session.getMapper(GoodsCommentDao.class);
        goodsCommentDao.updateGoodsComment(gct);
        session.commit();
    }
}
