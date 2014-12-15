package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.KeyWordDao;
import net.hzjxy.myshop.entity.Keyword;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLPermission;
import java.util.List;

/**
 * Created by linchunlei on 2014/12/14.
 */
public class KeyWordDaoImpl implements KeyWordDao{

    @Override
    public int delKeywordT(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        keyWordDao.delKeywordT(list);
        session.commit();
        return keyWordDao.delKeywordT(list);
    }

    @Override
    public int updateKeywordT(Keyword kt) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        int update=keyWordDao.updateKeywordT(kt);
        return update;
    }

    @Override
    public List<Keyword> findAllKeywordT(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        List<Keyword> keyword=keyWordDao.findAllKeywordT(currentPage,lineSize);
        return keyword;
    }

    @Override
    public int countAllKeywordT() {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        int countall=keyWordDao.countAllKeywordT();
        return keyWordDao.countAllKeywordT();
    }

    @Override
    public Keyword findKeywordById(String keywordid) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        Keyword findkeywordbyid=keyWordDao.findKeywordById(keywordid);
        return findkeywordbyid;
    }

    @Override
    public int updatekeywordsearchcount(String keywordname) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        int updatekeywordsearchcount=keyWordDao.updatekeywordsearchcount(keywordname);
        return updatekeywordsearchcount;
    }

    @Override
    public List<Keyword> findAllKeywordTjson() {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        List<Keyword> findall=keyWordDao.findAllKeywordTjson();
        return keyWordDao.findAllKeywordTjson();
    }

    @Override
    public List<Keyword> findKeywordLimit(int limit) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        List<Keyword> find=keyWordDao.findKeywordLimit(limit);
        return find;
    }

    @Override
    public int add(Keyword keyword) {
        SqlSession session=MybatisUtil.currentSession();
        KeyWordDao keyWordDao=session.getMapper(KeyWordDao.class);
        int add=keyWordDao.add(keyword);
        return add;
    }
}
