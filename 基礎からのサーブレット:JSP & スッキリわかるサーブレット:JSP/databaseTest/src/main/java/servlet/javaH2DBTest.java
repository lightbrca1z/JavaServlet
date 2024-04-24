package servlet;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class javaH2DBTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String jdbcURL = "jdbc:h2:~/test";
		String username = "sa";
		String password = "";
		

			DataSource ds;
			try {
				InitialContext ic = new InitialContext();
				ds = (DataSource)ic.lookup("java:/comp/env/jdbc/test");
				Connection con = ds.getConnection();
				System.out.println("Connected to H2 embedded database.");
			} catch (NamingException | SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
	}
}
