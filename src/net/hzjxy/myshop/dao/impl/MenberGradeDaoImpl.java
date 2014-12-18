package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MenberGradeDao;
import net.hzjxy.myshop.entity.MemberGrade;
import org.apache.ibatis.annotations.Param;
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
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        MemberGrade memberGrade=menberGradeDao.findMemberGradeTById(id);
        return null;
    }

    @Override
    public void updateMemberGradeTById(MemberGrade mgt) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        menberGradeDao.updateMemberGradeTById(mgt);
        session.commit();
    }

    @Override
    public List<MemberGrade> findAllMemberGradeTa() {
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        List<MemberGrade> mem=menberGradeDao.findAllMemberGradeTa();
        return mem;
    }

    @Override
    public int add(@Param("menber") int menber) {
        SqlSession session=MybatisUtil.currentSession();
        MenberGradeDao menberGradeDao=session.getMapper(MenberGradeDao.class);
        int add=menberGradeDao.add(menber);
        return add;
    }

}
