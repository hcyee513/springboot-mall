package com.irenehuang.springboot_mall.service;

import com.irenehuang.springboot_mall.dto.ProductRequest;
import com.irenehuang.springboot_mall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
