package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Member;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface MenberDao {
    /**
     * 查询所有用户
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Member> findAllMemberT(final int currentPage,final int lineSize);
    /**
     * 统计查询所有用户
     * @return
     */
    public int countfindAllMemberT();

    /**
     * 根据创建人id查询所有用户
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @return
     */
    public List<Member>findAllMemberT(final int currentPage,final int lineSize,String creatorid);
    /**
     * 统计根据创建人id查询所有用户
     * @param creatorid
     * @return
     */
    public int countfindAllMemberT(String creatorid);
    /**
     * 更新用户
     * @param mt
     */
    public void updateMemberT(Member mt);
    /**
     * 根据主键id查询用户
     * @param id
     * @return
     */
    public Member findMemberTById(String id);
    /**
     * 批量删除用户
     * @param strs
     * @return
     */
    public int delMemberT(String[] strs);
    /**
     * 根据名称查询用户
     * @param name
     * @return
     */
    public List<Member>findMemberTByloginname(String loginname);
    /**
     * 根据邮件查询用户
     * @param email
     * @return
     */
    public List<Member> findMemberTByemail(String email);
    /**
     * 根据加密的mid获取用户数据
     * @param mid
     * @return
     */
    public List<Member>findMemberTymid(String mid);
    /**
     * 根据安全问题检查用户是否存在
     * @param loginname
     * @param question
     * @param answer
     * @return
     */
    public List<Member>findMemberByQA(String loginname,String question,String answer);
    /**
     * 会员登录
     * @param m
     * @return
     */
    public List<Member>login(Member m);
    /**
     * 根据id更新会员头像
     * @param m
     * @return
     */
    public int updateMemberHeadpathByid(Member m);
    /**
     * 更新会员密码保护
     * @param id
     * @param question
     * @param answer
     * @return
     */
    public int updateMemberPwdProctection(String id,String question,String answer);
    /**
     * 根据会员名模糊查询
     * @param loginname
     * @return
     */
    public List<Member>findMemberLikeLoginname(String loginname);
}
