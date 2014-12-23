package net.hzjxy.myshop.action.backstage.goods;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.Goods;
import net.hzjxy.myshop.service.GoodsService;
import net.hzjxy.myshop.service.impl.Serial;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.Date;

/**
 * Created by Lenovo on 2014/12/19.
 */
@Namespace("")
@ParentPackage("myshop")
public class GoodsAction extends BaseTAction {
    private String goodsId;
    private String goodsName;
    private String brandName;
    private String nName;
    private String lName;
    private String sName;
    private String fName;
    private String navId;
    private String lTypeId;
    private String sTypeId;
    private Double price;
    private double memberPrice;
    private Double points;
    private String pictureUrl;
    private int quantity;
    private String saleState;
    private String unitName;
    private String keywordName;
    private String weight;
    private Integer readCount;
    private String relatedProductId;
    private String recommended;
    private String hotSale;
    private String bargainPrice;
    private Integer sort;
    private Date createTime;
    private String creatorId;
    private Integer replyCount;
    private String brandId;
    private String placeStore;
    private String metaKeywords;
    private String metaDescription;
    private Double cost;
    private double salePrice;
    private String isNew;
    private String htmlPath;
    private String productSn;
    private String goodsParameterValue;
    private Integer freezeStore;
    private String keywordId;
    private String unitNameId;
    private String goodsTypeId;
    private String goodsTypeName;
    private String userSetNum;
    private String isSpecificationsOpen;
    private Integer totalStar;
    private Integer totalStarUser;
    private Integer totalComment;
    private String isVirtualSale;
    private String isMobilePlatformGoods;
    private Integer sales;
    private Integer realSales;
    private Date updateTime;
    private int version;
    private String commodityList;
    private String isOutSite;
    private String outSiteLink;
    private String subGoodsName;
    private String shopId;
    private String shopName;
    private String isGroup;
    private String isSecondKill;




    private String basePath;
    private boolean sucFlag;
    private Goods bean;
    private GoodsService goodsService;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getNavId() {
        return navId;
    }

    public void setNavId(String navId) {
        this.navId = navId;
    }

    public String getlTypeId() {
        return lTypeId;
    }

    public void setlTypeId(String lTypeId) {
        this.lTypeId = lTypeId;
    }

    public String getsTypeId() {
        return sTypeId;
    }

