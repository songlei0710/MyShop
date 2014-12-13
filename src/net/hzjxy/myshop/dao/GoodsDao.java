package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 2014/12/4.
 */
public interface GoodsDao {
    /**
     *
     * @param list
     * @param creatorid
     * @return
     */
    public int delGoods(@Param("list") String[] list, @Param("creatorid") String creatorid);

    /**
     * 更新商品
     *
     * @param goods
     * @return
     */
    public void updateGoods(Goods goods);

    /**
     * 查询所有商品信息
     *
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @return
     */
    public List<Goods> findAllGoodsByPageId(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize,
                                     final @Param("creatorid") String creatorid);
    /**
     * 查询所有商品信息
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findAllGoodsByPage(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);
    /**
     * 查询所有没有条件商品
     *
     * @return
     */
    public List<Goods> findAllGoods();

    /**
     * 统计所有商品信息
     *
     * @param creatorid
     * @return
     */
    public int countAllGoodsById(String creatorid);
    /**
     * 统计所有商品
     * @return
     */
    public int countAllGoods();

    /**
     * 根据sql统计商品
     * @param queryString
     * @return
     */
    public int countAllGoodsBysql(String queryString);

    /**
     * 根据id获取商品信息
     *
     * @param goodsid
     * @return
     */
    public Goods findGoodsById(String goodsid);

    /**
     * 根据导航id获取商品列表
     * @param navid
     * @param salestate
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findGoodsByNavidByPage(final @Param("navid") String navid,
                                         final @Param("salestate") String salestate, final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

    /**
     * 统计根据导航id获取商品列表
     *
     * @param navid
     * @param salestate
     * @return
     */
    public int countfindGoodsByNavid(@Param("navid") String navid, @Param("salestate") String salestate);

    /**
     * 根据二级分类id获取商品列表
     * @param ltypeid
     * @param salestate
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findGoodsByLtypeidByPage(final @Param("ltypeid") String ltypeid,
                                           final @Param("salestate") String salestate, final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize);

    /**
     * 统计根据二级分类id获取商品列表
     * @param ltypeid
     * @param salestate
     * @return
     */
    public int countfindGoodsByLtypeid(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate);

    /**
     * 根据三级分类id获取商品列表
     * @param stypeid
     * @param salestate
     * @return
     */
    public List<Goods> findGoodsByStypeid(@Param("stypeid") String stypeid, @Param("salestate") String salestate);

    /**
     * 批量更新商品上下架
     *
     * @param salestate
     * @param goodsid
     * @param creatorid
     * @return
     */
    public int updateGoodsSaleStateById(@Param("goodsid") String[] goodsid, @Param("salestate") String salestate,
                                    @Param("creatorid") String creatorid);

    /**
     * 根据商品类型id下架商品
     *
     * @param goodsTypeId
     * @param salestate
     * @return
     */
    public int updateGoodsSaleState(@Param("goodsTypeId") String goodsTypeId, @Param("salestate") String salestate);

    /**
     * 根据商品品牌获取商品信息
     *
     * @param brand
     * @return
     */
    public List<Goods> findGoodsBybrand(String brand);

    /**
     * 根据商品名称获取商品信息
     *
     * @param goodsname
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findGoodsByGoodsname(final @Param("currentPage") int currentPage,
                                             final @Param("lineSize") int lineSize, @Param("salestate") String salestate,final @Param("goodsname") String goodsname);

    /**
     * 根据商品型号获取商品信息
     *
     * @param model
     * @return
     */
    public List<Goods> findGoodsBymodel(String model);

    /**
     * 根据商品价格查询商品信息
     *
     * @param price
     * @return
     */
    public List<Goods> findGoodsByprice(String price);

    /**
     * 根据关键字查询商品信息
     * @param keywordid
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findGoodsByKeyword(@Param("keywordid") String keywordid, @Param("currentPage") int currentPage,
                                           @Param("lineSize") int lineSize);

    /**
     * 统计根据关键字查询商品信息
     *
     * @param keywordid
     * @return
     */
    public int countfindGoodsByKeyword(String keywordid);

    /**
     * 根据用户自定义商品编号查询商品信息
     *
     * @param usersetnum
     * @return
     */
    public List<Goods> findGoodsByusersetnum(String usersetnum);

