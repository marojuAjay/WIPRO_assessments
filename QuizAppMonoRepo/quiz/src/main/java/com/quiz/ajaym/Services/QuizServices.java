package com.quiz.ajaym.Services;

import java.util.List;

import com.quiz.ajaym.Entities.QuestionWrapper;
import com.quiz.ajaym.Entities.Quiz;
import com.quiz.ajaym.Entities.Response;

public interface QuizServices {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Integer id);

	String calculateResult(Integer id, List<Response> responses);

	


	

}
