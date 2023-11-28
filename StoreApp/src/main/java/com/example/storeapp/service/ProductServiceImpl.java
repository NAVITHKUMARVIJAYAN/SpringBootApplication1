package com.example.storeapp.service;

import com.example.storeapp.entity.Product;
import com.example.storeapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repository;
	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public Product updateProductPrice(Integer productId, Double productPrice) {

		Product product=repository.findById(productId).get();
		product.setPrice(productPrice);

		return repository.save(product);
	}

	@Override
	public Product findProductById(Integer productId) {
		return repository.findById(productId).get();
	}

	@Override
	public List<Product> findAllProducts() {
		return repository.findAll();
	}

	@Override
	public void deleteProduct(Integer productId) {
		repository.deleteById(productId);

	}

}
