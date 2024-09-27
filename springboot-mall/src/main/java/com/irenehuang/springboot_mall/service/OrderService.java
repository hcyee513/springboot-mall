package com.irenehuang.springboot_mall.service;

import com.irenehuang.springboot_mall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