    /**
     * 根据商品id更新商品浏览次数
     *
     * @param goodsid
     * @return
     */
    public int updateGoodsreadcount(String goodsid);

    /**
     * 根据商品id更新关联配件（未使用电子产品适用）
     *
     * @param list
     * @return
     */
    public int updateGoodsrelatedfit(@Param("goodsid") String goodsid, @Param("list") String list);

    /**
     * 根据商品id更新关联商品（现在已经使用到）
     *
     * @param list
     * @return
     */
    public int updateGoodsrelatedgoods(@Param("goodsid") String goodsid, @Param("list") String list);

    /**
     * 根据商品id更新5种商品状态
     *
     * @param recommended
     * @param hotsale
     * @param bargainprice
     * @param isNew
     * @param ismobileplatformgoods
     * @return
     */
    public int updateFiveGoodsState(@Param("goodsid") String[] goodsid, @Param("recommended") String recommended,
                                    @Param("hotsale") String hotsale, @Param("bargainprice") String bargainprice, @Param("isNew") String isNew,
                                    @Param("ismobileplatformgoods") String ismobileplatformgoods);

    /**
     * 根据商品id更新商品是否推荐
     *
     * @param goodsid
     * @param recommended
     * @param creatorid
     * @return
     */
    public int updateGoodsrecommended(@Param("goodsid") String[] goodsid, @Param("recommended") String recommended,
                                      @Param("creatorid") String creatorid);

    /**
     * 根据商品id更新商品是否热销
     *
     * @param goodsid
     * @param hotsale
     * @param creatorid
     * @return
     */
    public int updateGoodshotsale(@Param("goodsid") String[] goodsid, @Param("hotsale") String hotsale,
                                  @Param("creatorid") String creatorid);

    /**
     * 根据商品id更新商品是否特价
     *
     * @param goodsid
     * @param bargainprice
     * @param creatorid
     * @return
     */
    public int updateGoodsbargainprice(@Param("goodsid") String[] goodsid, @Param("bargainprice") String bargainprice,
                                       @Param("creatorid") String creatorid);

    /**
     * 根据商品id更新是否新品
     *
     * @param goodsid
     * @param isNew
     * @param creatorid
     * @return
     */
    public int updateGoodsisNew(@Param("goodsid") String[] goodsid, @Param("isNew") String isNew, @Param("creatorid") String creatorid);

    /**
     * 根据商品id更新是否同步到移动平台
     *
     * @param goodsid
     * @param ismobileplatformgoods
     * @param creatorid
     * @return
     */
    public int updateGoodsismobileplatformgoods(@Param("goodsid") String[] goodsid,
                                                @Param("ismobileplatformgoods") String ismobileplatformgoods, @Param("creatorid") String creatorid);

    /**
     * 根据商品id更新商品排序
     *
     * @param goodsid
     * @param sort
     * @return
     */
    public int updateSort(@Param("goodsid") String goodsid, @Param("sort") Integer sort);

    /**
     * 根据商品id更新商品对应的种类
     *
     * @param goodsid
     * @param goodsortid
     * @return
     */
    public int updateGoodssortid(@Param("goodsid") String goodsid, @Param("goodsortid") String goodsortid);

    /**
     * 根据商品id更新商品种类名称
     *
     * @param goodsid
     * @param goodssortname
     * @return
     */
    public int updateGoodssortname(@Param("goodsid") String goodsid, @Param("goodssortname") String goodssortname);

    /**
     * 更新商品id更新商品回复数量
     *
     * @param goodsid
     * @return
     */
    public int updateGoodsreplycount(String goodsid);

    /**
     * 根据导航，大类，小类，商品名称，查询商品数据用于optiontransforselect
     *
     * @param navid
     * @param ltypeid
     * @param stypeid
     * @param goodsname
     * @return
     */
    public List<Goods> findGoodsForoptiontransferselect(final @Param("navid") String navid,
                                                         final @Param("ltypeid") String ltypeid, final @Param("stypeid") String stypeid, final @Param("goodsname") String goodsname);

    /**
     * 查询所有商品没有分页
     *
     * @return
     */
    public List<Goods> findAllGoodstWithoutSplitpage();

