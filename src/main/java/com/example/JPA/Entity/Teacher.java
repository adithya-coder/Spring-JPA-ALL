package com.example.JPA.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
public class Teacher {
	@Id
	@SequenceGenerator(name = "teacher_sequence",
	sequenceName = "teacher_sequence",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "teacher_sequence")
private Long  teacherId;
private String fristname;
private String lastname;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "teacher_Id",referencedColumnName = "teacherId")
private List<Course> cources;
/**
 * 
 */
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param teacherId
 * @param fristname
 * @param lastname
 * @param cources
 */
public Teacher(Long teacherId, String fristname, String lastname, List<Course> cources) {
	super();
	this.teacherId = teacherId;
	this.fristname = fristname;
	this.lastname = lastname;
	this.cources = cources;
}
public String getFristname() {
	return fristname;
}
public void setFristname(String fristname) {
	this.fristname = fristname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public List<Course> getCources() {
	return cources;
}
public void setCources(List<Course> cources) {
	this.cources = cources;
}
@Override
public String toString() {
	return "Teacher [teacherId=" + teacherId + ", fristname=" + fristname + ", lastname=" + lastname + ", cources="
			+ cources + "]";
}


}
