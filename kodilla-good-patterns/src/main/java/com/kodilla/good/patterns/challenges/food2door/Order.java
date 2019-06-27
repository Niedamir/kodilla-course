package main.java.com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> theOrder = new ArrayList<>();

    public List<Product> prepareOrderList() {
        return theOrder;
    }
}