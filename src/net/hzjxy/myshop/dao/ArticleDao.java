package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2014/12/4.
 */
public interface ArticleDao {
    /**
     * 批量删除文章
     *
     * @param list
     * @return
     */
    public void delArticle(String[] list);


    void findAllArticles(int currentPage, int lineSize);

}