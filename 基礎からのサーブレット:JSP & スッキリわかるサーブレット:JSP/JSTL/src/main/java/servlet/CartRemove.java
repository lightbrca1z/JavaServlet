package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.page;

/**
 * Servlet implementation class CartGet
 */
@WebServlet("/CartRemove")
public class CartRemove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartRemove() {
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

    	PrintWriter out = response.getWriter();
    	page.header(out);
    	
    	HttpSession session=request.getSession();
    	session.removeAttribute("cart");
    	
    	out.println("カートを削除しました！");
    	out.println("<a href=\"./CartAdd\"カートの追加画面へ</a>");
    	page.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
		
		doGet(request, response);
    	PrintWriter out = response.getWriter();
    	page.header(out);
    	
    	HttpSession session=request.getSession();
    	session.removeAttribute("cart");
    	
    	out.println("カートを削除しました！");
      	out.println("<a href=\"./CartAdd\"カートの追加画面へ</a>");
    	page.footer(out);
	}

}
