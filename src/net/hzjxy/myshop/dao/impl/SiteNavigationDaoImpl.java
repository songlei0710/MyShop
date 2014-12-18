package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.SiteNavigationDao;
import net.hzjxy.myshop.entity.SiteNavigation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public class SiteNavigationDaoImpl implements SiteNavigationDao{
    @Override
    public int delSiteNavigation(@Param("list") String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        int SNg=siteNavigationDao.delSiteNavigation(list);
        return SNg;
    }

    @Override
    public List<SiteNavigation> findAllSiteNavigation(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorId") String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        List<SiteNavigation> siteNavigations=siteNavigationDao.findAllSiteNavigation(currentPage,lineSize,creatorId);
        return siteNavigations;
    }

    @Override
    public int countfindAllSiteNavigationT(@Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        int SNg=siteNavigationDao.countfindAllSiteNavigationT(creatorid);
        return SNg;
    }

    @Override
    public int updateSiteNavigation(@Param("sn") SiteNavigation sn) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        int SNg=siteNavigationDao.updateSiteNavigation(sn);
        return SNg;
    }

    @Override
    public SiteNavigation findSiteNavigationBysnId(@Param("snId") String snId) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        SiteNavigation siteNavigation=siteNavigationDao.findSiteNavigationBysnId(snId);
        return siteNavigation;
    }

    @Override
    public List<SiteNavigation> findSiteNavigationByPosition(@Param("isVisible") String isVisible, @Param("position") String position, @Param("creatorId") String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        List<SiteNavigation> siteNavigations=siteNavigationDao.findSiteNavigationByPosition(isVisible,position,creatorId);
        return siteNavigations;
    }

    @Override
    public List<SiteNavigation> findSiteNavigationByIsVisibleByCreatorId(@Param("isVisible") String isVisible, @Param("creatorId") String creatorId) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        List<SiteNavigation> siteNavigations=siteNavigationDao.findSiteNavigationByIsVisibleByCreatorId(isVisible,creatorId);
        return siteNavigations;
    }

    @Override
    public List<SiteNavigation> findSiteNavigationByIsVisible(@Param("isVisible") String isVisible) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        List<SiteNavigation> siteNavigations=siteNavigationDao.findSiteNavigationByIsVisible(isVisible);
        return siteNavigations;
    }

    @Override
    public List<SiteNavigation> sortAllSiteNavigation(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorId") String creatorId, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        List<SiteNavigation> siteNavigations=siteNavigationDao.sortAllSiteNavigation(currentPage,lineSize,creatorId,queryString);
        return siteNavigations;
    }

    @Override
    public int addSiteNavigation(@Param("sNg") SiteNavigation siteNavigation) {
        SqlSession session=MybatisUtil.currentSession();
        SiteNavigationDao siteNavigationDao=session.getMapper(SiteNavigationDao.class);
        int sNg=siteNavigationDao.addSiteNavigation(siteNavigation);
        return sNg;
    }
}
