package main.java.com.kodilla.good.patterns.challenges.food2door;

abstract class GlutenFreeShop implements Supplier {
    private String supplierName = "Gluten Free Shop";

    void process(F2DAdress adress, Order theOrder) {
        String orderStreet = adress.getAdress();
        String orderPostCode = adress.getPostCode();
        String orderCity = adress.getCity();
        String orderConfirmationEmail = adress.getEmail();
        Integer orderPhone = adress.getPhoneNumber();
        Double totalCost;

        for (Product product : theOrder.getTheOrder()) {
            totalCost =+ (product.getPrice() * product.getQuantity());
        }
        totalCost =+ 7.99; // add delivery cost

        System.out.println("Do zapłaty: " + totalCost.toString());
        System.out.println("Zamówienie zostanie wysłane na adres: " + orderStreet + " " + orderPostCode + " " + orderCity);
        System.out.println("Email z potwierdzeniem wysłania zamówienia zostanie wysłany na adres: " + orderConfirmationEmail);
        System.out.println("W razie problemów z dotarciem kurier będzie się kontaktował z numerem telefonu: " + orderPhone.toString());
    }
    public String getSupplierName() {
        return supplierName;
    }
}
