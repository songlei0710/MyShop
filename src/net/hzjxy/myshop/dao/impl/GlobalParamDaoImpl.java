package net.hzjxy.myshop.dao.impl;


import net.hzjxy.myshop.dao.GlobalParamDao;
import net.hzjxy.myshop.entity.GlobalParam;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2014/12/16.
 */
public class GlobalParamDaoImpl implements GlobalParamDao{
    @Override
    public void updateGolbalParamByKey(GlobalParam gm){
        SqlSession session=MybatisUtil.currentSession();
        GlobalParamDao globalParamDao=session.getMapper(GlobalParamDao.class);
        globalParamDao.updateGolbalParamByKey(gm);
        session.commit();
    }

    @Override
    public GlobalParam findValueByKey(String key) {
        SqlSession session=MybatisUtil.currentSession();
        GlobalParamDao globalParamDao=session.getMapper(GlobalParamDao.class);
        globalParamDao.findValueByKey(key);
        return globalParamDao.findValueByKey(key);
    }

    @Override
    public List<GlobalParam> findAllGlobalParam() {
        SqlSession session=MybatisUtil.currentSession();
        GlobalParamDao globalParamDao=session.getMapper(GlobalParamDao.class);
        globalParamDao.findAllGlobalParam();
        return globalParamDao.findAllGlobalParam();
    }

    @Override
    public int addGlobalParam(GlobalParam globalParam) {
        SqlSession session=MybatisUtil.currentSession();
        GlobalParamDao globalParamDao=session.getMapper(GlobalParamDao.class);
        int global=GlobalParam.addGlobalParam(globalParam);
        return global;
    }


}
