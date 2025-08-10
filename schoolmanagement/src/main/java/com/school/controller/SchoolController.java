package com.school.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.school.entity.School;
import com.school.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

   
    @PostMapping("/schools")
    public School createSchool(@RequestBody School school) {
        return schoolService.saveSchool(school);
    }


    @GetMapping("/schools")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }
}
