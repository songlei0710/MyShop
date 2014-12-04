package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Favorite;

import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface FavoriteDao {
    /**
     * 删除收藏品
     * @param list
     * @return
     */
    public int delFavorite(String[] list);

    /**
     * 获取用户的收藏夹集合
     * @param userid
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Favorite> findAllFavoriteByUserid(final String userid,
                                                   final int currentPage, final int lineSize);

    /**
     * 统计获取用户的收藏夹集合
     * @param userid
     * @return
     */
    public int countfindAllFavoriteByUserid(String userid);

}
