package com.techno.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpMain {
	public static void main(String[] args) {

		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery("select * from emp");
			while (executeQuery.next()) {
				String string = executeQuery.getString(1);
				String string2 = executeQuery.getString(2);
				String string3 = executeQuery.getString(3);
				System.out.println(string+" || "+string2+" || "+string3);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
