package com.example.mywebapp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectDatabase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:mysql://localhost:3306/spring?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "root";
		String pass = "thuan2002";

		try {
			System.out.println("Connecting to the database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful!");
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}
