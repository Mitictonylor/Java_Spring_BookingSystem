package com.Github.Mitictonylor.BookingSystem.BookingSystem.components;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Booking;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Course;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Customer;
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

        Customer antonio = new Customer("Antonio", "London", 32);
        Customer francesco = new Customer("Francesco", "London", 47);
        Customer john = new Customer("John", "Glasgow", 40);
        Customer mark = new Customer("Mark", "Edinburgh", 25);

        customerRepository.save(antonio);
        customerRepository.save(francesco);
        customerRepository.save(john);
        customerRepository.save(mark);

        Course java = new Course("java", 4, "Glasgow");
        Course python = new Course("python", 4, "Edinburgh");
        Course php = new Course("php", 3, "London");
        Course js = new Course("javascript", 4, "Glasgow");
        Course angular = new Course("angular", 5, "Cambridge");

        courseRepository.save(java);
        courseRepository.save(php);
        courseRepository.save(python);
        courseRepository.save(js);
        courseRepository.save(angular);

        Booking booking1 = new Booking("12/05/20", java, antonio);
        Booking booking2 = new Booking("02/02/19", python, antonio);
        Booking booking3 = new Booking("03/03/13", php, francesco);
        Booking booking4 = new Booking("04/04/14", js, francesco);
        Booking booking5 = new Booking("05/05/15", angular, mark);
        Booking booking6 = new Booking("06/06/16", js, john);
        Booking booking7 = new Booking("12/05/20", java, francesco);
        Booking booking8 = new Booking("12/05/20", js, mark);
        Booking booking9 = new Booking("09/09/19", php, antonio);
        Booking booking10 = new Booking("10/10/20", js, antonio);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);
        bookingRepository.save(booking5);
        bookingRepository.save(booking6);
        bookingRepository.save(booking7);
        bookingRepository.save(booking8);
        bookingRepository.save(booking9);
        bookingRepository.save(booking10);

    }
}
