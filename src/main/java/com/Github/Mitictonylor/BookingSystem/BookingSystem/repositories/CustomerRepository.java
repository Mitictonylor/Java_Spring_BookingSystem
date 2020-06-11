package com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseName(String name);

    List<Customer> findByTownAndBookingsCourseName(String town, String courseName);

    List<Customer> findByTownAndBookingsCourseNameAndAgeGreaterThan(String town, String courseName, int age);
}
