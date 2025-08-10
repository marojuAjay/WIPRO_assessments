package com.school;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="student_id")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String address;
	
	@ManyToOne()
	@JoinColumn(name="college_id")
	private College college;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
