package com.example.storeappclient.service;


import com.example.storeappclient.domain.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

	@Override
	public List<Product> findAllProducts() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8081/products";
		ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, null, Object.class);
		System.out.println(response.toString());
		return (List<Product>) response.getBody();
	}

}
