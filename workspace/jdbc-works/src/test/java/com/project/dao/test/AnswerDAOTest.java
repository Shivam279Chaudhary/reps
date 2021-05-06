package com.project.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.project.dao.AnswerDAO;
import com.project.entity.Answer;

class AnswerDAOTest {

	AnswerDAO answerDao;
	@BeforeEach
	void initialize() {
		this.answerDao=new AnswerDAO();}
	
	@Test
	void should_returnFalse_when_wrongAnswerInserted() {
		//given
		Answer answer= new Answer(14,"hhswb",4,"333",16,1,10);
		
		
		//when
		
		boolean result= answerDao.insertAnswer(answer);
		
		
		//then
		
		assertFalse(result);
		
		
		
	}
}
