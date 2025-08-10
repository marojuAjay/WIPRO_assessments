package com.quiz.ajaym.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.ajaym.Entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {


}