    /**
     * 根据商品分类获取指定条数的商品记录
     *
     * @param nlstypeid
     * @param limit
     * @return
     */
    public List<Goods> findGoodsLimitByGoodsType(@Param("nlstypeid") String nlstypeid, @Param("limit") int limit);

    /**
     * 获取同价位商品集合
     *
     * @param minprice
     * @param maxprice
     * @param goodsid
     * @return
     */
    public List<Goods> findSamepriceGoods(@Param("limit") int limit, @Param("minprice") double minprice,
                                           @Param("maxprice") double maxprice, @Param("goodsid") String goodsid);

    /**
     * 获取更多商品
     *
     * @param nlstypeid
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findMoreGoodsByGoodsType(final @Param("nlstypeid") String nlstypeid,
                                                 final @Param("currentPage") int currentPage, @Param("lineSize") int lineSize);

    /**
     * 统计获取更多商品
     *
     * @param nlstypeid
     * @return
     */
    public int countfindMoreGoodsByGoodsType(final String nlstypeid);

    /**
     * 搜索商品
     *
     * @param goodsname
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findSearchGoods(final @Param("goodsname") String goodsname,
                                        final @Param("currentPage") int currentPage, @Param("lineSize") int lineSize);

    /**
     * 统计搜索商品
     *
     * @param goodsname
     * @return
     */
    public int countfindSearchGoods(String goodsname);

    /**
     * 获取更多的上架商品（首页更多商品）
     *
     * @param currentPage
     * @param lineSize
     * @param salestate
     * @return
     */
    public List<Goods> findAllGoodslistMore(final @Param("currentPage") int currentPage,
                                             final @Param("lineSize") int lineSize, @Param("salestate") String salestate);

    /**
     * 统计获取更多上架商品
     *
     * @param salestate
     * @return
     */
    public int countfindAllGoodslistMore(String salestate);

    /**
     * 根据商品类型获取更多热卖商品
     *
     * @param nlstypeid
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findMoreHotSaleGoodsByGoodsType(final @Param("nlstypeid") String nlstypeid,
                                                        final @Param("currentPage") int currentPage, @Param("lineSize") int lineSize);

    /**
     * 统计根据商品类型获取更多热卖商品
     *
     * @param nlstypeid
     * @return
     */
    public int countfindMoreHotSaleGoodsByGoodsType(final String nlstypeid);

    /**
     * 根据商品类型获取更多特价商品
     *
     * @param nlstypeid
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findMoreBargainPriceGoodsByGoodsType(
            final @Param("nlstypeid") String nlstypeid, final @Param("currentPage") int currentPage, @Param("lineSize") int lineSize);

    /**
     * 统计根据商品类型获取更多特价商品
     *
     * @param nlstypeid
     * @return
     */
    public int countfindMoreBargainPriceGoodsByGoodsType(final String nlstypeid);

    /**
     * 根据商品类型获取更多推荐商品
     *
     * @param nlstypeid
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findMoreRecommendedGoodsByGoodsType(
            final @Param("nlstypeid") String nlstypeid, final @Param("currentPage") int currentPage, @Param("lineSize") int lineSize);

    /**
     * 统计根据商品类型获取更多推荐商品
     *
     * @param nlstypeid
     * @return
     */
    public int countfindMoreRecommendedGoodsByGoodsType(final String nlstypeid);

    /**
     * 获取更多特价商品
     *
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<Goods> findMoreBargainPriceGoods(final @Param("currentPage") int currentPage,
                                                  @Param("lineSize") int lineSize);

    /**
     * 统计获取更多特价商品
     *
     * @return
     */
    public int countfindMoreBargainPriceGoods();

    /**
     * 获取商品数据给手机客户端
     *
     * @param currentPage
     * @param lineSize
     * @param creatorid
     * @return
     */
    public List<Goods> findAllGoodsByismobileplatformgoods(
            final @Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("creatorid") String creatorid);

    /**
     * 根据顶级分类获取手机端商品
     *
     * @param navid
     * @param salestate
     * @param ismobileplatformgoods
     * @return
     */
    public List<Goods> findAllGoodsByismobileplatformgoodsBynavid(
            @Param("navid") String navid, @Param("salestate") String salestate, @Param("ismobileplatformgoods") String ismobileplatformgoods);

