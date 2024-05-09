package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
 * Servlet implementation class CartAdd
 */
@WebServlet("/CartAdd")
public class CartAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartAdd() {
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
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	
		
		PrintWriter out=response.getWriter();
		page.header(out);
		
		String name=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		
		HttpSession session=request.getSession();
		
		List<Product> cart=(List<Product>)session.getAttribute("cart");
		if(cart == null) {
			cart=new ArrayList<Product>();
		}
		
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		cart.add(p);
		
		session.setAttribute("cart", cart);
		
		out.println("カートに商品を追加しました。");
    	out.println("<a href=\"./CartGet\">カート表示画面へ</a>");
		page.footer(out);
	}

}
