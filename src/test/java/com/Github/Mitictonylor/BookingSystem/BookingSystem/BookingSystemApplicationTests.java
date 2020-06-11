package com.Github.Mitictonylor.BookingSystem.BookingSystem;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Booking;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Course;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Customer;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.BookingRepository;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CourseRepository;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void findCoursesByRating() {
		List<Course> foundCourse = courseRepository.findByStarRating(4);
		assertEquals(3, foundCourse.size() );
	}

	@Test
	void findCustomerByCourseName() {
		List<Customer> foundCustomers = customerRepository.findByBookingsCourseName("java");
		assertEquals(2, foundCustomers.size());
	}

	@Test
	void findCourseByCustomerId() {
		List<Course> foundCourses = courseRepository.findByBookingsCustomerId(1L);
				assertEquals(4, foundCourses.size());
	}

	@Test
	void findBookingByDate() {
		List<Booking> foundBooking = bookingRepository.findByDate("12/05/20");
		assertEquals(3, foundBooking.size());
	}

	@Test
	void findByCustomerTownAndBookingsCourseName() {
		List<Customer> foundCustomer = customerRepository.findByTownAndBookingsCourseName("London", "javascript");
		assertEquals(2, foundCustomer.size());
	}
}
