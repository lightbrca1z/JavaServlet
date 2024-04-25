package servlet;


import java.sql.SQLException;

import org.h2.tools.Server;

public class dbstart {

	public static void main(String[] args) throws SQLException {
		// TODO 自動生成されたメソッド・スタブ
		Server server = Server.createTcpServer(args).start();
		System.out.println("H2Servet Start!");
	}

}
