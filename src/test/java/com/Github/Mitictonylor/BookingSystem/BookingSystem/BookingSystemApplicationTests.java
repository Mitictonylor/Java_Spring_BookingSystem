package com.Github.Mitictonylor.BookingSystem.BookingSystem;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Course;
import com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void findCoursesByRating() {
		List<Course> foundCourse = courseRepository.findByStarRating(4);
		assertEquals(3, foundCourse.size() );
	}
}
