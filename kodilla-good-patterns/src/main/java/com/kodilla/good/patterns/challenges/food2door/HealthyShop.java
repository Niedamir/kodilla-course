package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

abstract class HealthyShop implements Supplier {
    private String supplierName = "Healthy Shop";
    private List<Product> productList = new ArrayList<>();

    public String getSupplierName() {
        return supplierName;
    }
    public List getProductList() {
        System.out.println("Aktualizuję listę produktów...");
        productList.add(new Product("Olej kokosowy 250g", 12.99, 18 ));
        productList.add(new Product("Oliwa z oliwek 1l", 24.99, 87 ));
        productList.add(new Product("Masło klarowane 500g", 9.99, 35 ));
        return productList;
    }
    public void process(F2DAdress adress) {
        String orderAdress= adress.getAdress() + " " + adress.getPostCode() + " " + adress.getCity();
        Integer orderNIP = adress.getNIP();
        String orderConfirmationEmail = adress.getEmail();

        System.out.println("Zamówienie klienta: " + orderNIP + " zostanie wysłane na adres: " + orderAdress);
        System.out.println("Email z potwierdzeniem wysłania zamówienia zostanie wysłany na adres: " + orderConfirmationEmail);
    }
}
