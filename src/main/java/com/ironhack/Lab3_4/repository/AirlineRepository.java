package com.ironhack.Lab3_4.repository;
import com.ironhack.Lab3_4.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer> {

}
