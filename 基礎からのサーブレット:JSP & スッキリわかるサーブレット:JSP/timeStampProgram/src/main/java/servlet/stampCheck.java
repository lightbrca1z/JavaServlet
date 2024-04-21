package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class stampCheckIn
 */
@WebServlet("/stampCheck")
public class stampCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stampCheck() {
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
//		doGet(request, response);
	    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // アクションを取得
        String action = request.getParameter("action");

        // 出勤時刻を取得
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = sdf.format(new Date());

        // データベースに接続
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        PreparedStatement maxAccountIdStmt = null;
        PreparedStatement deleteStmt = null;
        
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        int accountId = (int) session.getAttribute("accountId");

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // データベースに接続
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/timeStampProgram", "root", "root");

            if (action.equals("start")) {
                // 出勤時刻をデータベースに登録
                String sql = "INSERT INTO attendance (accountId, start_time) VALUES (?,?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setLong(1, accountId);
                pstmt.setString(2, timestamp);
                pstmt.executeUpdate();
                out.println("<html><body>");
                out.println("<h2>出勤時刻を登録しました。</h2>");
                out.println("<a href=\"./dashboard\">戻る</a>");
                out.println("</body></html>");
            } else if (action.equals("end")) {
                // 退勤時刻をデータベースに登録
            	// 最大のaccountIdを取得するSQL文
            	String maxAccountIdSql = "SELECT MAX(accountId) FROM attendance";
            	maxAccountIdStmt = conn.prepareStatement(maxAccountIdSql);
            	ResultSet maxAccountIdRs = maxAccountIdStmt.executeQuery();
            	int maxAccountId = 0; // デフォルト値
            	if (maxAccountIdRs.next()) {
            	    maxAccountId = maxAccountIdRs.getInt(1); // 結果セットの最初の列を取得
            	}

            	// UPDATE文を構築
            	String sql = "UPDATE attendance SET end_time = ? WHERE accountId = ?";
            	pstmt2 = conn.prepareStatement(sql);
            	pstmt2.setString(1, timestamp);
            	pstmt2.setInt(2, maxAccountId); // 最大のaccountIdを設定
            	pstmt2.executeUpdate();
                out.println("<html><body>");
                out.println("<h2>退勤時刻を登録しました。</h2>");
                out.println("<a href=\"./dashboard\">戻る</a>");
                out.println("</body></html>");
            }else if(action.equals("deleteAll")) {
            	String deleteSql = "delete from attendance";
            	deleteStmt = conn.prepareStatement(deleteSql);
            	deleteStmt.execute(deleteSql);
        	    out.println("<html><body>");
                out.println("<h2>全件削除を登録しました。</h2>");
                out.println("<a href=\"./dashboard\">戻る</a>");
                out.println("</body></html>");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            out.println("<html><body>");
            out.println("<h2>データベースエラーが発生しました。</h2>");
            out.println("</body></html>");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if(pstmt2 != null) {
                pstmt2.close();
                }
                if(maxAccountIdStmt != null) {
                maxAccountIdStmt.close();
                }
                if(deleteStmt != null) {
                	deleteStmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
