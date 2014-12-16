package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.MemberGrade;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/4.
 */
public interface MenberGradeDao {
    /**
     * 删除会员等级
     *
     * @param list
     * @return
     */
    public void delMemberGradeT(String[] strs);

    /**
     * 查询所有会员等级信息
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<MemberGrade> findAllMemberGradeT(final int currentPage, final int lineSize);

    /**
     * 统计查询所有用户等级信息
     *
     * @return
     */
    public int countfindAllMemberGradeT();



    /**
     * 根据用户等级获取等级设置信息
     *
     * @param id
     * @return
     */
    public MemberGrade findMemberGradeTById(String id);

    /**
     * 更新用户等级
     *
     * @param mgt
     * @return
     */
    public void updateMemberGradeTById(MemberGrade mgt);

    /**
     * 查询所有用户等级信息
     * @return
     */
    public List<MemberGrade> findAllMemberGradeTa();
    public int add();

}
