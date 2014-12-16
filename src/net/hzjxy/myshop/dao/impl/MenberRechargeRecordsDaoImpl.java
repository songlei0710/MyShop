package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MenberRechargeRecordsDao;
import net.hzjxy.myshop.entity.MemberRechargeRecords;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2008/1/13.
 */
public class MenberRechargeRecordsDaoImpl implements MenberRechargeRecordsDao {
    @Override
    public List<MemberRechargeRecords> findAllMemberRechargeRecordsT(int currentPage, int lineSize) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeRecordsDao menberRechargeRecordsDao=session.getMapper(MenberRechargeRecordsDao.class);
        List<MemberRechargeRecords> m=menberRechargeRecordsDao.findAllMemberRechargeRecordsT(currentPage,lineSize);
        return m;
    }

    @Override
    public int countfindAllMemberRechargeRecordsT() {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeRecordsDao menberRechargeRecordsDao=session.getMapper(MenberRechargeRecordsDao.class);
        int count=menberRechargeRecordsDao.countfindAllMemberRechargeRecordsT();
        return menberRechargeRecordsDao.countfindAllMemberRechargeRecordsT();
    }

    @Override
    public void delMemberRechargeRecordsT(String[] strs) {
        SqlSession session =MybatisUtil.currentSession();
        MenberRechargeRecordsDao menberRechargeRecordsDao=session.getMapper(MenberRechargeRecordsDao.class);
        menberRechargeRecordsDao.delMemberRechargeRecordsT(strs);
        session.commit();
    }

    @Override
    public int addMemberRechargeRecords( int menberRechargeRecords) {
        SqlSession sqlSession=MybatisUtil.currentSession();
        MenberRechargeRecordsDao menberRechargeRecordsDao=sqlSession.getMapper(MenberRechargeRecordsDao.class);
        int add=menberRechargeRecordsDao.addMemberRechargeRecords(menberRechargeRecords);
        return add;
    }
}
