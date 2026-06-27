package com.jlaker.springbootmall.service.impl;


import com.jlaker.springbootmall.dao.OrderDao;
import com.jlaker.springbootmall.dao.ProductDao;
import com.jlaker.springbootmall.dto.BuyItem;
import com.jlaker.springbootmall.dto.CreateOrderRequest;
import com.jlaker.springbootmall.model.OrderItem;
import com.jlaker.springbootmall.model.Product;
import com.jlaker.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
            List<OrderItem> orderItemList = new ArrayList<>();
            int totalAmount = 0;
            for (BuyItem buyItem : createOrderRequest.getBuyItemList()) {
                Product product = productDao.getProductById(buyItem.getProductId());
// 計算總價錢
                int amount = buyItem.getQuantity() * product.getPrice();
                totalAmount =totalAmount + amount;


                OrderItem orderItem = new OrderItem();
                orderItem.setProductId(buyItem.getProductId());
                orderItem.setQuantity (buyItem.getQuantity());
                orderItem.setAmount (amount);

                orderItemList.add(orderItem);
            }


       Integer orderId = orderDao.createOrder(userId,totalAmount);
       orderDao.createOrderItems(orderId,orderItemList);
        return orderId;
    }
}
