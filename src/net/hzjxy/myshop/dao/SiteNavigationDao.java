package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.SiteNavigation;
import org.apache.ibatis.annotations.Param;

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
    public int delSiteNavigation(@Param("list") String[] list);

    /**
     * 获取所有导航
     * @param currentPage
     * @param lineSize
     * @param creatorId
     * @return
     */
    public List<SiteNavigation> findAllSiteNavigation(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, @Param("creatorId") String creatorId);

    /**
     * 统计获取所有导航
     *
     * @param creatorid
     * @return
     */
    public int countfindAllSiteNavigationT(@Param("creatorid") String creatorid);

    /**
     * 更新导航
     * @param sn
     * @return
     */
    public int updateSiteNavigation(@Param("sn") SiteNavigation sn);

    /**
     * 根据snid获取导航数据
     * @param snId
     * @return
     */
    public SiteNavigation findSiteNavigationBysnId(@Param("snId") String snId);

    /**
     * 根据导航位置获取导航数据
     * @param isVisible
     * @param position
     * @param creatorId
     * @return
     */
    public List<SiteNavigation> findSiteNavigationByPosition(@Param("isVisible") String isVisible, @Param("position") String position, @Param("creatorId") String creatorId);

    /**
     * 根据是否显示来获取导航数据
     *
     * @param isVisible
     * @param creatorId
     * @return
     */
    public List<SiteNavigation> findSiteNavigationByIsVisibleByCreatorId(@Param("isVisible") String isVisible, @Param("creatorId") String creatorId);

    /**
     * 根据是否显示来获取导航数据无用户id
     * @param isVisible
     * @return
     */
    public List<SiteNavigation> findSiteNavigationByIsVisible(@Param("isVisible") String isVisible);

    /**
     * 根据排序方式查询所有
     *
     * @param currentPage
     * @param lineSize
     * @param creatorId
     * @param queryString
     * @return
     */
    public List<SiteNavigation> sortAllSiteNavigation(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize, @Param("creatorId") String creatorId, @Param("queryString") String queryString);
    /**
     *
     */
    public int addSiteNavigation(@Param("sNg") SiteNavigation siteNavigation);
}
