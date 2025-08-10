package com.school;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;


@Entity
@Table(name="college_id")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
	
	private List<Student> student;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	

	