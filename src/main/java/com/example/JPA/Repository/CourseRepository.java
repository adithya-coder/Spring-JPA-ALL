package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
