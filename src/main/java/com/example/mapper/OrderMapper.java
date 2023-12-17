package com.example.mapper;

import com.example.pojo.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> getOrderList();

    void insertOrder(Order order);

    void deleteOrder(int a);

    void updateOrder(Order order);
}
