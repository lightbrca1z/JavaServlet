package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAO {
	static DataSource ds;
	  public Connection getConnection() throws SQLException {
	        try {
	            if (ds == null) {
	                InitialContext ic = new InitialContext();
	                ds = (DataSource)ic.lookup("java:/comp/env/jdbc/test1");

	                System.out.println("Connected to database.");
	            }
	            return ds.getConnection();
	        } catch (NamingException e) {
	            throw new SQLException("Error initializing DataSource", e);
	        }
	  }
}
