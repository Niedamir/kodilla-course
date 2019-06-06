package com.kodilla.good.patterns.challenges.submodule2;

public class Customer {
	String customerName;
	String customerCity;
	String customerStreet;
	String customerZipCode;
	int customerPhone;
	String customerEMail;

	public Customer(String customerName, String customerCity, String customerStreet, String customerZipCode, int customerPhone, String customerEMail) {
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerStreet = customerStreet;
		this.customerZipCode = customerZipCode;
		this.customerPhone = customerPhone;
		this.customerEMail = customerEMail;
	}

	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public String getCustomerStreet() {
		return customerStreet;
	}
	public String getCustomerZipCode() {
		return customerZipCode;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public String getCustomerEMail() {
		return customerEMail;
	}

	@Override
	public String toString() {
		return "{" +
			"customerName='" + customerName + '\'' +
			", customerCity='" + customerCity + '\'' +
			", customerStreet='" + customerStreet + '\'' +
			", customerZipCode='" + customerZipCode + '\'' +
			", customerPhone=" + customerPhone +
			", customerEMail='" + customerEMail + '\'' +
			'}';
	}
}
