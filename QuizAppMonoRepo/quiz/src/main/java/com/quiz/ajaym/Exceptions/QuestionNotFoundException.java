package com.quiz.ajaym.Exceptions;


public class QuestionNotFoundException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;

	public QuestionNotFoundException(Long id) {
        super("Question not found with id: " + id);
    }
}
