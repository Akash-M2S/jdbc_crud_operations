package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	// to delete particular record
	void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from student where std_id=1");
		System.out.println("data deleted");
		connection.close();
	}

	// to delete all records
	void deleteAll() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from student");
		/*
		 * query to drop table "drop database database_Name". query to drop
		 * table "drop table table_name".
		 */

		System.out.println("data deleted");
		connection.close();

	}

	public static void main(String[] args) throws Exception {
		Delete delete = new Delete();
		// delete.delete();
		delete.deleteAll();
	}

}
