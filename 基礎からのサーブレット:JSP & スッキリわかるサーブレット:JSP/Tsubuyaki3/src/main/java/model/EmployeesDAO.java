package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeesDAO {

    	String jdbcURL = "jdbc:h2:~/test";
		String username = "sa";
		String password = "";
	public List<Employee> findAll(){
		List<Employee> empList = new ArrayList<>();
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
				
				Employee employee = new Employee(id,name,age);
				empList.add(employee);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}
		return empList;
    }
}
