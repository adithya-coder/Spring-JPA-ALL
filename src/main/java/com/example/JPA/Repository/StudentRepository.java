package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
