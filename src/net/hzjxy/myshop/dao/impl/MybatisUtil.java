package net.hzjxy.myshop.dao.impl;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * MyBatis帮助类
 * Created by 宋磊 on 2014/12/1.
 */
public class MybatisUtil {
    private static final String resource = "MyBatis-config.xml";
    private static Reader reader;
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static final ThreadLocal<SqlSession> THREAD_LOCAL = new ThreadLocal<SqlSession>();

    public static SqlSession currentSession(){
        SqlSession session = THREAD_LOCAL.get();
        if(session==null){
            session = sqlSessionFactory.openSession();
            THREAD_LOCAL.set(session);
        }
        return session;
    }

    public static void closeSession(){
        SqlSession session = THREAD_LOCAL.get();
        THREAD_LOCAL.set(null);
        if(session!=null){
            session.close();
        }
    }
}
