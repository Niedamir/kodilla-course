package main.java.com.kodilla.good.patterns.challenges.food2door;

public class Product {
    String supplier;
    String name;
    double price;
    int quantity;

    public Product(String supplier, String name, double price, int quantity) {
        this.supplier = supplier;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
