package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MenberGradeDao;
import net.hzjxy.myshop.entity.MemberGrade;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/15.
 */
public class MenberGradeDaoImpl implements MenberGradeDao {
    @Override
    public void delMemberGradeT(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        menberGradeDao.delMemberGradeT(strs);
        session.commit();

    }

    @Override
    public List<MemberGrade> findAllMemberGradeT(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        List<MemberGrade> menbergrade=menberGradeDao.findAllMemberGradeT(currentPage,lineSize);
        return menbergrade;
    }

    @Override
    public int countfindAllMemberGradeT() {
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        menberGradeDao.countfindAllMemberGradeT();
        return menberGradeDao.countfindAllMemberGradeT();
    }

    @Override
    public MemberGrade findMemberGradeTById(String id) {
        return null;
    }

    @Override
    public void updateMemberGradeTById(MemberGrade mgt) {

    }

    @Override
    public List<MemberGrade> findAllMemberGradeTa() {
        return null;
    }

    @Override
    public int add() {
        return 0;
    }
}
