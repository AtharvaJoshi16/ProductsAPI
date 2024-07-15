package com.example.products.repository;

import com.example.products.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Products, String> {
}
