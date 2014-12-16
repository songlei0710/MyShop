package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.SystemMail;

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
    public int delSystemMail(String id);

    /**
     * 更新系统邮件
     *
     * @param sm
     * @return
     */
    public void updateSystemMail(SystemMail sm);

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
     *
     * @param smialid
     * @return
     */
    public SystemMail findSysMailById(String id);
}
