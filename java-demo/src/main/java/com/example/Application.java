package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {
	
	public static void main(String[] args) throws SQLException {
		try (Connection connection = DriverManager.getConnection(
			"jdbc:mariadb://dbpgf24938486.sysp0000.db.skysql.net:3306/demo?sslMode=1&serverSslCert=/Users/alejandro/Downloads/skysql_chain_2022.pem", "dbpgf24938486", "1%E5pTCkW7.SFCZD27P4x7")) {
			PreparedStatement statement = connection.prepareStatement("select * from messages");
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("content"));
			}
		}
	}

}
