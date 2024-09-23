package com.irenehuang.springboot_mall.dao;

import com.irenehuang.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
