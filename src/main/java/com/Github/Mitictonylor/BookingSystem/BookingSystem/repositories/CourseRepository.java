package com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByStarRating(int rating);

}
