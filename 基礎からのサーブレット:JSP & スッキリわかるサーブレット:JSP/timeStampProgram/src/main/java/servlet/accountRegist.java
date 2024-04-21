package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class accountRegist
 */
@WebServlet("/accountRegist")
public class accountRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accountRegist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // ここで、ユーザー情報をデータベースに保存する
        // 登録完了メッセージをリクエストにセット
		
		 String username = request.getParameter("username");
	     String password = request.getParameter("password");

	     Connection connection = null;

	        // データベースに接続するための情報
	        try {
	   	     Class.forName("com.mysql.cj.jdbc.Driver");
	            // データベースに接続
	            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/timeStampProgram", "root", "root");

	            // SQL文を作成して実行
	            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setString(1, username);
	            statement.setString(2, password);
	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                // 登録成功
	                request.setAttribute("message", "アカウントが正常に登録されました。ログインしてください。");
	                // ログインページにリダイレクト
	                RequestDispatcher dispatcher = request.getRequestDispatcher("./jsp/login.jsp");
	                dispatcher.forward(request, response); // 登録後、ログインページにリダイレクト
	            } else {
	                // 登録失敗
	                response.getWriter().println("アカウント登録に失敗しました。");
	            }

	            // リソースを解放
	            statement.close();
	            conn.close();
	        } catch (SQLException e) {
	            // データベースエラーの処理
	            e.printStackTrace();
	            response.getWriter().println("データベースエラーが発生しました。");
	        } catch (ClassNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
	}

}
