package com.bptn.course._07_inheritance;

public class Product {
	
	private String productName;
	protected double price;
	boolean inStock;
	public double rating;
	
	public Product(String productName, double price, boolean inStock, double rating) {
		super();
		this.productName = productName;
		this.price = price;
		this.inStock = inStock;
		this.rating = rating;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		if (productName.isEmpty()) {
			System.out.println("Product name can't be empty");
		} else {
			this.productName = productName;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	private void calculateTotal() {
		System.out.println("You are now seeing the cart!");
	}
	
	public void showTotal() {
		this.calculateTotal();
	}
	
	
}
