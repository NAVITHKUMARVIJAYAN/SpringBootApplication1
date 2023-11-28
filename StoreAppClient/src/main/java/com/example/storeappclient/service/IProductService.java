package com.example.storeappclient.service;


import com.example.storeappclient.domain.Product;

import java.util.List;

public interface IProductService {
	List<Product> findAllProducts();
}
