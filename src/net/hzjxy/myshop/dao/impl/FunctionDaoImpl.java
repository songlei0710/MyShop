package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.FunctionDao;
import net.hzjxy.myshop.entity.Function;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/15.
 */
public class FunctionDaoImpl implements FunctionDao{
    @Override
    public void updateFunctionM(Function fm) {
        SqlSession session=MybatisUtil.currentSession();
        FunctionDao functionDao=session.getMapper(FunctionDao.class);
        functionDao.updateFunctionM(fm);
        session.commit();
    }

    @Override
    public Function findFunctionMById(String id) {
        SqlSession session=MybatisUtil.currentSession();
        FunctionDao functionDao=session.getMapper(FunctionDao.class);
        Function function=functionDao.findFunctionMById(id);
        return function;
    }

    @Override
    public int delFunctionM(String[] strs) {
        SqlSession session=MybatisUtil.currentSession();
        FunctionDao functionDao=session.getMapper(FunctionDao.class);
        functionDao.delFunctionM(strs);
        session.commit();
        return functionDao.delFunctionM(strs);
    }

    @Override
    public List<Function> findAllFunctionM() {
        SqlSession session=MybatisUtil.currentSession();
        FunctionDao functionDao=session.getMapper(FunctionDao.class);
        List<Function>function=functionDao.findAllFunctionM();
        return function;
    }

    @Override
    public List<Function> findAllFunctionMBymoduleid(String moduleid) {
        SqlSession session=MybatisUtil.currentSession();
        FunctionDao functionDao=session.getMapper(FunctionDao.class);
        List<Function>function=functionDao.findAllFunctionMBymoduleid(moduleid);
        return function;
    }
}
