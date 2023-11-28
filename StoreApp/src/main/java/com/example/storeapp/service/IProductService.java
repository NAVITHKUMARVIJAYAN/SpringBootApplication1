package com.example.storeapp.service;

import com.example.storeapp.entity.Product;

import java.util.List;

public interface IProductService {
	Product addProduct(Product product);
	Product updateProduct(Product product);
	Product updateProductPrice(Integer productId,Double productPrice);
	Product findProductById(Integer productId);
	List<Product> findAllProducts();
	void deleteProduct(Integer productId);

}
