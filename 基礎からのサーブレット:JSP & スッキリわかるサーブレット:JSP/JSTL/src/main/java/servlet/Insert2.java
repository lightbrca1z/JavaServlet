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
import bean.page;
import dao.ProductDAO;

/**
 * Servlet implementation class Insert2
 */
@WebServlet("/Insert2")
public class Insert2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
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

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert2() {
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
    	response.setContentType("text/html; charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		page.header(out);
		try {
			String name=request.getParameter("name");
			int price=Integer.parseInt(request.getParameter("price"));

			Product p = new Product();
			p.setName(name);
			p.setPrice(price);
			ProductDAO dao = new ProductDAO(dataSource);
			dao.insert(p);
			
			List<Product> list = dao.search("");
			for(Product q : list) {
				out.println(q.getId());
				out.println(" : ");
				out.println(q.getName());
				out.println(" : ");
				out.println(q.getPrice());
				out.println("<br>");
			}
		}catch(Exception e) {
			e.printStackTrace(out);
		}
	}
}

