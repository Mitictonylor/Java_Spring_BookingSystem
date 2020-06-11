package com.Github.Mitictonylor.BookingSystem.BookingSystem.repositories;

import com.Github.Mitictonylor.BookingSystem.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
