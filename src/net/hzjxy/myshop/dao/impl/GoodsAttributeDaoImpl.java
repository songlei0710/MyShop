package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsAttributeDao;
import net.hzjxy.myshop.entity.GoodsAttribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsAttributeDaoImpl implements GoodsAttributeDao {

    @Override
    public int updateGoodsAttribute(GoodsAttribute gat) {
        return 0;
    }

    @Override
    public GoodsAttribute findGoodsAttributeBygoodsTypeId(String goodsTypeId) {
        return null;
    }

    @Override
    public List<GoodsAttribute> findAllGoodsAttribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countFindAllGoodsAttribute() {
        return 0;
    }

    @Override
    public int delGoodsAttribute(String[] list) {
        return 0;
    }

    @Override
    public List<GoodsAttribute> findGoodsAttributeByGoodsTypeName(String goodsTypeName) {
        return null;
    }

    @Override
    public List<GoodsAttribute> findGoodsAttributeByGoodsTypeId(String goodsTypeId) {
        return null;
    }

    @Override
    public int countSortAllGoodsAttribute(String queryString) {
        return 0;
    }

    @Override
    public List<GoodsAttribute> sortAllGoodsAttribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public int updateGoodsAttributeGoodsTypeName(@Param("goodsTypeName") String goodsTypeName, @Param("goodsTypeId") String goodsTypeId) {
        return 0;
    }

    @Override
    public int updateGoodsAttributeIsSearchByGoodsAttributeId(@Param("goodsattributeId") String[] goodsattributeId, @Param("isSearch") String isSearch) {
        return 0;
    }

    @Override
    public int updateGoodsAttributeIsSameToLinkByGoodsAttributeId(@Param("goodsAttributeId") String[] goodsAttributeId, @Param("isSameToLink") String isSameToLink) {
        return 0;
    }
}
