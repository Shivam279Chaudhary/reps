package com.project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.entity.Comment;
import com.project.interfaces.ICommentDAO;
import com.project.utils.DbConnect;

public class CommentDAO implements ICommentDAO {

	@Override
	public boolean insertComment(Comment comment) {
		String sql = "insert into comment values(?,?,?,?,?,?)";
		try {

			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, comment.getCommentID());
			ps.setString(2, comment.getText());
			ps.setString(3, comment.getModifiedAt());
			ps.setInt(4, comment.getAnswerID());
			ps.setInt(5, comment.getUserID());
			ps.setInt(6, comment.getReliability());

			return ps.executeUpdate() > 0; // DML statement
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Comment> getAllComment() {
		String sql = "select commentID,text,modifiedAt,answerID,userID,reliability from comment";

		List<Comment> list;
		list = new ArrayList<Comment>();
		try (PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql); ResultSet rs = ps.executeQuery(); // DQL
																														// statement
		) {
			while (rs.next()) {

				Comment comment = new Comment();
				comment.setCommentID(rs.getInt(1));
				comment.setText(rs.getString(2));
				comment.setModifiedAt(rs.getString(3));
				comment.setAnswerID(rs.getInt(4));
				comment.setUserID(rs.getInt(5));
				comment.setReliability(rs.getInt(6));
				list.add(comment);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Comment getComment(int commentID) {
		// TODO Auto-generated method stub
		return null;
	}

}
