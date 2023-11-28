package com.example.storeappclient.controller;

import com.example.storeappclient.domain.Product;
import com.example.storeappclient.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products-client")
public class ProductClientController {
    @Autowired
    IProductService productService;

    @GetMapping(value = "/getAll",produces = "application/json")
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }
}
