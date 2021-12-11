package com.example.JPA.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class Student {
	@Id
	@SequenceGenerator(name="Student_sequence",
	sequenceName = "Student_sequence",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Student_sequence")
	 private Long studentId;
	 private String fristName;
	 private String LastName;
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fristName=" + fristName + ", LastName=" + LastName + "]";
	}

	 

}
