package com.irenehuang.springboot_mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.irenehuang.springboot_mall.dao.ProductDao;
import com.irenehuang.springboot_mall.model.Product;
import com.irenehuang.springboot_mall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }


}
