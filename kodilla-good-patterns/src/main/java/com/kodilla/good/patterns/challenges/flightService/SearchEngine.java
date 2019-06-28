package com.kodilla.good.patterns.challenges.flightService;

import java.util.stream.Collectors;

public class SearchEngine {
    public static void searchFrom(String startAirport, FlightDataBase dataBase) {
        dataBase.getDataBase().entrySet().stream()
                .filter(map -> map.getValue().getStartingAirport().equals(startAirport))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void searchTo(String destinationAirport, FlightDataBase dataBase) {
        dataBase.getDataBase().entrySet().stream()
                .filter(map -> map.getValue().getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void searchTransfer(String startAirport, String destinationAirport, String transfer, FlightDataBase dataBase) {
        dataBase.getDataBase().entrySet().stream()
                .filter(map -> map.getValue().getStartingAirport().equals(startAirport))
                .filter(map -> map.getValue().getDestinationAirport().equals(destinationAirport))
                .filter(map -> map.getValue().getTransferAirport().equals(transfer))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}