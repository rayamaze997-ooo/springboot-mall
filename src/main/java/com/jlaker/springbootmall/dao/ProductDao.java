package com.jlaker.springbootmall.dao;

import com.jlaker.springbootmall.dto.ProductRequest;
import com.jlaker.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

List<Product> getProducts();

Product getProductById(Integer productId);

Integer createProduct(ProductRequest productRequest);

void updateProduct(Integer productId, ProductRequest productRequest);

void deleteProductById(Integer productId);
}
