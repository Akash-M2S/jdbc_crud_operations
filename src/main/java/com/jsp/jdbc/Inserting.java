package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserting {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		Statement statement=connection.createStatement();
		try{
		int e=statement.executeUpdate("insert into student(std_ID,Name,branch) values(1,'abc','bachelor of science')");
		if(e==1)
		{
			System.out.println("value inserted");
		}
		connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
