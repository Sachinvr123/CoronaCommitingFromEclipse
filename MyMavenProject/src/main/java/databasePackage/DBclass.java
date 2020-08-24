package databasePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	
		public class DBclass {
		    public Connection getConnection() throws SQLException {
		        return DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsDb","root","root");
		    }
	}

