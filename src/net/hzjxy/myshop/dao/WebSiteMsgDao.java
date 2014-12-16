package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.WebSiteMsg;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface WebSiteMsgDao {
    /**
     * 批量删除
     *
     * @param list
     * @return
     */
    public int delWebsiteMsgT(String[] list);

    /**
     * 根据发件人获取其所有消息数据
     *
     * @param currentPage
     * @param lineSize
     * @param userId
     * @return
     */
    public List<WebSiteMsg> findAllWebsiteMsgByFromUserid(int currentPage, int lineSize, String userId);

    /**
     * 统计根据发件人获取器所有消息数据
     *
     * @param userId
     * @return
     */
    public int countFindAllWebsiteMsgByFromUserId(String userId);

    /**
     * 查询所有收件人是我的信息
     *
     * @param currentPage
     * @param lineSize
     * @param msgToUsername
     * @return
     */
    public List<WebSiteMsg> findAllWebsiteMsgByToUsername(int currentPage, int lineSize, String msgToUsername);

    /**
     * 统计查询所有收件人是我的信息
     *
     * @return
     */
    public int countFindAllWebsiteMsgByToUsername(String msgToUsername);

    /**
     * 更新消息状态 ，已经读，和未读
     *
     * @param list
     * @param state
     * @return
     */
    public int updateWebsiteMsgState(String[] list, String state);

    /**
     * 根据消息状态统计所有收件人是我消息
     *
     * @param msgToUsername
     * @param state
     * @return
     */
    public int countFindAllWebSiteMsgOfStateByToUsername(String msgToUsername, String state);

    /**
     * 根据id获取站内信消息
     *
     * @param id
     * @return
     */
    public WebSiteMsg findMsgTextById(String id);
}
