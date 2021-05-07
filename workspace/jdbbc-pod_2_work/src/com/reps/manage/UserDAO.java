package com.reps.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

	/// user table sql queries

	public static boolean insertUser(User user) {

		try {
			Connection con = Connect.createC();
			String q = "insert into User values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, user.getUserid());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getUserpass());
			ps.setString(4, user.getUseradd());
			ps.setInt(5, user.getUserrole());
			ps.setString(6, user.getUserbadge());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public static boolean deleteUser(int userid) {
		try {
			Connection con = Connect.createC();
			String q = "delete from User where userid=?";

			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, userid);

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public static boolean selectUser(int userid) {
		boolean f = false;
		try {
			Connection con = Connect.createC();
			String q = "select * from User where userid=?";

			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, userid);

			ResultSet rs = ps.executeQuery();

			 while (rs.next()) {
		           
		            
		        	String username = rs.getString("username") ;
		        	String userpass = rs.getString("userpass");
		        	String useradd = rs.getString("useradd");
		        	int userrole= rs.getInt("userrole");
		        	String userbadge = rs.getString("userbadge");
		            System.out.println(username+"   "+userpass+"    " + useradd+"   "+userrole+"    " +userbadge);
		            
		            
		         }
			 f= true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	/// user bio table sql queries

	public static boolean insertuserToDB(Userbio u)

	{
		boolean f = false;
		try {

			Connection con = Connect.createC();
			String q = "insert into user_bio (user_id,weight,height,gender,waist,workout_plan_in_days) values(?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, u.getUser_id());
			pstmt.setInt(2, u.getWeight());
			pstmt.setInt(3, u.getHeight());
			pstmt.setString(4, u.getGender());
			pstmt.setInt(5, u.getWaist());
			pstmt.setInt(6, u.getWorkout_plan_in_days());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteuser(int user_id) {
		boolean f = false;
		try {

			Connection con = Connect.createC();
			String q = "delete from user_bio where user_id=?";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, user_id);

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean getHtandWt(int user_id) {
		boolean f = false;
		try {

			Connection con = Connect.createC();
			String q = "select height,weight from user_bio where user_id=?";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, user_id);
			ResultSet rs = pstmt.executeQuery();

			 while (rs.next()) {
		            
		            int height = rs.getInt("height");
		            int weight = rs.getInt("weight");
		            System.out.println(height+"   "+weight+"    ");
		            
		            
		         }
			 f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	/// workout time table sql queries

	public static boolean insertuserToDB(Workout u)

	{
		boolean f = false;
		try {

			Connection con = Connect.createC();
			String q = "insert into workout_time_table (workoutId,userId,day,time,sets,reps_per_set,description) values(?,?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, u.getWorkoutId());
			pstmt.setString(2, u.getUserId());
			pstmt.setInt(3, u.getDay());
			pstmt.setString(4, u.getTime());
			pstmt.setInt(5, u.getSets());
			pstmt.setInt(6, u.getReps_per_set());
			pstmt.setString(7, u.getDescription());
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	/// planner table queries
	public static boolean insertuser(Planner u) {
		boolean f = false;
		try {
			Connection con = Connect.createC();
			String q = "insert into user_bio(user_id, timing, exercise, target, diet_goal, date) "
					+ "values(?,?,?,?,?,?);";

			PreparedStatement prep = con.prepareStatement(q);
			prep.setInt(1, u.getUser_id());
			prep.setString(2, u.getTimimg());
			prep.setString(3, u.getExercise());
			prep.setString(4, u.getTarget());
			prep.setString(5, u.getDiet_goal());
			prep.setString(6, u.getDate());

			prep.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
