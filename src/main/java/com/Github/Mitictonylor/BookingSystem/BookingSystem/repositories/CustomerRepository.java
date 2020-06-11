package com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
