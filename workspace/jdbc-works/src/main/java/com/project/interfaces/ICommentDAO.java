package com.project.interfaces;

import java.util.List;

import com.project.entity.Comment;

public interface ICommentDAO {
	public boolean insertComment(Comment comment);

	public List<Comment> getAllComment();

	public Comment getComment(int commentID);

	boolean updateCommentByCommentID(Comment comment);

	boolean deleteCommentsByQuestionID(int QuestionID);

	List<Comment> getAllCommentsDESC(int QuestionID);

	boolean deleteComment(int CommentID);

	boolean deleteCommentsByAnswerID(int AnswerID);
}
