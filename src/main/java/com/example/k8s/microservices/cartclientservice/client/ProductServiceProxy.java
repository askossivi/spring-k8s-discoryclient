package com.example.k8s.microservices.cartclientservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.k8s.microservices.cartclientservice.model.Product;

@FeignClient("spring-mongo-service")
public interface ProductServiceProxy {
	
	@GetMapping("/findAllProducts")
	public List<Product> getProducts();

}
