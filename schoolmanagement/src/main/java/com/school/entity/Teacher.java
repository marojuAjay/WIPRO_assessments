package com.school.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teacherName;
    private String teacherAddress;
    private String qualification;
    private int age;

    @Temporal(TemporalType.DATE)
    private Date dob;

    private int experience;
}
