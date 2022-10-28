package com.techno.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareMain {
	public static void main(String[] args) {
    try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra","root","root");
		PreparedStatement prepareStatement = connection.prepareStatement("insert into car values(?,?)");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter car name");
		String name1 = scanner.next();
		System.out.println("enter car price");
		String price1=scanner.next();
		prepareStatement.setString(1,name1);
		prepareStatement.setString(2,price1);
		int executeQuery = prepareStatement.executeUpdate();
		System.out.println(executeQuery +"query affecteed");
		
		ResultSet executeQuery2 = prepareStatement.executeQuery();
		while (executeQuery2.next()) {
//			executeQuery.getString(1);
//			executeQuery.getString(2);
			System.out.println(executeQuery2);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