    /**
     * 统计获取商品数据给手机客户端
     *
     * @param creatorid
     * @return
     */
    public int countfindAllGoodsByismobileplatformgoods(String creatorid);

    /**
     * 根据顶级分类获取旗下商品
     *
     * @param navid
     * @param salestate
     * @return
     */
    public List<Goods> findAllGoodsBynavid(@Param("navid") String navid, @Param("salestate") String salestate);

    /**
     * 根据一级分类获旗下商品
     *
     * @param ltypeid
     * @param salestate
     * @return
     */
    public List<Goods> findGoodsByLtypeid(@Param("ltypeid") String ltypeid, @Param("salestate") String salestate);

    /**
     * 根据商品id更新htmlpath
     *
     * @param goodsid
     * @param htmlPath
     * @return
     */
    public int updateHtmlPath(String goodsid, String htmlPath);

    /**
     * 根据商品id更新htmlpath避免重复生成无修改页面
     *
     * @param goodsid
     * @param htmlPath
     * @param updatetime
     * @return
     */
    public int updateHtmlPath(@Param("goodsid") String goodsid, @Param("htmlPath") String htmlPath, @Param("updatetime") Date updatetime);

    /**
     * 获取所有商品用于安装程序生成静态页
     *
     * @param salestate
     * @return
     */
    public List<Goods> finaAllGoodsT(String salestate);

    /**
     * 增加星级评分
     * @param goodsid
     * @param star
     * @return
     */
    public int updatestarsumBygoodsid(@Param("goodsid") String goodsid, @Param("star") int star);

    /**
     * 更新商品总打分人数
     * @param goodsid
     * @param staruser
     * @return
     */
    public int updatestarusersumBygoodsid(@Param("goodsid") String goodsid, @Param("staruser") int staruser);

    /**
     * 更新商品总评分人数
     * @param goodsid
     * @param totalcomment
     * @return
     */
    public int updatecommentsumBygoodsid(@Param("goodsid") String goodsid, @Param("totalcomment") int totalcomment);

    /**
     * 根据传入的状态查询对应的商品顶级分类数据
     *
     * @param navid
     * @param salestate
     * @param sales
     * @param memberprice
     * @param totalcomment
     * @param bargainprice
     * @param hotsale
     * @param recommended
     * @param isNew
     * @param value
     *            筛选值1/0
     * @return
     */
    public List<Goods> findAllGoodsBynavidorderbyParams(@Param("navid") String navid,
                                                         @Param("salestate") String salestate, @Param("sales") String sales, @Param("memberprice") String memberprice,
                                                         @Param("totalcomment") String totalcomment, @Param("bargainprice") String bargainprice, @Param("hotsale") String hotsale,
                                                         @Param("recommended") String recommended, @Param("isNew") String isNew, @Param("value") String value);

    /**
     * 根据传入的状态查询对应的商品
     * @param ltypeid
     * @param salestate
     * @param sales
     * @param memberprice
     * @param totalcomment
     * @param bargainprice
     * @param hotsale
     * @param recommended
     * @param isNew
     * @param value
     * @return
     */
    public List<Goods> findAllGoodsByLtypeidorderbyParams(@Param("ltypeid") String ltypeid,
                                                           @Param("salestate") String salestate, @Param("sales") String sales, @Param("memberprice") String memberprice,
                                                           @Param("totalcomment") String totalcomment, @Param("bargainprice") String bargainprice, @Param("hotsale") String hotsale,
                                                           @Param("recommended") String recommended, @Param("isNew") String isNew, @Param("value") String value);

    /**
     * 根据排序字段按照排序方式排序
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Goods> findAllGoodsBysql(final @Param("currentPage") int currentPage, final @Param("lineSize") int lineSize,final @Param("queryString") String queryString);

    /**
     * 根据商品类型ID更新商品类型名称
     *
     * @param goodsTypeName
     * @param goodsTypeId
     * @return
     */
    public int updateGoodsTypeNameBygoodsTypeId(@Param("goodsTypeName") String goodsTypeName,
                                                @Param("goodsTypeId") String goodsTypeId);

