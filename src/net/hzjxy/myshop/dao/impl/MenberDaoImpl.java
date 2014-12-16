package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MenberDao;
import net.hzjxy.myshop.entity.Member;
import org.apache.commons.fileupload.util.LimitedInputStream;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.dispatcher.ng.listener.ListenerHostConfig;

import java.util.List;

/**
 * Created by Administrator on 2015/1/21.
 */
    public class MenberDaoImpl implements MenberDao {
    @Override
    public List<Member> findAllMemberT(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> menber =menberDao.findAllMemberT(currentPage,lineSize);
        return menber;
    }

    @Override
    public int countfindAllMemberT() {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        menberDao.countfindAllMemberT();
        session.commit();
        return menberDao.countfindAllMemberT();
    }

    @Override
    public List<Member> findAllMemberTa(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> men=menberDao.findAllMemberTa(currentPage,lineSize,creatorid);
        return men;
    }

    @Override
    public List<Member> findAllMemberT(int currentPage, int lineSize, String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> men =menberDao.findAllMemberT(currentPage,lineSize);
        return men;
    }

    @Override
    public int countfindAllMemberT(String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        menberDao.countfindAllMemberT(creatorid);
        session.commit();
        return menberDao.countfindAllMemberT(creatorid);
    }

    @Override
    public void updateMemberT(Member mt) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        menberDao.updateMemberT(mt);
        session.commit();

    }

    @Override
    public Member findMemberTById(String id) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        menberDao.countfindAllMemberT(id);
        session.commit();
        return menberDao.findMemberTById(id);
    }

    @Override
    public int delMemberT(String[] strs) {
        SqlSession  session=MybatisUtil.currentSession();
        MenberDao  menberDao=session.getMapper(MenberDao.class);
        menberDao.delMemberT(strs);
        session.commit();
        return menberDao.delMemberT(strs);
    }

    @Override
    public List<Member> findMemberTByloginname(String loginname) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> menb=menberDao.findMemberTByloginname(loginname);
        return  menb;
    }

    @Override
    public List<Member> findMemberTByemail(String email) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> menbe=menberDao.findMemberTByemail(email);
        return menbe;
    }

    @Override
    public List<Member> findMemberTymid(String mid) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> me=menberDao.findMemberTymid(mid);
        return me;
    }

    @Override
    public List<Member> findMemberByQA(String loginname, String question, String answer) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> menber=menberDao.findMemberByQA(loginname,question,answer);
        return menber;
    }

    @Override
    public List<Member> login(Member m) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> menbera =menberDao.login(m);
        return menbera;
    }

    @Override
    public int updateMemberHeadpathByid(Member m) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        menberDao.updateMemberHeadpathByid(m);
        return menberDao.updateMemberHeadpathByid(m);
    }

    @Override
    public int updateMemberPwdProctection(String id, String question, String answer) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        menberDao.updateMemberPwdProctection(id,question,answer);
        return menberDao.updateMemberPwdProctection(id,question,answer);
    }

    @Override
    public List<Member> findMemberLikeLoginname(String loginname) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        List<Member> men=menberDao.findMemberLikeLoginname(loginname);
        session.commit();
        return menberDao.findMemberLikeLoginname(loginname);
    }

    @Override
    public int addMenber(@Param("menber") int menber) {
        SqlSession session=MybatisUtil.currentSession();
        MenberDao menberDao=session.getMapper(MenberDao.class);
        int men=menberDao.addMenber(menber);
        return men;
    }
}
