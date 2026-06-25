package com.jlaker.springbootmall.service;

import com.jlaker.springbootmall.constant.ProductCategory;
import com.jlaker.springbootmall.dto.ProductRequest;
import com.jlaker.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category,String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
