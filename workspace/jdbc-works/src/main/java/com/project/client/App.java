package com.project.client;

import com.project.dao.CategoryDAO;
import com.project.dao.CommentDAO;
import com.project.dao.QuestionDAO;
import com.project.entity.Category;
import com.project.entity.Comment;
import com.project.entity.Question;
import com.project.exception.InvalidID;
import com.project.interfaces.ICategoryDAO;
import com.project.interfaces.ICommentDAO;
import com.project.interfaces.IQuestionDAO;
import com.project.interfaces.ISampleUserDAO;

public class App {
	public static void main(String[] args) {

//		Question question = new Question();
//		question.setQuestionID(20);
//		question.setTitle("How can i be fit forever?");
//		question.setDescription("dont simply sit work out to burn calories");
//		question.setVote(3);
//		question.setCategoryID(1);
//		question.setUserID(1);
//		question.setImageLink("https://something.png");
//		question.setReliability(10);
//		java.util.Date dt = new java.util.Date();
//		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String currentTime = sdf.format(dt);
//		question.setModifiedAt(currentTime);
//
//		IQuestionDAO dao = new QuestionDAO();
//
//		System.out.println(dao.insertQuestion(question) ? "Inserted" : "Not Inserted");
//
//		for (Question q : dao.getAllQuestion()) {
//			System.out.println(q);
//		}
//
//		/*
//		 * Answer answer = new Answer(); answer.setAnswerID(10);
//		 * answer.setDescription("  updated new Answer"); answer.setVotes(10);
//		 * answer.setModifiedAt(currentTime); answer.setQuestionID(2);
//		 * answer.setUserID(3); answer.setReliability(10);
//		 * 
//		 * IAnswerDAO answerDAO = new AnswerDAO();
//		 * 
//		 * // System.out.println(answerDAO.insertAnswer(answer)
//		 * ?"Inserted":"Not Inserted");
//		 * 
//		 * answerDAO.updateAnswerByAnswerID(answer);
//		 * 
//		 * // for(Answer ans : answerDAO.getAllAnswersASC(2)) { //
//		 * System.out.println(ans); // }
//		 */
//		Comment comment = new Comment();
//		comment.setDescription("answer is brief");
//		comment.setAnswerID(1);
//		comment.setUserID(1);
//		comment.setReliability(10);
//		comment.setModifiedAt(currentTime);
//
//		ICommentDAO dao1 = new CommentDAO();
//
//		System.out.println(dao1.insertComment(comment) ? "Inserted" : "Not Inserted");
//
//		for (Comment q : dao1.getAllComment(1)) {
//			System.out.println(q);
//		}

		Category cat = new Category();

		ICategoryDAO dao2 = new CategoryDAO();
		cat.setCategoryName("diet");
//		System.out.println(dao2.insertCategory(cat) ? "Category Inserted " : "Not Inserted");
//		System.out.println(dao2.removeCategory(20) ? "Category Removed " : "Not Removed");
//		int res = dao2.getCategoryIDByCategoryName("diet");
//		System.out.println( res == -1 ? "Category Not Found":"Found at :" + res);
		
		for (Category c : dao2.getAllCategory()) {
			System.out.println(c);
		}

//		System.out.println(dao2.getCategoryById(13));
//		Category res = dao2.getCategoryById(13);
//		if(res!=null)
//			System.out.println(res);

	}
}