    /**
     * 根据商品分类的id更新商品分类的名称
     *
     * @param queryString
     * @return
     */
    public int updateGoodsCategoryBynlsid(String queryString);

    public List<Goods> findAllGoodsForImgT();

    /**
     * 根据推荐和上架获取商品数据并打乱顺序
     *
     * @param currentPage
     * @param lineSize
     * @param salestate
     * @param recommended
     * @return
     */
    public List<Goods> findshuffleGoods(final @Param("currentPage") int currentPage,
                                         final @Param("lineSize") int lineSize, final @Param("salestate") String salestate, final @Param("recommended") String recommended);

    /**
     * 根据属性获取商品列表
     *
     * @param currentPage
     * @param lineSize
     * @param attr
     * @param salestate
     * @return
     */
    public List<Goods> findGoodsByattrs(final @Param("currentPage") int currentPage,
                                         final @Param("lineSize") int lineSize, final @Param("attr") String attr, final @Param("salestate") String salestate);

    /**
     * 根据商品顶级分类获取移动平台的商品数据
     *
     * @param navid
     * @param salestate
     * @param ismobileplatformgoods
     * @return
     */
    public List<Goods> findGoodsByNavid(@Param("navid") String navid, @Param("salestate") String salestate,
                                         @Param("ismobileplatformgoods") String ismobileplatformgoods);

    /**
     * 根据顶级分类获取旗下商品不包含规格值
     *
     * @param navid
     * @param salestate
     * @return
     */
    public List<Goods> findAllGoodsBynavidSO(@Param("navid") String navid, @Param("salestate") String salestate,
                                            @Param("isSpecificationsOpen") String isSpecificationsOpen);

    /**
     * 根据传入的商品分类数据查询商品集合不包含规格值
     *
     * @param navid
     * @param ltypeid
     * @param salestate
     * @param isSpecificationsOpen
     * @return
     */
    public List<Goods> findAllGoodsBynavidandltypeid(@Param("navid") String navid,
                                                      @Param("ltypeid") String ltypeid, @Param("salestate") String salestate, @Param("isSpecificationsOpen") String isSpecificationsOpen);

    /**
     * 根据传入的商品分类数据查询商品集合不包含规格值
     *
     * @param navid
     * @param ltypeid
     * @param stypeid
     * @param salestate
     * @param isSpecificationsOpen
     * @return
     */
    public List<Goods> findAllGoodsBynavidandltypeidandstypeid(@Param("navid") String navid,
                                                                @Param("ltypeid") String ltypeid, @Param("stypeid") String stypeid, @Param("salestate") String salestate,
                                                                @Param("isSpecificationsOpen") String isSpecificationsOpen);

    /**
     * 根据属性查询商品信息
     * @param currentPage
     * @param lineSize
     * @param queryString
     * @return
     */
    public List<Goods>findAllGoodsByattribute(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("queryString") String queryString);
    /**
     * 统计根据属性查询商品信息
     * @param queryString
     * @return
     */
    public int countfindAllGoodsByattribute(String queryString);

    /**
     * 更新商品库存 库存由货物相加
     * @param oldQuantity
     * @param newQuantity
     * @param goodsid
     * @return
     */
    public int updateGoodsQuantityByGoodsId(@Param("oldQuantity") int oldQuantity, @Param("newQuantity") int newQuantity, @Param("goodsid") String goodsid);
    /**
     * 获取推荐商品
     * @param salestate
     * @param recommended
     * @param lineSize
     * @return
     */
    public List<Goods>findrecommendedGoodsT(@Param("salestate") String salestate, @Param("recommended") String recommended, @Param("lineSize") int lineSize);
    /**
     *  获取虚拟商品
     * @param currentPage
     * @param lineSize
     * @param isvirtualsale
     * @return
     */
    public List<Goods>findvirtualsaleGoodsT(@Param("currentPage") int currentPage, @Param("lineSize") int lineSize, @Param("isvirtualsale") String isvirtualsale);
    /**
     * 统计获取虚拟商品
     * @param isvirtualsale
     * @return
     */
    public int countfindvirtualsaleGoodsT(String isvirtualsale);
}
