package main.java.com.kodilla.good.patterns.challenges.food2door;

abstract class HealthyShop implements Supplier {
    private String supplierName = "Healthy Shop";

    public void dataBaseHS() {

    }

    public void process(F2DAdress adress, Order theOrder) {
        String orderAdress= adress.getAdress() + " " + adress.getPostCode() + " " + adress.getCity();
        Integer orderNIP = adress.getNIP();
        String orderConfirmationEmail = adress.getEmail();
        Double totalCost;

        for (Product product : theOrder.getTheOrder()) {
            totalCost =+ (product.getPrice() * product.getQuantity());
        }
        totalCost =+ 14.99; // add delivery cost

        System.out.println("Do zapłaty: " + totalCost.toString());
        System.out.println("Zamówienie klienta: " + orderNIP + " zostanie wysłane na adres: " + orderAdress);
        System.out.println("Email z potwierdzeniem wysłania zamówienia zostanie wysłany na adres: " + orderConfirmationEmail);
    }
    public String getSupplierName() {
        return supplierName;
    }
}
