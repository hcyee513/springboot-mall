package com.irenehuang.springboot_mall.service;

import java.util.List;

import com.irenehuang.springboot_mall.dto.CreateOrderRequest;
import com.irenehuang.springboot_mall.dto.OrderQueryParams;
import com.irenehuang.springboot_mall.model.Order;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
