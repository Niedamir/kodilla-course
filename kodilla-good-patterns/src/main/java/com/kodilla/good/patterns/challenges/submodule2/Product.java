package com.kodilla.good.patterns.challenges.submodule2;

public class Product {
	String productName;
	String productCategory;
	int productID;
	double productPrice;

	public Product(String productName, String productCategory, int productID, double productPrice) {
		this.productName = productName;
		this.productCategory = productCategory;
		this.productID = productID;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public int getProductID() {
		return productID;
	}
	public double getProductPrice() {
		return productPrice;
	}
}

