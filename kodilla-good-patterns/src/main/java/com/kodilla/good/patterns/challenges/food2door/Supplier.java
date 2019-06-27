package main.java.com.kodilla.good.patterns.challenges.food2door;

public interface Supplier {
    void process();
    String getSupplierName();
    default void submitOrder() {
        process();
        System.out.println("Zamówienie u dostawcy: " + getSupplierName() + "złożone pomyslnie.");
    }
}
