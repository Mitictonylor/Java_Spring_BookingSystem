package com.Github.Mitictonylor.BookingSystem.BookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "star_rating")
    private int starRating;

    @Column
    private String town;

    public Course(String name, int starRating, String town) {
        this.name = name;
        this.starRating = starRating;
        this.town = town;
    }

    public Course() {
    }
}
