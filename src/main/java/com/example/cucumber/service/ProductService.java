package com.example.cucumber.service;

import com.example.cucumber.model.Product;
import com.example.cucumber.model.Type;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Product findByType(Type type) {
        return Product.builder()
                .id(1L)
                .name(String.format("My %s product", type))
                .type(type)
                .build();
    }
}
