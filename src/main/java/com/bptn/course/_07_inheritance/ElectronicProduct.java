package com.bptn.course._07_inheritance;

public class ElectronicProduct extends Product {

	public ElectronicProduct(String productName, double price, boolean inStock, double rating) {
		super(productName, price, inStock, rating);
		System.out.println(this.getProductName());
		this.setProductName("test1");
		this.showTotal();
		// TODO Auto-generated constructor stub
		
		//price -> protected in parent class Product
		System.out.println(this.price);
	}
	
	

}
