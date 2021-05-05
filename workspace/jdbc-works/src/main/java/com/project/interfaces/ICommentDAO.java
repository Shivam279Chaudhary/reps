package com.project.interfaces;

import java.util.List;

import com.project.entity.Comment;

public interface ICommentDAO {
	public boolean insertComment(Comment comment);

	public List<Comment> getAllComment(int AnswerID);

	public boolean deleteComment(int CommentID);

	public boolean deleteCommentsByAnswerID(int AnswerID);

	public boolean updateCommentByCommentID(Comment comment);
}
