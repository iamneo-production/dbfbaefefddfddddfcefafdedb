package services;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator extends Booking {
    
    public double book(Hotel hotel) {
        int noOfPersons = hotel.getNoOfPersons();
        int rates = hotel.getRates();
        return booking(noOfPersons, rates);
    }

    public double book(Flight flight) {
        int noOfPersons = flight.getNoOfPersons();
        int rates = flight.getRates();
        return booking(noOfPersons, rates);
    }

    public double book(Train train) {
        int noOfPersons = train.getNoOfPersons();
        int rates = train.getRates();
        return booking(noOfPersons, rates);
    }

    public double book(Bus bus) {
        int noOfPersons = bus.getNoOfPersons();
        int rates = bus.getRates();
        return booking(noOfPersons, rates);
    }
}