package com.ironhack.Lab3_4.repository;
import com.ironhack.Lab3_4.model.Aircrafts;
import com.ironhack.Lab3_4.model.Customers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AircraftsRepositoryTest {
    Aircrafts aircrafts;

    @Autowired
    private AircraftsRepository aircraftsRepository;

    @BeforeEach
    public void setUp() {
        aircrafts = new Aircrafts("Boeing-737", 300);
        aircraftsRepository.save(aircrafts);
    }

    @AfterEach
    public void tearDown() {
        aircraftsRepository.deleteAll();
    }

    @Test
    public void findAll_AircrafsExist_Aircraft() {
        List<Aircrafts> aircraftsList = aircraftsRepository.findAll();
        assertEquals(1, aircraftsList.size());
    }

    @Test
    public void findAircraftsByAircraftName_AircraftsExist_Aircraft() {
        Aircrafts aircrafts = aircraftsRepository.findAircraftsByAircraftName("Boeing-737");
        assertEquals("Boeing-737", aircrafts.getAircraftName());
    }

    @Test
    public void findAircraftsByAircraftNameContaining_AircraftsExist_Aircraft() {
        List<Aircrafts> aircraftsList = aircraftsRepository.findAircraftsByAircraftNameContaining("Boeing");
        assertEquals("Boeing-737", aircraftsList.get(0).getAircraftName());
    }


}