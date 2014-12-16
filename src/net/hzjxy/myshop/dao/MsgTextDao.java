package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.MsgText;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface MsgTextDao {
    /**
     * 删除站内信消息
     * @param list
     * @return
     */
    public int delMsgText(@Param("list") String[] list);

    /**
     * 更新站内信消息
     * @param mt
     * @return
     */
    public int updateMsgText(@Param("mt") MsgText mt);

    /**
     * 根据id获取站内信消息
     *
     * @param id
     * @return
     */
    public MsgText findMsgTextById(@Param("id") String id);

    /**
     * 获取所有站内信
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<MsgText> findAllMsgText(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

    /**
     * 统计获取所有站内信
     * @return
     */
    public int countFindAllMsgText();
    public int add(@Param("msgText") MsgText msgText);
}
