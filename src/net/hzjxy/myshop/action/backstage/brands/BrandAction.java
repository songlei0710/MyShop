package net.hzjxy.myshop.action.backstage.brands;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.Brand;
import net.hzjxy.myshop.service.BrandService;
import net.hzjxy.myshop.service.impl.Serial;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Administrator on 2014/12/18.
 */
@Namespace("/bk/brands")
@ParentPackage("myshop")
public class BrandAction extends BaseTAction{
    private String brandName;
    private String url;
    private int sort;

    private boolean sucFlag;

    public boolean getSucFlag() {
        return sucFlag;
    }

    public void setSucFlag(boolean sucFlag) {
        this.sucFlag = sucFlag;
    }

    private BrandService brandService;

    public BrandService getBrandService() {
        return brandService;
    }

    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getSort() {
        return sort;
    }
    public void setSort(int sort) {
        this.sort = sort;
    }

    @Action(value = "/addBrand",results = {@Result(name="json",type="json")})
    public String addBrand(){
        Brand brand=new Brand();
        brand.setBrandName(this.getBrandName());
        brand.setUrl(this.getUrl());
        brand.setSort(this.getSort());
        brand.setBrandId(this.getSerial().SerialId(Serial.BRAND));
        this.getBrandService().addBrand(brand);
        this.setSucFlag(true);
        return JSON;
    }
}
