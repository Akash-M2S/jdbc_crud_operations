package com.jsp.jdbc;

import java.sql.*;

//to create database;
public class CreateDB{

	public static void main(String[] args) throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			Statement statement = connection.createStatement();
			try {
			statement.execute("create database studentdb");
			System.out.println("database created");
			connection.close();
		}
			catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
