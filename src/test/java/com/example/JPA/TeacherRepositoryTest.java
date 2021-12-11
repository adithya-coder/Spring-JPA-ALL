package com.example.JPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.JPA.Entity.Course;
import com.example.JPA.Entity.Teacher;
import com.example.JPA.Repository.TeacherRepository;

import lombok.Builder;
@SpringBootTest
@Builder
public class TeacherRepositoryTest {
   @Autowired
	  private TeacherRepository Repo;
   @Test
   public void saveTeacher() {
	   Course c=new Course();
	   c.setTitle("DBA");
	   c.setCreadit(10);
	   Course c2=new Course();
	   c2.setTitle("BA");
	   c2.setCreadit(1);
					 
	   Teacher teacher =new  Teacher();
	   teacher.setFristname("Adithya");
	   teacher.setLastname("Heshan");
	   teacher.setCources(List.of(c,c2));
	   
	   Repo.save(teacher);
			   
   }
}
