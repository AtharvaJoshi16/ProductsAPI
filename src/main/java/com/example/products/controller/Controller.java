package com.example.products.controller;

import com.example.products.model.Products;
import com.example.products.service.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class Controller {

    ProductsService service;

    public Controller(ProductsService service) {
        this.service = service;
    }

    @GetMapping
    public List<Products> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("{productId}")
    public Products getProducts(@PathVariable(name = "productId") int productId) {
        return service.getProduct(productId);
    }

    @PostMapping
    public String addProduct(@RequestBody Products product) {
        return service.createProduct(product);
    }

    @PutMapping
    public String updateProduct(@RequestBody Products product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("{productId}")
    public String deleteProduct(@PathVariable(name = "productId") int productId) {
        return service.deleteProduct(productId);
    }
}
