package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface Supplier {
    String getSupplierName();
    List getProductList();

    default void displayDataBase() {
        System.out.println("Dostawca: " + getSupplierName());
        System.out.println(getProductList().toString());
    }

    void process(F2DAdress adress);

    default void submitOrder() {
        System.out.println("Zamówienie u dostawcy: " + getSupplierName() + " złożone pomyslnie.");
    }
}
