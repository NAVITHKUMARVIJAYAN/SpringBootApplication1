package com.example.storeapp.controller;

import com.example.storeapp.entity.Product;
import com.example.storeapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer productId) {
        return productService.findProductById(productId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)

    public void deleteProductById(@PathVariable("id") Integer productId) {
        productService.deleteProduct(productId);
    }

    @PatchMapping("/{id}/{price}")
    public Product updateProductPrice(@PathVariable("id") Integer productId, @PathVariable("price") Double productPrice) {
        return productService.updateProductPrice(productId, productPrice);
    }


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }


    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }


}
