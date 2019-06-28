package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier {
    private String supplierName = "Extra Food Shop";
    private List<Product> productList = new ArrayList<>();

    public String getSupplierName() {
        return supplierName;
    }
    public List getProductList() {
        System.out.println("Aktualizuję listę produktów...");
        productList.add(new Product("BIO marchew", 2.20, 180 ));
        productList.add(new Product("BIO jabłko", 1.20, 200 ));
        productList.add(new Product("Sok jabłkowy tłoczony 1l", 5.20, 10 ));
        productList.add(new Product("Mleko BIO 1l", 3.20, 82 ));
        return productList;
    }

    @Override
    public void process(F2DAdress adress) {
        String orderStreet = adress.getAdress();
        String orderPostCode = adress.getPostCode() + " " + adress.getCity();
        String orderConfirmationEmail = adress.getEmail();

        System.out.println("Zamówienie zostanie wysłane na adres: " + orderStreet + " " + orderPostCode);
        System.out.println("Email z potwierdzeniem wysłania zamówienia zostanie wysłany na adres: " + orderConfirmationEmail);
    }


}
