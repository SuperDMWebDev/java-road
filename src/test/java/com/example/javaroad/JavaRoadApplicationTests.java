package com.example.javaroad;

import com.example.javaroad.entity.Product;
import com.example.javaroad.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaRoadApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	@Test
	void findByNameMethod() {
		Product product = productRepository.findByName("product 2");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
	}

}
