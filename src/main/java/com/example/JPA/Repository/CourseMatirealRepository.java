package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Entity.CourseMatireal;
@Repository
public interface CourseMatirealRepository extends JpaRepository<CourseMatireal, Long> {

}
