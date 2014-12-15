package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.FavoriteDao;
import net.hzjxy.myshop.dao.GoodsAttributeDao;
import net.hzjxy.myshop.entity.Favorite;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/15.
 */
public class FavoriteDaoImpl implements FavoriteDao{
    @Override
    public int delArticleT(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        FavoriteDao favoriteDao=session.getMapper(FavoriteDao.class);
        favoriteDao.delArticleT(list);
        session.commit();
        return favoriteDao.delArticleT(list);
    }

    @Override
    public int delFavorite(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        FavoriteDao favoriteDao=session.getMapper(FavoriteDao.class);
        favoriteDao.delFavorite(list);
        session.commit();
        return favoriteDao.delFavorite(list);
    }

    @Override
    public List<Favorite> findAllFavoriteByUserid(String userid, int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        FavoriteDao favoriteDao=session.getMapper(FavoriteDao.class);
        List<Favorite>favorite=favoriteDao.findAllFavoriteByUserid(userid,currentPage,lineSize);
        return favorite;
    }

    @Override
    public int countfindAllFavoriteByUserid(String userid) {
        SqlSession session=MybatisUtil.currentSession();
        FavoriteDao favoriteDao=session.getMapper(FavoriteDao.class);
        favoriteDao.countfindAllFavoriteByUserid(userid);
        return favoriteDao.countfindAllFavoriteByUserid(userid);
    }
}
