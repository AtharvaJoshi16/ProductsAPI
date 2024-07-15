package com.example.products.service.impl;

import com.example.products.model.Products;
import com.example.products.repository.Repository;
import com.example.products.service.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsImpl implements ProductsService {

    Repository repo;

    public ProductsImpl(Repository repository) {
        this.repo = repository;
    }

    @Override
    public String createProduct(Products product) {
        repo.save(product);
        return "Product saved";
    }

    @Override
    public String updateProduct(Products product) {
        repo.save(product);
        return "Product updated";
    }

    @Override
    public String deleteProduct(int productId) {
        repo.deleteById(String.valueOf(productId));
        return "Product deleted";
    }

    @Override
    public Products getProduct(int productId) {
        return repo.findById(String.valueOf(productId)).get();
    }

    @Override
    public List<Products> getAllProducts() {
        return repo.findAll();
    }
}
