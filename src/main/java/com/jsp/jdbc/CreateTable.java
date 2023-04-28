package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//to create table in database
public class CreateTable {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root", "root");
	Statement statement=connection.createStatement();
	try{
	statement.execute("create table student(std_ID int primary key,Name varchar(50),branch varchar(20))");
	System.out.println("table created");
	connection.close();
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
