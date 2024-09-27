package com.irenehuang.springboot_mall.dao;

import java.util.List;

import com.irenehuang.springboot_mall.model.OrderItem;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
