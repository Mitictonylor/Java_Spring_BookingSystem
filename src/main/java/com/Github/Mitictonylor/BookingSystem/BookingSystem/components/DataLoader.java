package com.Github.Mitictonylor.BookingSystem.BookingSystem.components;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Booking;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.BookingRepository;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CourseRepository;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
