package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long>{
	
	

}
