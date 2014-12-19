package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.BrandDao;
import net.hzjxy.myshop.entity.Brand;
import net.hzjxy.myshop.entity.GoodsTypeBrand;
import net.hzjxy.myshop.service.BrandService;

import java.util.List;

/**
 * Created by 磊 on 2014/11/30.
 */
public  class BrandServiceImpl implements BrandService {

    @Override
    public void delBrand(String[] list) {

    }

    @Override
    public List<Brand> findAllBrands(int currentPage, int lineSize) {
        return null;
    }

    @Override
    public int countFindAllBrands() {
        return 0;
    }

    @Override
    public Brand findBrandById(String brandId) {
        return null;
    }

    @Override
    public List<Brand> sortAllBrands(int currentPage, int lineSize, String queryString) {
        return null;
    }

    @Override
    public void saveBrand(Brand brand, GoodsTypeBrand goodsTypeBrand) {

    }
}
