package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;
import bean.page;

/**
 * Servlet implementation class CartGet
 */
@WebServlet("/CartGet")
public class CartGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
	 	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	
    	PrintWriter out=response.getWriter();
    	page.header(out);
    	
    	HttpSession session=request.getSession();
    	
    	List<Product> cart =(List<Product>)session.getAttribute("cart");
    	if(cart!=null) {
    		for(Product p : cart) {
    			out.println("<p>");
    			out.println(p.getName());
    			out.println(" : ");
    			out.println(p.getPrice());
    			out.println("</p>");
    		}
    	}
    	out.println("<a href=\"./CartRemove\">カート削除へ</a>");
    	page.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
		
    	PrintWriter out=response.getWriter();
    	page.header(out);
    	
    	HttpSession session=request.getSession();
    	
    	List<Product> cart =(List<Product>)session.getAttribute("cart");
    	if(cart!=null) {
    		for(Product p : cart) {
    			out.println("<p>");
    			out.println(p.getName());
    			out.println(" : ");
    			out.println(p.getPrice());
    			out.println("</p>");
    		}
    	}
    	out.println("<a href=\"./CartRemove\">カート削除へ</a>");
    	page.footer(out);
	}

}
