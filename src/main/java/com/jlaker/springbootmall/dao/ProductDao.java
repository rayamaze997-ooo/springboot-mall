package com.jlaker.springbootmall.dao;

import com.jlaker.springbootmall.dto.ProductRequest;
import com.jlaker.springbootmall.model.Product;

public interface ProductDao {
Product getProductById(Integer productId);

Integer createProduct(ProductRequest productRequest);

void updateProduct(Integer productId, ProductRequest productRequest);
}
