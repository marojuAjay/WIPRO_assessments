package com.school.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Teacher;
import com.school.repository.TeacherRepository;
import com.school.service.TeacherService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/teachers")
@RequiredArgsConstructor
public class TeacherController {
	
	private final TeacherRepository teacherRepository;
	private final TeacherService teacherService;
	@PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

	
	 @GetMapping("/{id}")
	    public Teacher getTeacherById(@PathVariable Long id) {
	        return teacherRepository.findById(id).orElse(null);
	    }
	 
	 @GetMapping
	 public List<Teacher> getAllTeachers(){
		 return teacherRepository.findAll();
	 }
	 
	 @DeleteMapping("/{id}")
	 public String deleteTeacher(@PathVariable Long id) {
		 teacherRepository.deleteById(id);
		 return "Teacher deleted with id: " + id;
		 
	 }
	 
	 @PatchMapping("/{id}")
	    public Teacher patchTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
	        return teacherService.updatePartialTeacher(id, teacher);
	    }
	 
	 	@GetMapping("/experience/{exp}")
	    public List<Teacher> getExperienced(@PathVariable int exp) {
	        return teacherService.getExperiencedTeachers(exp);
	    }

	    @GetMapping("/older-than/{age}")
	    public List<Teacher> getOlderThan(@PathVariable int age) {
	        return teacherService.getTeachersOlderThan(age);
	    }

	    @GetMapping("/qualification/{qualification}")
	    public List<Teacher> getByQualification(@PathVariable String qualification) {
	        return teacherService.getByQualification(qualification);
	    }
	 
	
	
}
