package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.MsgTextDao;
import net.hzjxy.myshop.entity.MsgText;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by linchunlei on 2014/12/9.
 */
public class MsgTextDaoImpl implements MsgTextDao {

    @Override
    public int delMsgText(String[] list) {
        SqlSession session=MybatisUtil.currentSession();
        MsgTextDao msgTextDao=session.getMapper(MsgTextDao.class);
        msgTextDao.delMsgText(list);
        session.commit();
        return msgTextDao.delMsgText(list);
    }

    @Override
    public int updateMsgText(MsgText mt) {
        SqlSession session=MybatisUtil.currentSession();
        MsgTextDao msgTextDao=session.getMapper(MsgTextDao.class);
        int msg=msgTextDao.updateMsgText(mt);
        return msg;
    }

    @Override
    public MsgText findMsgTextById(String id) {
        SqlSession session=MybatisUtil.currentSession();
        MsgTextDao msgTextDao=session.getMapper(MsgTextDao.class);
        MsgText msgText=msgTextDao.findMsgTextById(id);
        return msgText;
    }

    @Override
    public List<MsgText> findAllMsgText(int currentPage, int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        MsgTextDao msgTextDao=session.getMapper(MsgTextDao.class);
        List<MsgText> listmsgText=msgTextDao.findAllMsgText(currentPage,lineSize);
        return listmsgText;
    }

    @Override
    public int countFindAllMsgText() {
        SqlSession session=MybatisUtil.currentSession();
        MsgTextDao msgTextDao=session.getMapper(MsgTextDao.class);
        int countfindall=msgTextDao.countFindAllMsgText();
        return msgTextDao.countFindAllMsgText();
    }

    @Override
    public int add(MsgText msgText) {
        SqlSession session=MybatisUtil.currentSession();
        MsgTextDao msgTextDao=session.getMapper(MsgTextDao.class);
        int add=msgTextDao.add(msgText);
        return add;
    }

}
