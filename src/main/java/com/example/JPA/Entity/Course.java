package com.example.JPA.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	@Id
	@SequenceGenerator(name="course_sequence",
	sequenceName = "course_sequence",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_sequence")
	private Long courseId;
	private String title;
	private Integer creadit;
	@OneToOne(mappedBy = "course")
	
	private  CourseMatireal courseMatireal;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id",
	referencedColumnName = "teacherId")
	private Teacher teacher;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Studen_Couse",
	joinColumns = @JoinColumn(
			name="course_id",
			referencedColumnName = "courseId"),
	inverseJoinColumns = @JoinColumn(name="student_id",referencedColumnName = "studentId"))
	private List<Student> student;
	
	public void addStudent(Student student) {
		if(student==null) {
			List<Student> students =new ArrayList<>();
			students.add(student);
		
		}
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public CourseMatireal getCourseMatireal() {
		return courseMatireal;
	}
	public void setCourseMatireal(CourseMatireal courseMatireal) {
		this.courseMatireal = courseMatireal;
	}
	public Long getCourseId() {
		return courseId;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", creadit=" + creadit + ", courseMatireal="
				+ courseMatireal + ", teacher=" + teacher + ", student=" + student + "]";
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCreadit() {
		return creadit;
	}
	public void setCreadit(Integer creadit) {
		this.creadit = creadit;
	}

}
