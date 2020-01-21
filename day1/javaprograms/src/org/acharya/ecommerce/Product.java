package com.kaushalya.ecommerce;

public class Product {
	
	int productId;
	String productName;
	double price;
	
	public Product(int productId,String productName,double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public String info() {
		return "Product Id : "+this.productId + " Name : "+this.productName + " Price : "+this.price;
	}

}
