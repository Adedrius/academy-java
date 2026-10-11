package com.bptn.course._07_inheritance;

public class RechargableElectronicProduct extends ElectronicProduct {

	public RechargableElectronicProduct(String productName, double price, boolean inStock, double rating) {
		super(productName, price, inStock, rating);
		// TODO Auto-generated constructor stub
		
		//price -> protected in parent class Product
		System.out.println(this.price);
		
		// productNmae -> private in parent class Product
		// System.out.println(this.productName);
	}

}
