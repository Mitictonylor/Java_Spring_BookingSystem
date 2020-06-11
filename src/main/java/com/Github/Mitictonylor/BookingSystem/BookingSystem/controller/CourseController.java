package com.Github.Mitictonylor.BookingSystem.BookingSystem.controller;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Course;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Customer;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCoursesById(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/courses")
    public ResponseEntity<Course> postCustomer(@RequestBody Course course){
        courseRepository.save(course);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(
            @RequestParam(name ="starRating", required = false)Integer starRating,
            @RequestParam(name = "customerId",required = false)Long customerId
    ){
        if(starRating != null){
            return new ResponseEntity<>(courseRepository.findByStarRating(starRating), HttpStatus.OK);
        }
        if (customerId != null){
            return new ResponseEntity<>(courseRepository.findByBookingsCustomerId(customerId), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
}
