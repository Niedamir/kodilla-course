package com.kodilla.good.patterns.challenges.flightService;

public class FlightServiceMain {
    public static void main(String[] args) {
        String startFrom = "Meeren";
        String destination = "Sun Spear";
        String transferIn = "King's Landing";
        FlightDataBase dataBase = new FlightDataBase();

        dataBase.initializeDataBase();

        System.out.println("Flights from: " + startFrom);
        SearchEngine.searchFrom(startFrom, dataBase);
        System.out.println("\nFlights to: " + destination);
        SearchEngine.searchTo(destination, dataBase);
        System.out.println("\nFlights from: " + startFrom + " to: " + destination + " with transfer in: " + transferIn);
        SearchEngine.searchTransfer(startFrom, destination, transferIn, dataBase);
    }
}
