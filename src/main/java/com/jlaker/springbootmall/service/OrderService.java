package com.jlaker.springbootmall.service;

import com.jlaker.springbootmall.dto.CreateOrderRequest;
import com.jlaker.springbootmall.dto.OrderQueryParams;
import com.jlaker.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
