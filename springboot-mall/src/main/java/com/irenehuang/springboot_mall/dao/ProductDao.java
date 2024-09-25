package com.irenehuang.springboot_mall.dao;

import java.util.List;

import com.irenehuang.springboot_mall.dto.ProductQueryParams;
import com.irenehuang.springboot_mall.dto.ProductRequest;
import com.irenehuang.springboot_mall.model.Product;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
