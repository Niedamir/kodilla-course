package main.java.com.kodilla.good.patterns.challenges.flightService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightDataBase {
    Map<Integer, Flight> dataBase = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDataBase that = (FlightDataBase) o;
        return Objects.equals(dataBase, that.dataBase);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataBase);
    }

    void initializeDataBase() {
        dataBase.put(0, new Flight("Sun Spear", "Winterfell", "King's landing"));
        dataBase.put(1, new Flight("High Garden", "Dragon Stone", "King'sLanding"));
        dataBase.put(2, new Flight("Lannisport", "High Garden", "Sun Spear"));
        dataBase.put(3, new Flight("King's Landing", "Meeren", "Bravos"));
        dataBase.put(4, new Flight("King's Landing", "Meeren", "Sun Spear"));
        dataBase.put(5, new Flight("Winterfell", "Meeren", "Bravos"));
        dataBase.put(6, new Flight("Winterfell", "HighGarden", "Lannisport"));
        dataBase.put(7, new Flight("Bravos", "Sun Spear", "King's Landing"));
        dataBase.put(8, new Flight("Meeren", "Sun Spear", "King's Landing"));
        dataBase.put(9, new Flight("Meeren", "High Garden", "Sun Spear"));
    }

    public Map<Integer, Flight> getDataBase() {
        return dataBase;
    }
}
