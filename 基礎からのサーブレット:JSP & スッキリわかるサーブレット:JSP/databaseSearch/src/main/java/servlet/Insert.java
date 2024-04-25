package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
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
            
            String name=request.getParameter("name");
            int price = Integer.parseInt(request.getParameter("price"));
            
            PreparedStatement st = con.prepareStatement("insert into product(name,price) values(?,?)");
            st.setString(1, name);
            st.setInt(2, price);
            int line = st.executeUpdate();
            
            if (line > 0) {
            	out.println("追加に成功しました。");
            }
            
            st.close();
            con.close();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
        page.footer(out);
	}
}
