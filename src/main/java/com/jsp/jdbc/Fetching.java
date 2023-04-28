package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Fetching {
	// to fetch particular record
	void fetch() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student where std_id=1");
		boolean flag = resultSet.next();
		if (flag) {
			System.out.println("std_id=" + resultSet.getInt(1) + "\n" + "Name=" + resultSet.getString(2) + "\n"
					+ "branch=" + resultSet.getString(3));
		} else {
			System.out.println("data not available");
		}
		connection.close();
	}

	// to fetch all records
	void fectchAll() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from student");
		while (resultSet.next()) {
			System.out.println("std_id=" + resultSet.getInt(1) + "\t" + "Name=" + resultSet.getString(2) + "\t"
					+ "branch=" + resultSet.getString(3));
			System.out.println("**********************(- _ -)******************************");
		}
		connection.close();
	}

	public static void main(String[] args) throws Exception {
		Fetching fetching = new Fetching();
		fetching.fetch();
		fetching.fectchAll();
	}
}
