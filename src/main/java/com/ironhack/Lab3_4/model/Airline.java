package com.ironhack.Lab3_4.model;
import javax.persistence.*;

@Entity
@Table(name="airline")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String flightNumber;
    private Integer customerId;

    // Constructor vacio
    public Airline() {
    }

    // Constructor normal
    public Airline(String flightNumber, Integer customerId) {
        setId();
        setFlightNumber(flightNumber);
        setCustomerId(customerId);
    }

    // getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
