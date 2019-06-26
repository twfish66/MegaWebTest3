package com.database

import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Driver;
import com.kms.katalon.core.annotation.Keyword

public class sql {
	private static Connection connection = null;
	@Keyword
	def connectDB(String server, String port, String dbname, String username, String password){
		String url = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + dbname + ";user=" + username + ";password=" + password

		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = DriverManager.getConnection(url)
		return connection
	}


	@Keyword
	def executeQuery(String queryString) {
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		return rs
	}

	@Keyword
	def closeDatabaseConnection() {
		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = null
	}


	@Keyword

	def execute(String queryString) {

		Statement stm = connection.createStatement()

		boolean result = stm.execute(queryString)

		return result
	}
}
