package javaH2DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class javaH2DBTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String jdbcURL = "jdbc:h2:~/test";
		String username = "sa";
		String password = "";
		
		try {
			Connection connection =DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 embedded database.");
			
			String sql = "Insert into students (name) values ('tateatsu2');";
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);
			
			if(rows > 0) {
				System.out.println("A row inserted.");
			}
			
			sql = "Select * from students";
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			int count = 0;
			
			while(resultSet.next()) {
				count++;
				
				int ID = resultSet.getInt("ID");
				String name = resultSet.getString("name");
				System.out.println("Student # " + count + ": " + ID + ", " + name);
			}
			
			connection.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
	}

}
