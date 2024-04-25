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
 * Servlet implementation class Transaction
 */
@WebServlet("/Transaction")
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
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
            
            con.setAutoCommit(false);
            
            PreparedStatement st = con.prepareStatement("insert into product (name,price) values(?,?)");
            st.setString(1, name);
            st.setInt(2, price);
            st.executeUpdate();
            
            st = con.prepareStatement("select * from product where name=?");
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            int line = 0;
            
            while(rs.next()) {
            	line++;
            }
            
            if (line == 1) {
            	con.commit();
            	out.println("追加に成功しました。");
            } else {
            	con.rollback();
            	out.println("商品はすでに登録されています。");
            }
            
            con.setAutoCommit(true);
            
            st.close();
            con.close();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
        page.footer(out);
	}

}
