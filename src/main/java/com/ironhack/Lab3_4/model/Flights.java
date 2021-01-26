package com.ironhack.Lab3_4.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fligths")
public class Flights {
    @Id
    private String flightNumber;
    private String aircraftName;
    private Integer flightMileage;

    // Constructor vacio
    public Flights() {
    }

    // Constructor normal
    public Flights(String flightNumber, String aircraftName, Integer flightMileage) {
        setFlightNumber(flightNumber);
        setAircraftName(aircraftName);
        setFlightMileage(flightMileage);
    }

    // Getters & Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }
}
