package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsAttributeDao;
import net.hzjxy.myshop.entity.GoodsAttribute;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsAttributeDaoImpl implements GoodsAttributeDao {

    @Override
    public int updateGoodsAttribute(GoodsAttribute gat) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.updateGoodsAttribute(gat);
        session.commit();
        return goodsAttributeDao.updateGoodsAttribute(gat);
    }

    @Override
    public GoodsAttribute findGoodsAttributeBygoodsTypeId(String goodsTypeId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        GoodsAttribute goodsAttribute=goodsAttributeDao.findGoodsAttributeBygoodsTypeId(goodsTypeId);
        return goodsAttribute;
    }

    @Override
    public List<GoodsAttribute> findAllGoodsAttribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        List<GoodsAttribute> goodsAttribute =goodsAttributeDao.findAllGoodsAttribute(currentPage,lineSize);
        return goodsAttribute;
    }

    @Override
    public int countFindAllGoodsAttribute() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.countFindAllGoodsAttribute();
        return goodsAttributeDao.countFindAllGoodsAttribute();
    }

    @Override
    public int delGoodsAttribute(String[] list)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.delGoodsAttribute(list);
        session.commit();
        return goodsAttributeDao.delGoodsAttribute(list);
    }

    @Override
    public List<GoodsAttribute> findGoodsAttributeByGoodsTypeName(String goodsTypeName) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        List<GoodsAttribute> goodsAttribute=goodsAttributeDao.findGoodsAttributeByGoodsTypeName(goodsTypeName);
        return goodsAttribute;
    }

    @Override
    public List<GoodsAttribute> findGoodsAttributeByGoodsTypeIdL(String goodsTypeId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        List<GoodsAttribute> goodsAttribute=goodsAttributeDao.findGoodsAttributeByGoodsTypeIdL(goodsTypeId);
        return goodsAttribute;
    }

    @Override
    public int countSortAllGoodsAttribute(String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.countSortAllGoodsAttribute(queryString);
        return goodsAttributeDao.countSortAllGoodsAttribute(queryString);
    }

    @Override
    public List<GoodsAttribute> sortAllGoodsAttribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        List<GoodsAttribute> goodsAttribute =goodsAttributeDao.sortAllGoodsAttribute(currentPage, lineSize, queryString);
        return goodsAttribute;
    }

    @Override
    public int updateGoodsAttributeGoodsTypeName(@Param("goodsTypeName") String goodsTypeName, @Param("goodsTypeId") String goodsTypeId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.updateGoodsAttributeGoodsTypeName(goodsTypeName,goodsTypeId);
        session.commit();
        return goodsAttributeDao.updateGoodsAttributeGoodsTypeName(goodsTypeName,goodsTypeId);
    }

    @Override
    public int updateGoodsAttributeIsSearchByGoodsAttributeId(@Param("goodsattributeId") String[] goodsattributeId, @Param("isSearch") String isSearch) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.updateGoodsAttributeIsSearchByGoodsAttributeId(goodsattributeId,isSearch);
        session.commit();
        return goodsAttributeDao.updateGoodsAttributeIsSearchByGoodsAttributeId(goodsattributeId,isSearch);
    }

    @Override
    public int updateGoodsAttributeIsSameToLinkByGoodsAttributeId(@Param("goodsAttributeId") String[] goodsAttributeId, @Param("isSameToLink") String isSameToLink) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsAttributeDao goodsAttributeDao=session.getMapper(GoodsAttributeDao.class);
        goodsAttributeDao.updateGoodsAttributeIsSameToLinkByGoodsAttributeId(goodsAttributeId,isSameToLink);
        session.commit();
        return goodsAttributeDao.updateGoodsAttributeIsSameToLinkByGoodsAttributeId(goodsAttributeId,isSameToLink);
    }
}
