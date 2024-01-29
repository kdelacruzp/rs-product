package com.retrofit.product.rsproduct.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Product {

    String name;
    int stock;
    double price;
    String description;

}
