package com.school.service;

import java.util.List;

import com.school.entity.School;

public interface SchoolService {
    School saveSchool(School school);
    List<School> getAllSchools();
}
