package com.irenehuang.springboot_mall.service;

import com.irenehuang.springboot_mall.dto.CreateOrderRequest;
import com.irenehuang.springboot_mall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
