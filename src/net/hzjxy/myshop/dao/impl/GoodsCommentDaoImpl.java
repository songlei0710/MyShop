package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsCommentDao;
import net.hzjxy.myshop.entity.GoodsComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsCommentDaoImpl implements GoodsCommentDao {
    @Override
    public int delGoodsComment(String[] list) {
        return 0;
    }

    @Override
    public int updateGoodsCommentorReplyByState(String state, String[] list) {
        return 0;
    }

    @Override
    public List<GoodsComment> findGoodsCommentByGoodsid(String goodsid, int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countfindGoodsCommentByGoodsid(String goodsid) {
        return 0;
    }

    @Override
    public List<GoodsComment> findAllGoodsComment(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countfindAllGoodsComment() {
        return 0;
    }

    @Override
    public List<GoodsComment> sortAllGoodsComment(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public GoodsComment findGoodsCommentById(String id) {
        return null;
    }

    @Override
    public void updateGoodsComment(GoodsComment gct) {

    }
}
