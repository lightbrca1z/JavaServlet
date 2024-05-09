package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import bean.Product;
import dao.ProductDAO;

/**
 * Servlet implementation class Tag
 */
@WebServlet("/JSTL")
public class JSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private DataSource dataSource; 
    
    @Override
    public void init() throws ServletException {
        try {
            // コンテキストからデータソースを取得
            InitialContext initContext = new InitialContext();
            Context envContext  = (Context)initContext.lookup("java:/comp/env");
            dataSource = (DataSource)envContext.lookup("jdbc/test");
        } catch (NamingException e) {
            throw new ServletException("Error initializing DataSource", e);
        }
    }
	
    public JSTL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	
		PrintWriter out = response.getWriter();
		try {
		ProductDAO dao = new ProductDAO(dataSource);
		List<Product> list = dao.search("");
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("./jsp/jstl.jsp")
		.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace(out);
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
