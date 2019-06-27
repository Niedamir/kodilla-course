package main.java.com.kodilla.good.patterns.challenges.flightService;

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
}
