package com.school.service;

import com.school.entity.Teacher;
import com.school.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public Teacher updatePartialTeacher(Long id, Teacher updatedTeacher) {
        Optional<Teacher> optional = teacherRepository.findById(id);
        if (optional.isPresent()) {
            Teacher teacher = optional.get();

            if (updatedTeacher.getTeacherName() != null)
                teacher.setTeacherName(updatedTeacher.getTeacherName());

            if (updatedTeacher.getTeacherAddress() != null)
                teacher.setTeacherAddress(updatedTeacher.getTeacherAddress());

            if (updatedTeacher.getQualification() != null)
                teacher.setQualification(updatedTeacher.getQualification());

            if (updatedTeacher.getAge() != 0)
                teacher.setAge(updatedTeacher.getAge());

            if (updatedTeacher.getDob() != null)
                teacher.setDob(updatedTeacher.getDob());

            if (updatedTeacher.getExperience() != 0)
                teacher.setExperience(updatedTeacher.getExperience());

            return teacherRepository.save(teacher);
        }
        return null;
    }
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }


    @Override
    public List<Teacher> getExperiencedTeachers(int exp) {
        return teacherRepository.findByExperienceGreaterThan(exp);
    }

    @Override
    public List<Teacher> getTeachersOlderThan(int age) {
        return teacherRepository.findTeachersOlderThan(age);
    }

    @Override
    public List<Teacher> getByQualification(String qualification) {
        return teacherRepository.findByQualigicationNative(qualification);
    }
	
}
