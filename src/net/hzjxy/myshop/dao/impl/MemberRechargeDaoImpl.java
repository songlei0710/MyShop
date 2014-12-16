package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MenberRechargeDao;
import net.hzjxy.myshop.entity.MemberRecharge;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2008/1/13.
 */
public class MemberRechargeDaoImpl implements MenberRechargeDao{
    @Override
    public List<MemberRecharge> findAllMemberRechargeT(int currentPage, int lineSize) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
        List<MemberRecharge> menberrecharge=menberRechargeDao.findAllMemberRechargeT(currentPage,lineSize);
        return menberrecharge;
    }

    @Override
    public int countfindAllMemberRechargeT() {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
      menberRechargeDao.countfindAllMemberRechargeT();
        return menberRechargeDao.countfindAllMemberRechargeT();
    }

    @Override
    public void updateMemberRechargeT(MemberRecharge mrt) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
        menberRechargeDao.updateMemberRechargeT(mrt);
        session.commit();

    }

    @Override
    public void delMemberRechargeT(String[] strs) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
        menberRechargeDao.delMemberRechargeT(strs);
        session.commit();

    }

    @Override
    public MemberRecharge findMemberRechargeTById(String id) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
        menberRechargeDao.findMemberRechargeTById(id);


        return menberRechargeDao.findMemberRechargeTById(id);
    }

    @Override
    public MemberRecharge findMemberRechargeTByMemberId(String memberid) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
        menberRechargeDao.findMemberRechargeTByMemberId(memberid);
        return menberRechargeDao.findMemberRechargeTByMemberId(memberid);
    }

    @Override
    public int add(@Param("menberRecharge") int menberRecharge) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeDao menberRechargeDao=session.getMapper(MenberRechargeDao.class);
        int add=menberRechargeDao.add(menberRecharge);
        return add;
    }



}
