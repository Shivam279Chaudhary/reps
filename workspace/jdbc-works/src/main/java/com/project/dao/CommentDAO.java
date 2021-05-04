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
		String sql = "insert into comment (Description,ModifiedAt,AnswerID,UserID,Reliability) values(?,?,?,?,?)";
		try {

			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1, comment.getDescription());
			ps.setString(2, comment.getModifiedAt());
			ps.setInt(3, comment.getAnswerID());
			ps.setInt(4, comment.getUserID());
			ps.setInt(5, comment.getReliability());

			return ps.executeUpdate() > 0; // DML statement
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Comment> getAllComment(int AnswerID) {
		String sql = "select * from comment where AnswerID=? order by ModifiedAt DESC";

		List<Comment> list;
		list = new ArrayList<Comment>();
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, AnswerID);
			ResultSet rs = ps.executeQuery(); // DQL statement

			while (rs.next()) {

				Comment comment = new Comment();
				comment.setCommentID(rs.getInt(1));
				comment.setDescription(rs.getString(2));
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
	public boolean deleteComment(int CommentID) {
		// TODO Auto-generated method stub

		try {
			String sql = "DELETE from comment where CommentID= ? ";
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, CommentID);

			return ps.executeUpdate() > 0; // DML statement

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteCommentsByAnswerID(int AnswerID) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE from comment where AnswerID= ? ";
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, AnswerID);

			return ps.executeUpdate() > 0; // DML statement

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateCommentByCommentID(Comment comment) {
		// TODO Auto-generated method stub
		String sql = "UPDATE comment SET Description=?,ModifiedAt=?,AnswerID=?,UserID=?,Reliability=? WHERE CommentID=?";

		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setString(1, comment.getDescription());
			ps.setString(2, comment.getModifiedAt());
			ps.setInt(3, comment.getAnswerID());
			ps.setInt(4, comment.getUserID());
			ps.setInt(5, comment.getReliability());
			ps.setInt(6, comment.getCommentID());

			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
