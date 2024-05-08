package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Attribute
 */
@WebServlet("/Attribute2")
public class Attribute2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Attribute2() {
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
		
		PrintWriter out=response.getWriter();
		page.header(out);
		
		ServletContext context = getServletContext();

		List<String> list=Collections.list(context.getAttributeNames());
		for(String name : list) {
			out.println("<p>"+name+" : ");
			out.println(context.getAttribute(name));
			out.println("</p>");
		}

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
