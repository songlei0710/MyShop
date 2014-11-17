package net.hzjxy.myshop.dao.impl;

import net.hzjxy.myshop.dao.GoodsDao;
import net.hzjxy.myshop.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public class GoodsDaoImpl implements GoodsDao{
    @Override
    public int delGoods(@Param("list") String[] list, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public void updateGoods(Goods goods) {

    }

    @Override
    public List<Goods> findAllGoodsByPageId(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsByPage(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public List<Goods> findAllGoods() {
        return null;
    }

    @Override
    public int countAllGoodsById(String creatorid) {
        return 0;
    }

    @Override
    public int countAllGoods() {
        return 0;
    }

    @Override
    public int countAllGoodsBysql(String queryString) {
        return 0;
    }

    @Override
    public Goods findGoodsById(String goodsid) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByNavidByPage(@Param("navid") String navid, @Param("salestate") String salestate, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindGoodsByNavid(@Param("navid") String navid, @Param("salestate") String salestate) {
        return 0;
    }

    @Override
    public List<Goods> findGoodsByLtypeidByPage(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindGoodsByLtypeid(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate) {
        return 0;
    }

    @Override
    public List<Goods> findGoodsByStypeid(@Param("stypeid") String stypeid, @Param("salestate") String salestate) {
        return null;
    }

    @Override
    public int updateGoodsSaleStateById(@Param("goodsid") String[] goodsid, @Param("salestate") String salestate, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public int updateGoodsSaleState(@Param("goodsTypeId") String goodsTypeId, @Param("salestate") String salestate) {
        return 0;
    }

    @Override
    public List<Goods> findGoodsBybrand(String brand) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByGoodsname(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("salestate") String salestate, @Param("goodsname") String goodsname) {
        return null;
    }

    @Override
    public List<Goods> findGoodsBymodel(String model) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByprice(String price) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByKeyword(@Param("keywordid") String keywordid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindGoodsByKeyword(String keywordid) {
        return 0;
    }

    @Override
    public List<Goods> findGoodsByusersetnum(String usersetnum) {
        return null;
    }

    @Override
    public int updateGoodsreadcount(String goodsid) {
        return 0;
    }

    @Override
    public int updateGoodsrelatedfit(@Param("goodsid") String goodsid, @Param("list") String list) {
        return 0;
    }

    @Override
    public int updateGoodsrelatedgoods(@Param("goodsid") String goodsid, @Param("list") String list) {
        return 0;
    }

    @Override
    public int updateFiveGoodsState(@Param("goodsid") String[] goodsid, @Param("recommended") String recommended, @Param("hotsale") String hotsale, @Param("bargainprice") String bargainprice, @Param("isNew") String isNew, @Param("ismobileplatformgoods") String ismobileplatformgoods) {
        return 0;
    }

    @Override
    public int updateGoodsrecommended(@Param("goodsid") String[] goodsid, @Param("recommended") String recommended, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public int updateGoodshotsale(@Param("goodsid") String[] goodsid, @Param("hotsale") String hotsale, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public int updateGoodsbargainprice(@Param("goodsid") String[] goodsid, @Param("bargainprice") String bargainprice, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public int updateGoodsisNew(@Param("goodsid") String[] goodsid, @Param("isNew") String isNew, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public int updateGoodsismobileplatformgoods(@Param("goodsid") String[] goodsid, @Param("ismobileplatformgoods") String ismobileplatformgoods, @Param("creatorid") String creatorid) {
        return 0;
    }

    @Override
    public int updateSort(@Param("goodsid") String goodsid, @Param("sort") Integer sort) {
        return 0;
    }

    @Override
    public int updateGoodssortid(@Param("goodsid") String goodsid, @Param("goodsortid") String goodsortid) {
        return 0;
    }

    @Override
    public int updateGoodssortname(@Param("goodsid") String goodsid, @Param("goodssortname") String goodssortname) {
        return 0;
    }

    @Override
    public int updateGoodsreplycount(String goodsid) {
        return 0;
    }

    @Override
    public List<Goods> findGoodsForoptiontransferselect(@Param("navid") String navid, @Param("ltypeid") String ltypeid, @Param("stypeid") String stypeid, @Param("goodsname") String goodsname) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodstWithoutSplitpage() {
        return null;
    }

    @Override
    public List<Goods> findGoodsLimitByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("limit") int limit) {
        return null;
    }

    @Override
    public List<Goods> findSamepriceGoods(@Param("limit") int limit, @Param("minprice") double minprice, @Param("maxprice") double maxprice, @Param("goodsid") String goodsid) {
        return null;
    }

    @Override
    public List<Goods> findMoreGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindMoreGoodsByGoodsType(String nlstypeid) {
        return 0;
    }

    @Override
    public List<Goods> findSearchGoods(@Param("goodsname") String goodsname, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindSearchGoods(String goodsname) {
        return 0;
    }

    @Override
    public List<Goods> findAllGoodslistMore(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("salestate") String salestate) {
        return null;
    }

    @Override
    public int countfindAllGoodslistMore(String salestate) {
        return 0;
    }

    @Override
    public List<Goods> findMoreHotSaleGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindMoreHotSaleGoodsByGoodsType(String nlstypeid) {
        return 0;
    }

    @Override
    public List<Goods> findMoreBargainPriceGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindMoreBargainPriceGoodsByGoodsType(String nlstypeid) {
        return 0;
    }

    @Override
    public List<Goods> findMoreRecommendedGoodsByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindMoreRecommendedGoodsByGoodsType(String nlstypeid) {
        return 0;
    }

    @Override
    public List<Goods> findMoreBargainPriceGoods(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public int countfindMoreBargainPriceGoods() {
        return 0;
    }

    @Override
    public List<Goods> findAllGoodsByismobileplatformgoods(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsByismobileplatformgoodsBynavid(@Param("navid") String navid, @Param("salestate") String salestate, @Param("ismobileplatformgoods") String ismobileplatformgoods) {
        return null;
    }

    @Override
    public int countfindAllGoodsByismobileplatformgoods(String creatorid) {
        return 0;
    }

    @Override
    public List<Goods> findAllGoodsBynavid(@Param("navid") String navid, @Param("salestate") String salestate) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByLtypeid(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate) {
        return null;
    }

    @Override
    public int updateHtmlPath(String goodsid, String htmlPath) {
        return 0;
    }

    @Override
    public int updateHtmlPath(@Param("goodsid") String goodsid, @Param("htmlPath") String htmlPath, @Param("updatetime") Date updatetime) {
        return 0;
    }

    @Override
    public List<Goods> finaAllGoodsT(String salestate) {
        return null;
    }

    @Override
    public int updatestarsumBygoodsid(@Param("goodsid") String goodsid, @Param("star") int star) {
        return 0;
    }

    @Override
    public int updatestarusersumBygoodsid(@Param("goodsid") String goodsid, @Param("staruser") int staruser) {
        return 0;
    }

    @Override
    public int updatecommentsumBygoodsid(@Param("goodsid") String goodsid, @Param("totalcomment") int totalcomment) {
        return 0;
    }

    @Override
    public List<Goods> findAllGoodsBynavidorderbyParams(@Param("navid") String navid, @Param("salestate") String salestate, @Param("sales") String sales, @Param("memberprice") String memberprice, @Param("totalcomment") String totalcomment, @Param("bargainprice") String bargainprice, @Param("hotsale") String hotsale, @Param("recommended") String recommended, @Param("isNew") String isNew, @Param("value") String value) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsByLtypeidorderbyParams(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("sales") String sales, @Param("memberprice") String memberprice, @Param("totalcomment") String totalcomment, @Param("bargainprice") String bargainprice, @Param("hotsale") String hotsale, @Param("recommended") String recommended, @Param("isNew") String isNew, @Param("value") String value) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsBysql(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public int updateGoodsTypeNameBygoodsTypeId(@Param("goodsTypeName") String goodsTypeName, @Param("goodsTypeId") String goodsTypeId) {
        return 0;
    }

    @Override
    public int updateGoodsCategoryBynlsid(String queryString) {
        return 0;
    }

    @Override
    public List<Goods> findAllGoodsForImgT() {
        return null;
    }

    @Override
    public List<Goods> findshuffleGoods(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("salestate") String salestate, @Param("recommended") String recommended) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByattrs(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("attr") String attr, @Param("salestate") String salestate) {
        return null;
    }

    @Override
    public List<Goods> findGoodsByNavid(@Param("navid") String navid, @Param("salestate") String salestate, @Param("ismobileplatformgoods") String ismobileplatformgoods) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsBynavidSO(@Param("navid") String navid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsBynavidandltypeid(@Param("navid") String navid, @Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsBynavidandltypeidandstypeid(@Param("navid") String navid, @Param("ltypeid") String ltypeid, @Param("stypeid") String stypeid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen) {
        return null;
    }

    @Override
    public List<Goods> findAllGoodsByattribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString) {
        return null;
    }

    @Override
    public int countfindAllGoodsByattribute(String queryString) {
        return 0;
    }

    @Override
    public int updateGoodsQuantityByGoodsId(@Param("oldQuantity") int oldQuantity, @Param("newQuantity") int newQuantity, @Param("goodsid") String goodsid) {
        return 0;
    }

    @Override
    public List<Goods> findrecommendedGoodsT(@Param("salestate") String salestate, @Param("recommended") String recommended, @Param("lineSize") int lineSize) {
        return null;
    }

    @Override
    public List<Goods> findvirtualsaleGoodsT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("isvirtualsale") String isvirtualsale) {
        return null;
    }

    @Override
    public int countfindvirtualsaleGoodsT(String isvirtualsale) {
        return 0;
    }
}
