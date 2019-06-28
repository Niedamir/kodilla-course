package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

class GlutenFreeShop implements Supplier {
    private String supplierName = "Gluten Free Shop";
    private List<Product> productList = new ArrayList<>();

    public String getSupplierName() {
        return supplierName;
    }
    public List getProductList() {
        System.out.println("Aktualizuję listę produktów...");
        productList.add(new Product("Mąka żytnia typ 2000 1kg", 8.99, 15 ));
        productList.add(new Product("cleb bezglutenowy", 5.20, 200 ));
        productList.add(new Product("Makaron z grochu 1kg", 6.99, 12 ));
        return productList;
    }

    @Override
    public void process(F2DAdress adress) {
        String orderStreet = adress.getAdress();
        String orderPostCode = adress.getPostCode();
        String orderCity = adress.getCity();
        String orderConfirmationEmail = adress.getEmail();
        Integer orderPhone = adress.getPhoneNumber();

        System.out.println("Zamówienie zostanie wysłane na adres: " + orderStreet + " " + orderPostCode + " " + orderCity);
        System.out.println("Email z potwierdzeniem wysłania zamówienia zostanie wysłany na adres: " + orderConfirmationEmail);
        System.out.println("W razie problemów z dotarciem kurier będzie się kontaktował z numerem telefonu: " + orderPhone.toString());
    }
}
