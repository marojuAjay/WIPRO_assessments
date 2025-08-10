package com.school.service;

import java.util.List;

import com.school.entity.Teacher;

public interface TeacherService {
	
	Teacher updatePartialTeacher(Long id, Teacher teacher);
	
	List<Teacher> getExperiencedTeachers(int exp);
	
	List<Teacher> getTeachersOlderThan(int age);
	
	List<Teacher> getByQualification(String qualification);

	

	Teacher saveTeacher(Teacher teacher);

}
