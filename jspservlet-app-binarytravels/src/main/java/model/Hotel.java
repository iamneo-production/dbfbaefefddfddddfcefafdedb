package model;

import java.time.LocalDate;

public class Hotel {
    private int noOfPersons;
    private String roomType;
    private int rates;
    private String occupancy;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Hotel(int noOfPersons, String roomType, int rates, String occupancy, LocalDate fromDate, LocalDate toDate) {
        this.noOfPersons = noOfPersons;
        this.roomType = roomType;
        this.rates = rates;
        this.occupancy = occupancy;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public LocalDate getFromdate() {
        return fromDate;
    }

    public void setFromdate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getTodate() {
        return toDate;
    }

    public void setTodate(LocalDate toDate) {
        this.toDate = toDate;
    }
}