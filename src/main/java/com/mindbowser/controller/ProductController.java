package com.mindbowser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindbowser.entity.Product;
import com.mindbowser.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@PostMapping({"/createnewproduct"})
	public Product createNewProduct(Product product) {
		return productServiceImpl.createNewProduct(product);
	}

}
