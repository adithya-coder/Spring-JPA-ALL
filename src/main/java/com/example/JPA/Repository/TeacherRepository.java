package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
