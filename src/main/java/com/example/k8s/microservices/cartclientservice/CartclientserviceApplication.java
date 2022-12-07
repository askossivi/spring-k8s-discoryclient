package com.example.k8s.microservices.cartclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.k8s.microservices.cartclientservice.config.RibbonConfiguration;

@SpringBootApplication
@AutoConfigureAfter
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class CartclientserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartclientserviceApplication.class, args);
	}

}
