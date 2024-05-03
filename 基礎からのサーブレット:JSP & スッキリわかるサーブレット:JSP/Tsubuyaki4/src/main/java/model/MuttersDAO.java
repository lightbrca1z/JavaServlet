package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MuttersDAO {

    	String jdbcURL = "jdbc:h2:~/test";
		String username = "sa";
		String password = "";
		
		
        
	public List<Mutter> findAll(){
		
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		
		List<Mutter> mutterList = new ArrayList<>();
		try {
			Connection connection =DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 embedded database.");
			
			String sql = "Select ID,Name,Text from mutters order by id desc";
			PreparedStatement pStmt = connection.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("NAME");
				String text = rs.getString("TEXT");
				
				Mutter mutter = new Mutter(id,userName,text);
				mutterList.add(mutter);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}
		return mutterList;
    }
	
	public boolean create(Mutter mutter){
		try {
			Connection connection =DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connected to H2 embedded database.");
			
			String sql = "insert into mutters(name,text) values (?,?)";
			PreparedStatement pStmt = connection.prepareStatement(sql);
			
			pStmt.setString(1, mutter.getUserName());
			pStmt.setString(2, mutter.getText());
			
			int result = pStmt.executeUpdate();
			if(result != 1) {
				return false;
			}
			connection.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
		return true;
    }
}
