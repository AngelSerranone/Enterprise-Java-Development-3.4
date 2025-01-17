package com.ironhack.Lab3_4.model;
import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String customerName;
    private String customerStatus;
    private Integer customerTotalMileage;

    // Constructor
    public Customers() {
    }

    // Constructor normal
    public Customers(String customerName, String customerStatus, Integer customerTotalMileage) {
        setId();
        setCustomerName(customerName);
        setCustomerStatus(customerStatus);
        setCustomerTotalMileage(customerTotalMileage);
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getCustomerTotalMileage() {
        return customerTotalMileage;
    }

    public void setCustomerTotalMileage(Integer customerTotalMileage) {
        this.customerTotalMileage = customerTotalMileage;
    }
}
