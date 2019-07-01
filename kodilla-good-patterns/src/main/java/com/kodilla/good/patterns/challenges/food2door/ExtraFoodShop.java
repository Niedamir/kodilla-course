package main.java.com.kodilla.good.patterns.challenges.food2door;

abstract class ExtraFoodShop implements Supplier {
    private String supplierName = "Extra Food Shop";

    public void process(F2DAdress adress, Order theOrder) {
        String orderStreet = adress.getAdress();
        String orderPostCode = adress.getPostCode() + " " + adress.getCity();
        String orderConfirmationEmail = adress.getEmail();
        Double totalCost;

//        for (Product product : theOrder.getTheOrder()) {
//            totalCost =+ (product.getPrice() * product.getQuantity());
//        }
//        totalCost =+ 9.99; // add delivery cost

//        System.out.println("Do zapłaty: " + totalCost.toString());
        System.out.println("Zamówienie zostanie wysłane na adres: " + orderStreet + " " + orderPostCode);
        System.out.println("Email z potwierdzeniem wysłania zamówienia zostanie wysłany na adres: " + orderConfirmationEmail);
    }
    public String getSupplierName() {
        return supplierName;
    }
}
