package org.mypersist.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.mypersist.exception.ConnectionCreationFailedException;
import org.mypersist.exception.DriveClassNotFoundException;
import org.mypersist.exception.QueryExcecutionFailedException;

public abstract class QueryExecutor {
	private String sqlQuery = null;
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	JDBCConfiguration configuration = null;

	public QueryExecutor(Connection connection) {
		this.connection = connection;
	}

	public List<Map<String, Object>> execute(String sql) {
		this.sqlQuery = sql;
		try {
			Class.forName(configuration.driverClassName);
		} catch (ClassNotFoundException e) {
			throw new DriveClassNotFoundException("Driver Class name has been wrong", e);
		} // Driver Class name Exception
		try {
			connection = DriverManager.getConnection(configuration.getDriverUrl(), configuration.getUserName(),
					configuration.getPassword());
		} catch (SQLException e) {
			throw new ConnectionCreationFailedException("DataBase URL/UserName/Password is wrong", e);
		} // Connection Creation Failed Exception
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);
		} catch (SQLException e) {
			throw new QueryExcecutionFailedException("SQL query not excecuted sucessfully", e);
		} //Query Excecution Exception
		try {
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			throw new QueryExcecutionFailedException("SQL query not excecuted sucessfully",e);
		} // resultset Excecution
		try {
			return handler(resultSet);
		} catch (Exception e) {
			throw new QueryExcecutionFailedException("Cann't extracted the resultSet properly", e);
		}
	}
	public abstract List<Map<String, Object>> handler(ResultSet resultSet)throws Exception;
}
