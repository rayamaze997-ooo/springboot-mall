package com.jlaker.springbootmall.dao;

import com.jlaker.springbootmall.model.Product;

public interface ProductDao {
Product getProductById(Integer productId);
}
