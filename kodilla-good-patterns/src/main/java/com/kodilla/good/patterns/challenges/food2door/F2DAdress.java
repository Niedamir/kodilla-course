package com.kodilla.good.patterns.challenges.food2door;

public class F2DAdress {
	private final String adress = "ul. Witolda Pileckiego 13";
	private final String city = "Gniewkowo";
	private final String postCode = "88-140";
	private final int phoneNumber = 123456789;
	private final String email = "zamowienia@food2door.pl";
	private final int NIP = 1234567890;

	public String getAdress() {
		return adress;
	}
	public String getCity() {
		return city;
	}
	public String getPostCode() {
		return postCode;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public int getNIP() {
		return NIP;
	}
}
