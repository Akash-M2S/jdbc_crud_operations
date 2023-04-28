package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//to update branch
public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		Statement statement=connection.createStatement();
		int e=statement.executeUpdate("update  student set branch='computer science' where std_id=1");
		if(e==1){
		System.out.println("branch upadted");
		}
		else
		{
			System.out.println("enter correct id");
		}
		connection.close();
	}

}
