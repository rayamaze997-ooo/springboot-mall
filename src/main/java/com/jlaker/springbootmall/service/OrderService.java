package com.jlaker.springbootmall.service;

import com.jlaker.springbootmall.dto.CreateOrderRequest;
import com.jlaker.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
