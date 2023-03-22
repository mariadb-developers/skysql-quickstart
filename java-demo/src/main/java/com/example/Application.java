package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = DriverManager.getConnection(
				"jdbc:mariadb://dbpwf11745551.sysp0000.db1.skysql.net/demo?sslMode=verify-ca&serverSslCert=/Users/alejandro/Downloads/skysql_chain_2022.pem",
				"dbpwf11745551", "VTXhBV-HS9ygo2rPR+yH7Nx")) {

			var statement = connection.prepareStatement("select * from messages");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("content"));
			}
		}
	}

}
