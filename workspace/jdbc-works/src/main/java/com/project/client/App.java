package com.project.client;

import com.project.dao.CategoryDAO;
import com.project.dao.QuestionDOO;
import com.project.dao.SampleUserDAO;
import com.project.entity.Category;
import com.project.entity.Question;
import com.project.entity.SampleUser;
import com.project.interfaces.ICategoryDAO;
import com.project.interfaces.IQuestionDAO;
import com.project.interfaces.ISampleUserDAO;

public class App {
	public static void main(String[] args) {
		
		// category
		Category c = new Category();
//		c.setCategoryName("Gym");
//		
		ICategoryDAO dao = new CategoryDAO(); 
		
//		System.out.println(dao.insertCategory(c) ? "Category Inserted" : "Not Inserted");

		for(Category cat : dao.getAllCategory()) {
			System.out.println(cat);
		}
		
//		System.out.println(dao.getCategoryById(10));
		
//		System.out.println(dao.removeCategory(11) ? "Category Removed" : "Not Removed");
		
		c.setCategoryName("Home Workout");
		c.setCategoryID(10);
		
		System.out.println(dao.updateCategory(c) ? "Category Updated" : "Not Updated");
		
		
		
		
		// sample user
//		SampleUser user = new SampleUser();
//
//		user.setUserName("rohit");
//		user.setReputation(101);
//		
//		ISampleUserDAO dao = new SampleUserDAO();
//		
//		System.out.println(dao.insertUser(user) ? "User inserted" : "No insertion");
//		
//		for(SampleUser u : dao.getAllUsers()) {
//			System.out.println(u);
//		}
		
//		System.out.println(dao.getSampleUserByID(11));
		
//		System.out.println(dao.removeUser(12) ? "User Removed" : "Not Removed");
		
		
		// original question
//		Question question = new Question(); 
//		question.setQuestionID(12);
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
//		IQuestionDAO dao = new QuestionDOO(); 
//		
//		System.out.println(dao.insertQuestion(question) ?"Inserted":"Not Inserted");
//		
//		for(Question q : dao.getAllQuestion()) {
//			System.out.println(q);
//		}
		
		
	}
}
