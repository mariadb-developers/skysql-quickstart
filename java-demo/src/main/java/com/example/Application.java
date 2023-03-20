package com.example;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	public static void main(String... args) throws SQLException {
		System.out.println("Messages in the database:\n");
		try (var connection = DriverManager.getConnection(
				"jdbc:mariadb://xxxxxx.yyyyy.db.skysql.net:3306/demo?sslMode=1&serverSslCert=/Users/alejandro/Downloads/skysql_chain_2022.pem",
				"user", "password")) {

			var statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from messages");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("content"));
			}
		}
	}

}
