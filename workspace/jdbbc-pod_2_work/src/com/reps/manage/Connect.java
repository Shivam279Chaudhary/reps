package com.reps.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	static Connection con;

	public static Connection createC() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String user = "root";
			String password = "avadh123";
			String url = "jdbc:mysql://localhost:3306/user_bio";

			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
