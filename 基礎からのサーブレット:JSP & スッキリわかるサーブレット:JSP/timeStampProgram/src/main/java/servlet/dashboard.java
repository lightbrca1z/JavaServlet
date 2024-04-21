package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import record.AttendanceRecord;

/**
 * Servlet implementation class dashboard
 */
@WebServlet("/dashboard")
public class dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        	HttpSession session = request.getSession();
	        String username = (String) session.getAttribute("username");

	        // データベースから出勤履歴を取得
	        List<AttendanceRecord> attendanceRecords = new ArrayList<>();
	        Connection conn = null;
	        ResultSet rs = null;
	        PreparedStatement pstmt = null;
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/timeStampProgram", "root", "root");
	            String sql = "SELECT accountId, start_time, end_time FROM attendance";
	            pstmt = conn.prepareStatement(sql);
	            rs = pstmt.executeQuery();
	            while (rs.next()) {
	            	int accountId = rs.getInt("accountId");
	                String startTime = rs.getString("start_time");
	                String endTime = rs.getString("end_time");
	                AttendanceRecord attendanceRecord = new AttendanceRecord(accountId, startTime, endTime);
	                attendanceRecords.add(attendanceRecord);
	            }
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (rs != null)
	                    rs.close();
	                if (pstmt != null)
	                    pstmt.close();
	                if (conn != null)
	                    conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        // リクエスト属性に出勤履歴をセット
	        request.setAttribute("attendanceRecords", attendanceRecords);

	        // JSPにフォワード
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/dashboard.jsp");
	        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
