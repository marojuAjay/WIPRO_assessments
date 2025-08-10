package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	// custom method
	List<Teacher> findByExperienceGreaterThan(int exp);
	
	
	// native sql
	
	@Query(value = "SELECT * FROM teacher WHERE age > ?1", nativeQuery = true)
	List<Teacher>findTeachersOlderThan(int age);
	
	// native sql2
	
	@Query(value = "SELECT * FROM teacher WHERE qualification = ?1", nativeQuery= true)
	List<Teacher> findByQualigicationNative(String qualification);

}
