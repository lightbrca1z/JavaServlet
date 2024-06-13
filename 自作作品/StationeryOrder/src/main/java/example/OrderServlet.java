package example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
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
    	    String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        int pencil = Integer.parseInt(request.getParameter("pencil"));
	        int ruler = Integer.parseInt(request.getParameter("ruler"));
	        int eraser = Integer.parseInt(request.getParameter("eraser"));

	        int totalAmount = pencil * 300 + ruler * 400 + eraser * 500;

	        response.setContentType("text/html;charset=UTF-8");
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<h1>注文確認</h1>");
	        response.getWriter().println("<p>名前: " + name + "</p>");
	        response.getWriter().println("<p>メールアドレス: " + email + "</p>");
	        response.getWriter().println("<p>鉛筆: " + pencil + "個</p>");
	        response.getWriter().println("<p>定規: " + ruler + "個</p>");
	        response.getWriter().println("<p>消しゴム: " + eraser + "個</p>");
	        response.getWriter().println("<p>合計金額: " + totalAmount + "円</p>");
	        response.getWriter().println("<form action=\"" + request.getContextPath() + "/complete\" method=\"post\">");
	        response.getWriter().println("<input type=\"submit\" value=\"注文確定\">");
	        response.getWriter().println("</form>");
	        response.getWriter().println("</body></html>");
	    }

	}
