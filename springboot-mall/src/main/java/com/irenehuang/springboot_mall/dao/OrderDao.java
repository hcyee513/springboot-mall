package com.irenehuang.springboot_mall.dao;

import java.util.List;

import com.irenehuang.springboot_mall.model.Order;
import com.irenehuang.springboot_mall.model.OrderItem;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
