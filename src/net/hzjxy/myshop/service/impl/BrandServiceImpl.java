package net.hzjxy.myshop.service.impl;

import net.hzjxy.myshop.dao.BrandDao;
import net.hzjxy.myshop.entity.Brand;
import net.hzjxy.myshop.service.BrandService;

/**
 * Created by 磊 on 2014/11/30.
 */
public class BrandServiceImpl implements BrandService {
    private BrandDao brandDao;

    public BrandDao getBrandDao() {
        return brandDao;
    }

    public void setBrandDao(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public int addBrand(Brand brand) {
        return brandDao.addBrand(brand);
    }
}
