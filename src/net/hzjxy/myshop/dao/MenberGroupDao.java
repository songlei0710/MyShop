package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.MemberGroup;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface MenberGroupDao{
    /**
     * 查询所有用户分组
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<MemberGroup> findAllMemberGroupT(final int currentPage,final int lineSize);
    /**
     * 统计查询所有用户分组
     * @return
     */
    public int countfindAllMemberGroupT();

    /**
     * 根据创建人id查询所有用户分组
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @return
     */
    public List<MemberGroup>findAllMemberGroupTa(final int currentPage,final int lineSize,String creatorid);
    /**
     * 统计根据创建人id查询所有用户分组
     * @param creatorid
     * @return
     */
    public int countfindAllMemberGroupTb(String creatorid);
    /**
     * 更新用户分组
     * @param mgt
     */
    public void updateMemberGroupT(MemberGroup mgt);
    /**
     * 根据主键id查询用户分组
     * @param id
     * @return
     */
    public MemberGroup findMemberGroupTById(String id);
    /**
     * 批量删除用户分组
     * @param strs
     * @return
     */
    public int delMemberGroupT(String[] strs);
    /**
     * 根据分组名称查询用户分组
     * @param name
     * @return
     */
    public List<MemberGroup>findMemberGroupTByname(String name);
    /**
     * 根据状态查询会员分组
     * @param status
     * @return
     */
    public List<MemberGroup>findAllMemberGroup(String status);


    public int add();

}
