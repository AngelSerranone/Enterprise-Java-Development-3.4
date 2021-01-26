package com.ironhack.Lab3_4.repository;
import com.ironhack.Lab3_4.model.Aircrafts;
import com.ironhack.Lab3_4.model.Flights;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightsRepositoryTest {

    Flights flights;

    @Autowired
    private FlightsRepository flightsRepository;

    @BeforeEach
    public void setUp() {
        flights = new Flights("IB737", "Boeing-737", 1500);
        flightsRepository.save(flights);
    }

    @AfterEach
    public void tearDown() {
        flightsRepository.deleteAll();
    }

    @Test
    public void findAll_AircrafsExist_Aircraft() {
        List<Flights> flightsList = flightsRepository.findAll();
        assertEquals(1, flightsList.size());
    }

    @Test
    public void findFlightsByFlightNumber_FlightNumberExist_Flight() {
        Flights flights = flightsRepository.findFlightsByFlightNumber("IB737");
        assertEquals("IB737", flights.getFlightNumber());
    }

    @Test
    public void findByFlightMileageGreaterThan_MoreThan500MilesFlights_Flights() {
        List<Flights> flightsList = flightsRepository.findByFlightMileageGreaterThan(500);
        assertEquals(1, flightsList.size());
    }
}