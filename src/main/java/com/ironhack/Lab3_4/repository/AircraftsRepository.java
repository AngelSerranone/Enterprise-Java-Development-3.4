package com.ironhack.Lab3_4.repository;
import com.ironhack.Lab3_4.model.Aircrafts;
import com.ironhack.Lab3_4.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftsRepository extends JpaRepository<Aircrafts, String> {
    public Aircrafts findAircraftsByAircraftName (String aircraftName);
    public List<Aircrafts> findAircraftsByAircraftNameContaining (String aircraftName);
}
