package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class javaH2DBtestServlet
 */
@WebServlet("/javaH2DBtestServlet")
public class javaH2DBtestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javaH2DBtestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	
    	String jdbcURL = "jdbc:h2:~/test";
        String username = "sa";
        String password = "";
        
        PrintWriter out = response.getWriter();
        page.header(out);

        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/test");
            Connection con = ds.getConnection();
            System.out.println("Connected to H2 embedded database.");
            
            PreparedStatement st = con.prepareStatement("select * from product");
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
            	out.print(rs.getInt("id"));
            	out.print(":");
            	out.print(rs.getString("name"));
            	out.print(":");
            	out.print(rs.getString("price"));
            	out.print("<br>");
            }
            
            st.close();
            con.close();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
