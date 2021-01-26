package com.ironhack.Lab3_4.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aircrafts")
public class Aircrafts {
    @Id
    private String aircraftName;
    private Integer totalSeats;

    // Constructor vacio
    public Aircrafts() {
    }

    // Constructor normal
    public Aircrafts(String aircraftName, Integer totalSeats) {
        setAircraftName(aircraftName);
        setTotalSeats(totalSeats);
    }

    // Getters & Setters

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
}
