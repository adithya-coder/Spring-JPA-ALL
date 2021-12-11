package com.example.JPA;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.JPA.Entity.Course;
import com.example.JPA.Entity.Student;
import com.example.JPA.Entity.Teacher;
import com.example.JPA.Repository.CoursesRepository;
import static java.lang.System.out;

@SpringBootTest
public class CoursesRepositoryTest {

    @Autowired
	private CoursesRepository Repo;
    
    
   /* @Test
    public void printcources() {
    	List<Course> courses=Repo.findAll();
      out.println("Cources= "+courses);
    	
    }
    @Test
    public void saveCoursewithteacher() {
   	 Teacher teacher =new  Teacher();
 	   teacher.setFristname("Heshan");
 	   teacher.setLastname("Heshan");
 	  
 	   
   	Course course =  new Course();
   	course.setTitle("C#");
   	course.setCreadit(10);
   	course.setTeacher(teacher);
   	
   	Repo.save(course);
   	
   }
    @Test
    public void findAllPagination() {
    	PageRequest fristpage =
         
    	PageRequest.of(0, 3);
    	
    	List<Course> course =Repo.findAll(fristpage).getContent();
    	out.println("Course="+course);

    	Long totPages= (long) Repo.findAll(fristpage).getTotalPages();
    
    	
    	Long totEle= Repo.findAll(fristpage).getTotalElements();
    	out.println("Total pages ="+totPages);
    	out.println("Total Elements="+totEle);
    }
    
    @Test
    public void shortTitle() {
    	PageRequest title= PageRequest.of(0, 2, 
    			Sort.by("title")
    			);
    	PageRequest creadit= PageRequest.of(0, 2, 
    			Sort.by("creadit").descending()
    			.and(Sort.by("title"))
    			);
    	List<Course> course= Repo.findAll(title).getContent();
    	out.println("Course="+course+"\n");
    }*/
    
     @Test
     public void  saveCoursewithStudentandTeacher() {
    	 Teacher teacher =new  Teacher();
   	   teacher.setFristname("Kamal");
   	   teacher.setLastname("Kamal");
   	   
   	   Student stu =new Student();
   	   stu.setFristName("Adithya");
   	   stu.setLastName("Heshan");
   	   
    	 Course course = new  Course();
    	 course.setTitle("OOP");
    	 course.setCreadit(50);
    	 course.setTeacher(teacher);
    	 course.addStudent(stu);
    	 
    	 Repo.save(course);
     }

}
