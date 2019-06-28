package com.kodilla.good.patterns.challenges.flightService;

import java.util.Objects;

public class Flight {
    private String startingAirport;
    private String destinationAirport;
    private String transferAirport;

    public Flight(String startingAirport, String destinationAirport, String transferAirport) {
        this.startingAirport = startingAirport;
        this.destinationAirport = destinationAirport;
        this.transferAirport = transferAirport;
    }

    public String getStartingAirport() {
        return startingAirport;
    }
    public String getDestinationAirport() {
        return destinationAirport;
    }
    public String getTransferAirport() {
        return transferAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startingAirport='" + startingAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", transferAirport='" + transferAirport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return startingAirport.equals(flight.startingAirport) && destinationAirport.equals(flight.destinationAirport) && transferAirport.equals(flight.transferAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startingAirport, destinationAirport, transferAirport);
    }
}
