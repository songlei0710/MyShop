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
    public int delFavorite(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        FavoriteDao favoriteDao=session.getMapper(FavoriteDao.class);
        int favorite=favoriteDao.delFavorite(list);
        session.commit();
        return favorite;
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
        int  favorite =favoriteDao.countfindAllFavoriteByUserid(userid);
        return favorite;
    }

    @Override
    public int addFavorite(Favorite favorite) {
        SqlSession session=MybatisUtil.currentSession();
        FavoriteDao favoriteDao=session.getMapper(FavoriteDao.class);
        int  favoriter =favoriteDao.addFavorite(favorite);
        return favoriter;
    }
}
