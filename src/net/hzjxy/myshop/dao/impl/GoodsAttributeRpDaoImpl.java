package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsAttributeRpDao;
import net.hzjxy.myshop.entity.GoodsAttributeRp;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsAttributeRpDaoImpl implements GoodsAttributeRpDao {
    @Override
    public List<GoodsAttributeRp> findGoodsAttributeRpByGoodsId(String goodsId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeRpDao goodsAttributeRpDao=session.getMapper(GoodsAttributeRpDao.class);
        List<GoodsAttributeRp> goodsAttributeRp =goodsAttributeRpDao.findGoodsAttributeRpByGoodsId(goodsId);
        return goodsAttributeRp;
    }

    @Override
    public int delBygoodsId(String goodsId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeRpDao goodsAttributeRpDao=session.getMapper(GoodsAttributeRpDao.class);
        goodsAttributeRpDao.delBygoodsId(goodsId);
        session.commit();
        return goodsAttributeRpDao.delBygoodsId(goodsId);
    }

    @Override
    public List<GoodsAttributeRp> findGoodsIdsByAttr(String attrVal) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeRpDao goodsAttributeRpDao=session.getMapper(GoodsAttributeRpDao.class);
        List<GoodsAttributeRp> goodsAttributeRp =goodsAttributeRpDao.findGoodsIdsByAttr(attrVal);
        return goodsAttributeRp;
    }
}
