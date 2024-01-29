package com.retrofit.product.rsproduct.service;

import org.springframework.stereotype.Component;

import com.retrofit.product.rsproduct.model.Product;

@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProduct() {
        return Product.builder()
            .name("Product 1")
            .stock(10)
            .price(100.0)
            .description("This is product 1")
            .build();
    }
    
}
