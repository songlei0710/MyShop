package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MenberGroupDao;
import net.hzjxy.myshop.entity.MemberGroup;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/18.
 */
public class MenberGroupDaoImpl implements MenberGroupDao{

    @Override
    public List<MemberGroup> findAllMemberGroupT(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        List<MemberGroup> menberGroup=menberGroupDao.findAllMemberGroupT(currentPage,lineSize);
        return null;
    }

    @Override
    public int countfindAllMemberGroupT() {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        menberGroupDao.countfindAllMemberGroupT();
        return 0;
    }

    @Override
    public List<MemberGroup> findAllMemberGroupTa(int currentPage, int lineSize, String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        List<MemberGroup> memberGroup=menberGroupDao.findAllMemberGroupTa(currentPage,lineSize,creatorid);
        return memberGroup;
    }

    @Override
    public int countfindAllMemberGroupTb(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        menberGroupDao.countfindAllMemberGroupTb(creatorid);
        return menberGroupDao.countfindAllMemberGroupTb(creatorid);
    }

    @Override
    public void updateMemberGroupT(MemberGroup mgt) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        menberGroupDao.updateMemberGroupT(mgt);
        session.commit();
    }

    @Override
    public MemberGroup findMemberGroupTById(String id) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        MemberGroup menberGroup=menberGroupDao.findMemberGroupTById(id);
        return menberGroup;
    }

    @Override
    public int delMemberGroupT(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        menberGroupDao.delMemberGroupT(strs);
        session.commit();
        return menberGroupDao.delMemberGroupT(strs);
    }

    @Override
    public List<MemberGroup> findMemberGroupTByname(String name) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        List<MemberGroup> memberGroup=menberGroupDao.findMemberGroupTByname(name);
        return memberGroup;
    }

    @Override
    public List<MemberGroup> findAllMemberGroup(String status) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        List<MemberGroup> memberGroup=menberGroupDao.findAllMemberGroup(status);
        return memberGroup;
    }

    @Override
    public int add(@Param("menberGroup") int menberGroup) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGroupDao menberGroupDao=session.getMapper(MenberGroupDao.class);
        int add=menberGroupDao.add(menberGroup);
        return add;
    }

}
