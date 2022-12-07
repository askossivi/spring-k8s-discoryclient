package com.example.k8s.microservices.cartclientservice.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.k8s.microservices.cartclientservice.client.ProductServiceProxy;
import com.example.k8s.microservices.cartclientservice.model.Cart;
import com.example.k8s.microservices.cartclientservice.model.Product;

@RestController
public class CartServiceController {
	private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ProductServiceProxy proxy;
	
	List<Cart> mycart = new ArrayList<Cart>();
	
	@GetMapping("/mycart/{productId}")
	public List<Cart> addMycart(@PathVariable("productId") String productId) {
		List<Product> l = proxy.getProducts();
		Cart cart = new Cart();
		l.forEach(product -> {
			if (productId.equals(product.getProductId())) {
				System.out.println("productId" + product.getProductId());
				cart.setDescription(product.getDescription());
				cart.setId(product.getId());
				cart.setPrice(product.getPrice());
				cart.setProductId(product.getProductId());
				cart.setQuantity(1);
				mycart.add(cart);
				System.out.println(product.getDescription());
			}
		});
		logger.info("Response::"+mycart);

		return mycart;
	}

}
