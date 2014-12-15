package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.SiteNavigation;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface SiteNavigationDao {
    /**
     * 删除导航
     * @param list
     * @return
     */
    public int delSiteNavigation(String[] list);

    /**
     * 获取所有导航
     * @param currentPage
     * @param lineSize
     * @param creatorId
     * @return
     */
    public List<SiteNavigation> findAllSiteNavigation(final int currentPage, final int lineSize, String creatorId);

    /**
     * 统计获取所有导航
     *
     * @param creatorid
     * @return
     */
    public int countfindAllSiteNavigationT(String creatorid);

    /**
     * 更新导航
     * @param sn
     * @return
     */
    public int updateSiteNavigation(SiteNavigation sn);

    /**
     * 根据snid获取导航数据
     * @param snId
     * @return
     */
    public SiteNavigation findSiteNavigationBysnId(String snId);

    /**
     * 根据导航位置获取导航数据
     * @param isVisible
     * @param position
     * @param creatorId
     * @return
     */
    public List<SiteNavigation> findSiteNavigationByPosition(String isVisible, String position, String creatorId);

    /**
     * 根据是否显示来获取导航数据
     *
     * @param isVisible
     * @param creatorId
     * @return
     */
    public List<SiteNavigation> findSiteNavigationByIsVisibleByCreatorId(String isVisible, String creatorId);

    /**
     * 根据是否显示来获取导航数据无用户id
     * @param isVisible
     * @return
     */
    public List<SiteNavigation> findSiteNavigationByIsVisible(String isVisible);

    /**
     * 根据排序方式查询所有
     *
     * @param currentPage
     * @param lineSize
     * @param creatorId
     * @param queryString
     * @return
     */
    public List<SiteNavigation> sortAllSiteNavigation(final int currentPage, final int lineSize, String creatorId, String queryString);
}
