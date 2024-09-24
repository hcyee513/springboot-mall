package com.irenehuang.springboot_mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.irenehuang.springboot_mall.constant.ProductCategory;
import com.irenehuang.springboot_mall.dao.ProductDao;
import com.irenehuang.springboot_mall.dto.ProductRequest;
import com.irenehuang.springboot_mall.model.Product;
import com.irenehuang.springboot_mall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductCategory category, String search) {
        return productDao.getProducts(category, search);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest); 
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
        
    }   
}
