package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsDao;
import net.hzjxy.myshop.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsDaoImpl implements GoodsDao{
    @Override
    public int delGoods(@Param("list") String[] list, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.delGoods(list, creatorid);
        session.commit();
        return goodsDao.delGoods(list, creatorid);
    }

    @Override
    public void updateGoods(Goods goods) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoods(goods);
        session.commit();
    }

    @Override
    public List<Goods> findAllGoodsByPageId(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsByPageId(currentPage, lineSize, creatorid);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsByPage(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsByPage(currentPage, lineSize);
        return goods;
    }

    @Override
    public List<Goods> findAllGoods() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoods();
        return goods;
    }

    @Override
    public int countAllGoodsById(String creatorid)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countAllGoodsById(creatorid);
        return goodsDao.countAllGoodsById(creatorid);
    }

    @Override
    public int countAllGoods() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countAllGoods();
        return goodsDao.countAllGoods();
    }

    @Override
    public int countAllGoodsBysql(String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countAllGoodsBysql(queryString);
        return goodsDao.countAllGoodsBysql(queryString);
    }

    @Override
    public Goods findGoodsById(String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.findGoodsById(goodsid);
        return goodsDao.findGoodsById(goodsid);
    }

    @Override
    public List<Goods> findGoodsByNavidByPage(@Param("navid") String navid, @Param("salestate") String salestate, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByNavidByPage(navid, salestate, currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindGoodsByNavid(@Param("navid") String navid, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindGoodsByNavid(navid,salestate);
        return goodsDao.countfindGoodsByNavid(navid,salestate);
    }

    @Override
    public List<Goods> findGoodsByLtypeidByPage(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByLtypeidByPage(ltypeid, salestate, currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindGoodsByLtypeid(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindGoodsByLtypeid(ltypeid, salestate);
        return goodsDao.countfindGoodsByLtypeid(ltypeid, salestate);
    }

    @Override
    public List<Goods> findGoodsByStypeid(@Param("stypeid") String stypeid, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByStypeid(stypeid, salestate);
        return goods;
    }

    @Override
    public int updateGoodsSaleStateById(@Param("goodsid") String[] goodsid, @Param("salestate") String salestate, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsSaleStateById(goodsid, salestate,creatorid);
        session.commit();
        return goodsDao.updateGoodsSaleStateById(goodsid, salestate,creatorid);
    }

    @Override
    public int updateGoodsSaleState(@Param("goodsTypeId") String goodsTypeId, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsSaleState(goodsTypeId, salestate);
        session.commit();
        return goodsDao.updateGoodsSaleState(goodsTypeId, salestate);
    }

    @Override
    public List<Goods> findGoodsBybrand(String brand) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsBybrand(brand);
        return goods;
    }

    @Override
    public List<Goods> findGoodsByGoodsname(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("salestate") String salestate, @Param("goodsname") String goodsname) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByGoodsname(currentPage,lineSize,salestate,goodsname);
        return goods;
    }

    @Override
    public List<Goods> findGoodsBymodel(String model) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsBymodel(model);
        return goods;
    }

    @Override
    public List<Goods> findGoodsByprice(String price) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByprice(price);
        return goods;
    }

    @Override
    public List<Goods> findGoodsByKeyword(@Param("keywordid") String keywordid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByKeyword(keywordid,currentPage,lineSize);
        return goods;
    }

    @Override
    public int countfindGoodsByKeyword(String keywordid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindGoodsByKeyword(keywordid);
        return goodsDao.countfindGoodsByKeyword(keywordid);
    }

    @Override
    public List<Goods> findGoodsByusersetnum(String usersetnum)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByusersetnum(usersetnum);
        return goods;
    }

    @Override
    public int updateGoodsreadcount(String goodsid)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsreadcount(goodsid);
        session.commit();
        return goodsDao.updateGoodsreadcount(goodsid);
    }

    @Override
    public int updateGoodsrelatedfit(@Param("goodsid") String goodsid, @Param("list") String list)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsrelatedfit(goodsid, list);
        session.commit();
        return goodsDao.updateGoodsrelatedfit(goodsid,list);
    }

    @Override
    public int updateGoodsrelatedgoods(@Param("goodsid") String goodsid, @Param("list") String list)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsrelatedgoods(goodsid, list);
        session.commit();
        return goodsDao.updateGoodsrelatedgoods(goodsid, list);
    }

    @Override
    public int updateFiveGoodsState(@Param("goodsid") String[] goodsid, @Param("recommended") String recommended, @Param("hotsale") String hotsale, @Param("bargainprice") String bargainprice, @Param("isNew") String isNew, @Param("ismobileplatformgoods") String ismobileplatformgoods) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateFiveGoodsState(goodsid, recommended, hotsale, bargainprice, isNew, ismobileplatformgoods);
        session.commit();
        return  goodsDao.updateFiveGoodsState(goodsid, recommended,hotsale,bargainprice,isNew,ismobileplatformgoods);
    }

    @Override
    public int updateGoodsrecommended(@Param("goodsid") String[] goodsid, @Param("recommended") String recommended, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsrecommended(goodsid, recommended, creatorid);
        session.commit();
        return goodsDao.updateGoodsrecommended(goodsid, recommended, creatorid);
    }

    @Override
    public int updateGoodshotsale(@Param("goodsid") String[] goodsid, @Param("hotsale") String hotsale, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodshotsale(goodsid, hotsale, creatorid);
        session.commit();
        return goodsDao.updateGoodshotsale(goodsid, hotsale, creatorid);
    }

    @Override
    public int updateGoodsbargainprice(@Param("goodsid") String[] goodsid, @Param("bargainprice") String bargainprice, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsbargainprice(goodsid, bargainprice, creatorid);
        session.commit();
        return goodsDao.updateGoodsbargainprice(goodsid, bargainprice, creatorid);
    }

    @Override
    public int updateGoodsisNew(@Param("goodsid") String[] goodsid, @Param("isNew") String isNew, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsisNew(goodsid, isNew, creatorid);
        session.commit();
        return goodsDao.updateGoodsisNew(goodsid, isNew, creatorid);
    }

    @Override
    public int updateGoodsismobileplatformgoods(@Param("goodsid") String[] goodsid, @Param("ismobileplatformgoods") String ismobileplatformgoods, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsismobileplatformgoods(goodsid, ismobileplatformgoods, creatorid);
        session.commit();
        return goodsDao.updateGoodsismobileplatformgoods(goodsid, ismobileplatformgoods, creatorid);
    }

    @Override
    public int updateSort(@Param("goodsid") String goodsid, @Param("sort") Integer sort)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateSort(goodsid, sort);
        session.commit();
        return goodsDao.updateSort(goodsid, sort);
    }

    @Override
    public int updateGoodssortid(@Param("goodsid") String goodsid, @Param("goodsortid") String goodsortid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodssortid(goodsid, goodsortid);
        session.commit();
        return goodsDao.updateGoodssortid(goodsid, goodsortid);
    }

    @Override
    public int updateGoodssortname(@Param("goodsid") String goodsid, @Param("goodssortname") String goodssortname) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodssortname(goodsid, goodssortname);
        session.commit();
        return goodsDao.updateGoodssortname(goodsid, goodssortname);
    }

    @Override
    public int updateGoodsreplycount(String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsreplycount(goodsid);
        session.commit();
        return goodsDao.updateGoodsreplycount(goodsid);
    }

    @Override
    public List<Goods> findGoodsForoptiontransferselect(@Param("navid") String navid, @Param("ltypeid") String ltypeid, @Param("stypeid") String stypeid, @Param("goodsname") String goodsname) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsForoptiontransferselect(navid,ltypeid,stypeid,goodsname);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodstWithoutSplitpage() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodstWithoutSplitpage();
        return goods;
    }

    @Override
    public List<Goods> findGoodsLimitByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("limit") int limit) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsLimitByGoodsType(nlstypeid, limit);
        return goods;
    }

    @Override
    public List<Goods> findSamepriceGoods(@Param("limit") int limit, @Param("minprice") double minprice, @Param("maxprice") double maxprice, @Param("goodsid") String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findSamepriceGoods(limit, minprice, maxprice, goodsid);
        return goods;
    }

    @Override
    public List<Goods> findMoreGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findMoreGoodsByGoodsType(nlstypeid, currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindMoreGoodsByGoodsType(String nlstypeid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindMoreGoodsByGoodsType(nlstypeid);
        return goodsDao.countfindMoreGoodsByGoodsType(nlstypeid);
    }

    @Override
    public List<Goods> findSearchGoods(@Param("goodsname") String goodsname, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findSearchGoods(goodsname, currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindSearchGoods(String goodsname) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindSearchGoods(goodsname);
        return goodsDao.countfindSearchGoods(goodsname);
    }

    @Override
    public List<Goods> findAllGoodslistMore(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodslistMore(currentPage, lineSize, salestate);
        return goods;
    }

    @Override
    public int countfindAllGoodslistMore(String salestate)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindAllGoodslistMore(salestate);
        return goodsDao.countfindAllGoodslistMore(salestate);
    }

    @Override
    public List<Goods> findMoreHotSaleGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findMoreHotSaleGoodsByGoodsType(nlstypeid,currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindMoreHotSaleGoodsByGoodsType(String nlstypeid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindMoreHotSaleGoodsByGoodsType(nlstypeid);
        return goodsDao.countfindMoreHotSaleGoodsByGoodsType(nlstypeid);
    }

    @Override
    public List<Goods> findMoreBargainPriceGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findMoreBargainPriceGoodsByGoodsType(nlstypeid, currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindMoreBargainPriceGoodsByGoodsType(String nlstypeid)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindMoreBargainPriceGoodsByGoodsType(nlstypeid);
        return goodsDao.countfindMoreBargainPriceGoodsByGoodsType(nlstypeid);
    }

    @Override
    public List<Goods> findMoreRecommendedGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findMoreRecommendedGoodsByGoodsType(nlstypeid, currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindMoreRecommendedGoodsByGoodsType(String nlstypeid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindMoreRecommendedGoodsByGoodsType(nlstypeid);
        return goodsDao.countfindMoreRecommendedGoodsByGoodsType(nlstypeid);
    }

    @Override
    public List<Goods> findMoreBargainPriceGoods(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findMoreBargainPriceGoods( currentPage, lineSize);
        return goods;
    }

    @Override
    public int countfindMoreBargainPriceGoods()
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindMoreBargainPriceGoods();
        return goodsDao.countfindMoreBargainPriceGoods();
    }

    @Override
    public List<Goods> findAllGoodsByismobileplatformgoods(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsByismobileplatformgoods(currentPage, lineSize, creatorid);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsByismobileplatformgoodsBynavid(@Param("navid") String navid, @Param("salestate") String salestate, @Param("ismobileplatformgoods") String ismobileplatformgoods) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsByismobileplatformgoodsBynavid(navid, salestate, ismobileplatformgoods);
        return goods;
    }

    @Override
    public int countfindAllGoodsByismobileplatformgoods(String creatorid)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindAllGoodsByismobileplatformgoods(creatorid);
        return goodsDao.countfindAllGoodsByismobileplatformgoods(creatorid);
    }

    @Override
    public List<Goods> findAllGoodsBynavid(@Param("navid") String navid, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsBynavid(navid, salestate);
        return goods;
    }

    @Override
    public List<Goods> findGoodsByLtypeid(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByLtypeid(ltypeid, salestate);
        return goods;
    }


    @Override
    public int updateHtmlPath(String goodsid, String htmlPath) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateHtmlPath(goodsid,htmlPath);
        session.commit();
        return  goodsDao.updateHtmlPath(goodsid,htmlPath);
    }

    @Override
    public int updateHtmlPath(@Param("goodsid") String goodsid, @Param("htmlPath") String htmlPath, @Param("updatetime") Date updatetime) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateHtmlPath(goodsid,htmlPath,updatetime);
        session.commit();
        return goodsDao.updateHtmlPath(goodsid,htmlPath,updatetime);
    }

    @Override
    public List<Goods> finaAllGoodsT(String salestate)
    {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.finaAllGoodsT(salestate);
        return goods;
    }

    @Override
    public int updatestarsumBygoodsid(@Param("goodsid") String goodsid, @Param("star") int star) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updatestarsumBygoodsid(goodsid, star);
        session.commit();
        return goodsDao.updatestarsumBygoodsid(goodsid, star);
    }

    @Override
    public int updatestarusersumBygoodsid(@Param("goodsid") String goodsid, @Param("staruser") int staruser) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updatestarusersumBygoodsid(goodsid, staruser);
        session.commit();
        return goodsDao.updatestarusersumBygoodsid(goodsid, staruser);
    }

    @Override
    public int updatecommentsumBygoodsid(@Param("goodsid") String goodsid, @Param("totalcomment") int totalcomment) {

        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updatecommentsumBygoodsid(goodsid, totalcomment);
        session.commit();
        return goodsDao.updatecommentsumBygoodsid(goodsid, totalcomment);
    }

    @Override
    public List<Goods> findAllGoodsBynavidorderbyParams(@Param("navid") String navid, @Param("salestate") String salestate, @Param("sales") String sales, @Param("memberprice") String memberprice, @Param("totalcomment") String totalcomment, @Param("bargainprice") String bargainprice, @Param("hotsale") String hotsale, @Param("recommended") String recommended, @Param("isNew") String isNew, @Param("value") String value) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsBynavidorderbyParams(navid,salestate,sales,memberprice,totalcomment,bargainprice,hotsale,recommended,isNew,value);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsByLtypeidorderbyParams(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("sales") String sales, @Param("memberprice") String memberprice, @Param("totalcomment") String totalcomment, @Param("bargainprice") String bargainprice, @Param("hotsale") String hotsale, @Param("recommended") String recommended, @Param("isNew") String isNew, @Param("value") String value) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsByLtypeidorderbyParams(ltypeid, salestate, sales, memberprice, totalcomment, bargainprice, hotsale, recommended, isNew, value);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsBysql(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsBysql(currentPage, lineSize, queryString);
        return goods;
    }

    @Override
    public int updateGoodsTypeNameBygoodsTypeId(@Param("goodsTypeName") String goodsTypeName, @Param("goodsTypeId") String goodsTypeId) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsTypeNameBygoodsTypeId(goodsTypeName, goodsTypeId);
        session.commit();
        return  goodsDao.updateGoodsTypeNameBygoodsTypeId(goodsTypeName, goodsTypeId);
    }

    @Override
    public int updateGoodsCategoryBynlsid(String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsCategoryBynlsid(queryString);
        session.commit();
        return  goodsDao.updateGoodsCategoryBynlsid(queryString);
    }

    @Override
    public List<Goods> findAllGoodsForImgT() {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsForImgT();
        return goods;
    }

    @Override
    public List<Goods> findshuffleGoods(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("salestate") String salestate, @Param("recommended") String recommended) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findshuffleGoods(currentPage, lineSize, salestate, recommended);
        return goods;
    }

    @Override
    public List<Goods> findGoodsByattrs(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("attr") String attr, @Param("salestate") String salestate) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByattrs(currentPage, lineSize, attr, salestate);
        return goods;
    }

    @Override
    public List<Goods> findGoodsByNavid(@Param("navid") String navid, @Param("salestate") String salestate, @Param("ismobileplatformgoods") String ismobileplatformgoods) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findGoodsByNavid(navid, salestate, ismobileplatformgoods);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsBynavidSO(@Param("navid") String navid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsBynavidSO(navid, salestate, isSpecificationsOpen);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsBynavidandltypeid(@Param("navid") String navid, @Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsBynavidandltypeid(navid, ltypeid, salestate, isSpecificationsOpen);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsBynavidandltypeidandstypeid(@Param("navid") String navid, @Param("ltypeid") String ltypeid, @Param("stypeid") String stypeid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsBynavidandltypeidandstypeid(navid, ltypeid, stypeid, salestate, isSpecificationsOpen);
        return goods;
    }

    @Override
    public List<Goods> findAllGoodsByattribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findAllGoodsByattribute(currentPage, lineSize, queryString);
        return goods;
    }

    @Override
    public int countfindAllGoodsByattribute(String queryString) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindAllGoodsByattribute(queryString);
        return goodsDao.countfindAllGoodsByattribute(queryString);
    }

    @Override
    public int updateGoodsQuantityByGoodsId(@Param("oldQuantity") int oldQuantity, @Param("newQuantity") int newQuantity, @Param("goodsid") String goodsid) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.updateGoodsQuantityByGoodsId(oldQuantity,newQuantity,goodsid);
        return goodsDao.updateGoodsQuantityByGoodsId(oldQuantity,newQuantity,goodsid);
    }

    @Override
    public List<Goods> findrecommendedGoodsT(@Param("salestate") String salestate, @Param("recommended") String recommended, @Param("lineSize") int lineSize) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findrecommendedGoodsT(salestate,recommended, lineSize);
        return goods;
    }

    @Override
    public List<Goods> findvirtualsaleGoodsT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("isvirtualsale") String isvirtualsale) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        List<Goods> goods=goodsDao.findvirtualsaleGoodsT(currentPage, lineSize,isvirtualsale);
        return goods;
    }

    @Override
    public int addGoods(Goods goods) {
        return 0;
    }

    @Override
    public int countfindvirtualsaleGoodsT(String isvirtualsale) {
        SqlSession session=MybatisUtil.currentSession();
        GoodsDao goodsDao=session.getMapper(GoodsDao.class);
        goodsDao.countfindvirtualsaleGoodsT(isvirtualsale);
        return goodsDao.countfindvirtualsaleGoodsT(isvirtualsale);
    }
}
