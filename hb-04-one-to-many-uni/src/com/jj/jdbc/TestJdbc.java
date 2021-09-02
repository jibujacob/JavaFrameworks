package com.jj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String user = "springstudent";
		String pass = "springstudent";
		try {
			
			System.out.println("Attempting DataBase Connection");
			Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);
			System.out.println("Database Connection Succesfull:" + myConn.getSchema());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
