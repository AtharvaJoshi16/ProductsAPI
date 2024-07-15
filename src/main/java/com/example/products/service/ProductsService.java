package com.example.products.service;

import com.example.products.model.Products;

import java.util.List;

public interface ProductsService {
    public String createProduct(Products product);
    public String updateProduct(Products product);
    public String deleteProduct(int productId);
    public Products getProduct(int productId);
    public List<Products> getAllProducts();
}
