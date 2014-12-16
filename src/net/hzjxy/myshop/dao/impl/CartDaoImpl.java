package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.CartDao;
import net.hzjxy.myshop.entity.Cart;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by wx on 2014/12/15.
 */
public  class CartDaoImpl implements CartDao{
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

    @Override
    public int delCartByGoodsId(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.delCartByGoodsId(userid,goodsid,state);
        session.commit();
        return cartDao.delCartByGoodsId(userid,goodsid,state);
    }

    @Override
    public int updateCartNeedquantity(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("needquantity") int needquantity) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartNeedquantity( userid,goodsid,needquantity);
        return cartDao.updateCartNeedquantity(userid,goodsid,needquantity);
    }

    @Override
    public int updateCartSubtotal(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("subtotal") double subtotal) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartSubtotal(userid,goodsid,subtotal);
        return cartDao.updateCartSubtotal(userid,goodsid,subtotal);
    }

    @Override
    public int updateCartState(@Param("userid") String userid, @Param("goodsid") String goodsid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartState(userid,goodsid,state);
        return cartDao.updateCartState(userid, goodsid, state);
    }

    @Override
    public int updateCartStateandOrderidByGoodsidList(@Param("cartid") String cartid, @Param("orderid") String orderid, @Param("userid") String userid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartStateandOrderidByGoodsidList(cartid,orderid,userid,state);
        return cartDao.updateCartStateandOrderidByGoodsidList(cartid,orderid,userid,state);
    }

    @Override
    public int updateCartStateByGoodsidList(@Param("userid") String userid, @Param("goodsid") String[] goodsid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartStateByGoodsidList(userid,goodsid,state);
        return cartDao.updateCartStateByGoodsidList(userid,goodsid,state);
    }

    @Override
    public List<Cart> findCartGoodsByOrderid(String orderid) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        List<Cart> carts=cartDao.findCartGoodsByOrderid(orderid);
        return carts;
    }

    @Override
    public int updateCartIdBygoodsid(@Param("cartid") String cartid, @Param("memberid") String memberid, @Param("goodsid") String goodsid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartIdBygoodsid(cartid,memberid,goodsid,state);
        return cartDao.updateCartIdBygoodsid(cartid,memberid,goodsid,state);
    }

    @Override
    public int updateCartIdByproductid(@Param("cartid") String cartid, @Param("userid") String userid, @Param("productid") String productid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.updateCartIdByproductid(cartid,userid,productid,state);
        return cartDao.updateCartIdByproductid(cartid,userid,productid,state);
    }

    @Override
    public List<Cart> findCartByCartid(@Param("cartid") String cartid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        List<Cart> carts=cartDao.findCartByCartid(cartid,state );
        return carts;
    }

    @Override
    public int delCartByid(String id) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.delCartByid(id);
        session.commit();
        return cartDao.delCartByid(id);
    }

    @Override
    public Cart findProductInCart(@Param("memberid") String memberid, @Param("goodsid") String goodsid, @Param("productid") String productid, @Param("state") String state) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        cartDao.findProductInCart(memberid,goodsid,productid,state);
        return cartDao.findProductInCart(memberid,goodsid,productid,state);
    }

    @Override
    public List<Cart> findAllCartByMemberId(@Param("memberid") String memberid, @Param("state") String state, @Param("orderTag") String orderTag) {
        SqlSession session=MybatisUtil.currentSession();
        CartDao cartDao=session.getMapper(CartDao.class);
        List<Cart> carts=cartDao.findAllCartByMemberId(memberid,state,orderTag);
        return carts;
    }
}
