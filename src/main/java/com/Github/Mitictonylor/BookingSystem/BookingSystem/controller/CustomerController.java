package com.Github.Mitictonylor.BookingSystem.BookingSystem.controller;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Course;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Customer;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
            @RequestParam(name ="courseName", required = false)String courseName,
            @RequestParam(name = "town",required = false)String town,
            @RequestParam(name = "ageOver", required = false)Integer age
    ){
        if(courseName != null & town != null & age != null){
            return new ResponseEntity<>(customerRepository.findByTownAndBookingsCourseNameAndAgeGreaterThan(town,courseName,age), HttpStatus.OK);
        }
        if(courseName != null & town != null){
            return new ResponseEntity<>(customerRepository.findByTownAndBookingsCourseName(town,courseName), HttpStatus.OK);
        }
        if (courseName != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseName(courseName), HttpStatus.OK);
        }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomerById(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/customers")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PutMapping(value = "/customers/{id}")
    public ResponseEntity updateCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @DeleteMapping(value = "/customers/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Long id){
        customerRepository.deleteById(id);
        return new ResponseEntity<>("Deleted Object with id "+ id, HttpStatus.OK);
    }
}