    public void setsTypeId(String sTypeId) {
        this.sTypeId = sTypeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSaleState() {
        return saleState;
    }

    public void setSaleState(String saleState) {
        this.saleState = saleState;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getKeywordName() {
        return keywordName;
    }

    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getRelatedProductId() {
        return relatedProductId;
    }

    public void setRelatedProductId(String relatedProductId) {
        this.relatedProductId = relatedProductId;
    }

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }

    public String getHotSale() {
        return hotSale;
    }

    public void setHotSale(String hotSale) {
        this.hotSale = hotSale;
    }

    public String getBargainPrice() {
        return bargainPrice;
    }

    public void setBargainPrice(String bargainPrice) {
        this.bargainPrice = bargainPrice;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getPlaceStore() {
        return placeStore;
    }

    public void setPlaceStore(String placeStore) {
        this.placeStore = placeStore;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public String getGoodsParameterValue() {
        return goodsParameterValue;
    }

    public void setGoodsParameterValue(String goodsParameterValue) {
        this.goodsParameterValue = goodsParameterValue;
    }

    public Integer getFreezeStore() {
        return freezeStore;
    }

    public void setFreezeStore(Integer freezeStore) {
        this.freezeStore = freezeStore;
    }

    public String getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    public String getUnitNameId() {
        return unitNameId;
    }

    public void setUnitNameId(String unitNameId) {
        this.unitNameId = unitNameId;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getUserSetNum() {
        return userSetNum;
    }

    public void setUserSetNum(String userSetNum) {
        this.userSetNum = userSetNum;
    }

    public String getIsSpecificationsOpen() {
        return isSpecificationsOpen;
    }

    public void setIsSpecificationsOpen(String isSpecificationsOpen) {
        this.isSpecificationsOpen = isSpecificationsOpen;
    }

    public Integer getTotalStar() {
        return totalStar;
    }

    public void setTotalStar(Integer totalStar) {
        this.totalStar = totalStar;
    }

    public Integer getTotalStarUser() {
        return totalStarUser;
    }

    public void setTotalStarUser(Integer totalStarUser) {
        this.totalStarUser = totalStarUser;
    }

    public Integer getTotalComment() {
        return totalComment;
    }

    public void setTotalComment(Integer totalComment) {
        this.totalComment = totalComment;
    }

    public String getIsVirtualSale() {
        return isVirtualSale;
    }

    public void setIsVirtualSale(String isVirtualSale) {
        this.isVirtualSale = isVirtualSale;
    }

    public String getIsMobilePlatformGoods() {
        return isMobilePlatformGoods;
    }

    public void setIsMobilePlatformGoods(String isMobilePlatformGoods) {
        this.isMobilePlatformGoods = isMobilePlatformGoods;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getRealSales() {
        return realSales;
    }

    public void setRealSales(Integer realSales) {
        this.realSales = realSales;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(String commodityList) {
        this.commodityList = commodityList;
    }

    public String getIsOutSite() {
        return isOutSite;
    }

    public void setIsOutSite(String isOutSite) {
        this.isOutSite = isOutSite;
    }

    public String getOutSiteLink() {
        return outSiteLink;
    }

    public void setOutSiteLink(String outSiteLink) {
        this.outSiteLink = outSiteLink;
    }

    public String getSubGoodsName() {
        return subGoodsName;
    }

    public void setSubGoodsName(String subGoodsName) {
        this.subGoodsName = subGoodsName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup;
    }

    public String getIsSecondKill() {
        return isSecondKill;
    }

    public void setIsSecondKill(String isSecondKill) {
        this.isSecondKill = isSecondKill;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public boolean isSucFlag() {
        return sucFlag;
    }

    public void setSucFlag(boolean sucFlag) {
        this.sucFlag = sucFlag;
    }

    public Goods getBean() {
        return bean;
    }

    public void setBean(Goods bean) {
        this.bean = bean;
    }

    public GoodsService getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @Action(value="addGoods",results = {@Result(name="json",type="json")})
    public String addGoods(){
        Goods goods=new Goods();
        goods.setGoodsId(this.getSerial().SerialId(Serial.GOODSATTRIBUTE));
        goods.setIsOutSite(this.getIsOutSite());
        goods.setOutSiteLink(this.getOutSiteLink());
        goods.setGoodsTypeId(this.getGoodsTypeId());
        goods.setNavId(this.getNavId());
        goods.setlTypeId(this.getlTypeId());
        goods.setsTypeId(this.getsTypeId());
        goods.setGoodsName(this.getGoodsName());
        goods.setUserSetNum(this.getUserSetNum());
        goods.setBrandName(this.getBrandName());
        goods.setCost(this.getCost());
        goods.setSalePrice(this.getSalePrice());
        goods.setMemberPrice(this.getMemberPrice());
        goods.setSort(this.getSort());
        goods.setPrice(this.getPrice());
        goods.setPoints(this.getPoints());
        goods.setIsNew(this.getIsNew());
        goods.setRecommended(this.getRecommended());
        goods.setHotSale(this.getHotSale());
        goods.setBargainPrice(this.getBargainPrice());
        goods.setIsMobilePlatformGoods(this.getIsMobilePlatformGoods());
        goods.setSaleState(this.getSaleState());
        goods.setCommodityList(this.getCommodityList());
        goods.setMetaKeywords(this.getMetaKeywords());
        goods.setMetaDescription(this.getMetaDescription());


        this.getGoodsService().addGoods(goods);
        this.setSucFlag(true);
        this.setBean(goods);
        return JSON;
    }
    @Action(value = "updateGoods",results = {@Result(name="json",type = "json")})
    public String updateGoods(){
        return JSON;
    }
}
