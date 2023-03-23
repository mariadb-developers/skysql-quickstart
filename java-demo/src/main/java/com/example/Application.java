package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = DriverManager.getConnection(
				"jdbc:mariadb://DOMAIN_NAME/demo?sslMode=verify-ca&serverSslCert=CERT_PEM",
				"USER", "PASSWORD")) {

			var statement = connection.prepareStatement("select * from messages");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("content"));
			}
		}
	}

}
