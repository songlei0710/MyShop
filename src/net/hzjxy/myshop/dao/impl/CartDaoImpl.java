package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.CartDao;
import net.hzjxy.myshop.entity.Cart;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by wx on 2014/12/15.
 */
public abstract class CartDaoImpl implements CartDao{
    @Override
    public List<Cart> findAllCart(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        List<Cart> carts=cartDao.findAllCart(currentPage,lineSize);
        return carts;
    }

    @Override
    public void countfindAllCart() {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.countfindAllCart();
        return;
    }

    @Override
    public List<Cart> findAllCartByUserId(@Param("userid") String userid, @Param("state") String state, @Param("orderTag") String orderTag) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        List<Cart>carts=cartDao.findAllCartByUserId(userid,state,orderTag);
        return carts;
    }

    @Override
    public Cart findGoodsInCartOrNot(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.findGoodsInCartOrNot(userid,goodsid,state);
        return cartDao.findGoodsInCartOrNot(userid,goodsid,state);
    }

    @Override
    public Cart findGoodsInCartOrNot(@Param("userid") String userid, @Param("goodsid") String goodsid, String productid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.findGoodsInCartOrNot(userid,goodsid,productid,state);
        return cartDao.findGoodsInCartOrNot(userid,goodsid,productid,state);
    }

    @Override
    public int updateCartNeedquantityByGoodsid(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("needquantity") int needquantity, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartNeedquantityByGoodsid(userid,goodsid,needquantity,state);
        return cartDao.updateCartNeedquantityByGoodsid(userid,goodsid,needquantity,state);
    }

    @Override
    public int updateCartNeedquantityByGoodsid(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("productid") String productid, @Param("needquantity") int needquantity, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartNeedquantityByGoodsid(userid,goodsid,productid,needquantity,state);
        return cartDao.updateCartNeedquantityByGoodsid(userid,goodsid,productid,needquantity,state);
    }

    @Override
    public int reduceCartNeddquantityByGoodsid(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("needquantity") int needquantity) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.reduceCartNeddquantityByGoodsid(userid,goodsid,needquantity);
        return cartDao.reduceCartNeddquantityByGoodsid(userid,goodsid,needquantity);
    }

}
