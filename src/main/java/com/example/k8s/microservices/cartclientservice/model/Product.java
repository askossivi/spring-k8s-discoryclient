package com.example.k8s.microservices.cartclientservice.model;

public class Product {
	
	   
	    private Integer id;
	    private String productId;
	    private String description;
	    private double price;
		public Product() {
			// TODO Auto-generated constructor stub
		}
	    public Product(Integer id,String productId,String description,double price){
	    	this.id=id;
	    	this.productId=productId;
	    	this.description=description;
	    	this.price=price;
	    }
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getProductId() {
			return productId;
		}
		public void setProductId(String productId) {
			this.productId = productId;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	    
	    
}