package Request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request2
 */
@WebServlet("/Request2")
public class Request2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		page.header(out);
		
		out.println("<p>Method<br>"+request.getMethod()+"</p>");
		out.println("<p>RequestURI<br>"+request.getRequestURI()+"</p>");
		out.println("<p>Context Path<br>"+request.getContextPath()+"</p>");
		out.println("<p>Servlet Path<br>"+request.getServletPath()+"</p>");
		out.println("<p>Query String<br>"+request.getQueryString()+"</p>");
		out.println("<p>Protocol<br>"+request.getProtocol()+"</p>");
		
		out.println("<p>Request URL<br>"+request.getRequestURL()+"</p>");
		out.println("<p>Scheme<br>"+request.getScheme()+"</p>");
		out.println("<p>Servet Name<br>"+request.getServerName()+"</p>");
		out.println("<p>Server Port<br>"+request.getServerPort()+"</p>");
		
		page.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
