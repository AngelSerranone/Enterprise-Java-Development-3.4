package com.ironhack.Lab3_4.repository;
import com.ironhack.Lab3_4.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    public Customers findCustomersByCustomerName (String customerName);
    public Customers findCustomersById (Integer id);
    public List<Customers> findCustomersByCustomerStatus (String customerStatus);
}
