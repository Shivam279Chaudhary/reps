package com.project.client;

import com.project.dao.CommentDAO;
import com.project.dao.QuestionDAO;
import com.project.entity.Comment;
import com.project.entity.Question;
import com.project.interfaces.ICommentDAO;
import com.project.interfaces.IQuestionDAO;

public class App {
	public static void main(String[] args) {

		Question question = new Question();
		question.setQuestionID(15);
		question.setTitle("How can i be fit forever?");
		question.setDescription("dont simply sit work out to burn calories");
		question.setVote(3);
		question.setCategoryID(1);
		question.setUserID(1);
		question.setImageLink("https://something.png");
		question.setReliability(10);
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		question.setModifiedAt(currentTime);

		IQuestionDAO dao = new QuestionDAO();

		System.out.println(dao.insertQuestion(question) ? "Inserted" : "Not Inserted");

		for (Question q : dao.getAllQuestion()) {
			System.out.println(q);
		}

		Comment comment = new Comment();
		// comment.setCommentID(12);
		comment.setText("answer is brief");
		comment.setAnswerID(1);
		comment.setUserID(1);
		comment.setReliability(10);
		java.util.Date dt1 = new java.util.Date();
		java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime1 = sdf1.format(dt1);
		comment.setModifiedAt(currentTime1);

		ICommentDAO dao1 = new CommentDAO();

		System.out.println(dao1.insertComment(comment) ? "Inserted" : "Not Inserted");

		for (Comment q : dao1.getAllComment()) {
			System.out.println(q);
		}

	}
}
