package com.retrofit.product.rsproduct.controller;

import org.springframework.web.bind.annotation.RestController;

import com.retrofit.product.rsproduct.model.Product;
import com.retrofit.product.rsproduct.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public Product geProduct() {
        return productService.getProduct();
    }
    
    
}
