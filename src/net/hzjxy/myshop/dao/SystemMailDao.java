package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.SystemMail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2014/12/11.
 */
public interface SystemMailDao {
    /**
     * 删除邮箱
     * @param id
     * @return
     */
    public int delSystemMail(@Param("id") String id);

    /**
     * 更新系统邮件
     *
     * @param sm
     * @return
     */
    public void updateSystemMail(@Param("sm") SystemMail sm);

    /**
     * 查找所有系统邮件
     *
     * @return
     */
    public List<SystemMail> findAllSystemMail();
    /**
     * 统计查询所有系统邮箱
     * @return
     */
    public int countFindAllSystemMail();

    /**
     * id获取邮箱信息
     * smialid
     * @param id
     * @return
     */
    public SystemMail findSysMailById(@Param("id") String id);
}
