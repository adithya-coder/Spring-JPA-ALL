package com.example.JPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.JPA.Entity.Course;
import com.example.JPA.Entity.CourseMatireal;
import com.example.JPA.Entity.Teacher;
import com.example.JPA.Repository.CourseMatirealRepository;
import com.example.JPA.Repository.CourseRepository;



@SpringBootTest
public class CourseRepositoryTest {
	
    @Autowired
	private CourseMatirealRepository Repo;
    @Test
    public  void  saveCouseMaterial() {
    	Course course =  new Course();
    	course.setTitle("JAVA");
    	course.setCreadit(10);
    	
    			
    	CourseMatireal c = new CourseMatireal();
    	c.setUrl("ww.google.com");
    	c.setCourse(course);
    	
    	Repo.save(c);
    	
    	
    			
    			
    			
    			
    			
    			
    }
    
    @Test
    public void courseMaterial() {
    	List<CourseMatireal> courseMatireal=Repo.findAll();
    	System.out.println("CourseMatireal: "+courseMatireal);
    	
    }
    
  
}
