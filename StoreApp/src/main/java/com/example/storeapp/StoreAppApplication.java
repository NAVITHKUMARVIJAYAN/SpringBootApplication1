package com.example.storeapp;

import com.example.storeapp.entity.Product;
import com.example.storeapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreAppApplication implements CommandLineRunner {
	@Autowired
	ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StoreAppApplication.class, args);
	}
	@Override
	public void run(String... args) {
		repository.save(new Product(null, "LG", 10345.66));
		repository.save(new Product(null, "NOKIA", 20345.66));
		repository.save(new Product(null, "ONIDA", 30345.66));
		repository.save(new Product(null, "APPLE", 40345.66));
		repository.save(new Product(null, "SAMSUNG", 50345.66));
		System.out.println("--------Data saved in H2 Database---------");

	}
}
