package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployees {

    public static void main(String[] args) {
		String jdbcURL = "jdbc:h2:~/test";
		String username = "sa";
		String password = "";
		
		try {
			Connection connection =DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 embedded database.");
			
			String sql = "Select ID,Name,Age from employees";
			PreparedStatement pStmt = connection.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				
				System.out.println("ID : " + id);
				System.out.println("名前 : " + name);
				System.out.println("年齢 : " + age + "\n");
			}
			connection.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    }
}
