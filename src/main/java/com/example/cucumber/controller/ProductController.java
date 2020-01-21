package com.example.cucumber.controller;

import com.example.cucumber.model.Product;
import com.example.cucumber.model.Type;
import com.example.cucumber.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<Product> findByType(@RequestParam(value = "type") Type type){
        return ResponseEntity.ok(productService.findByType(type));
    }


}
