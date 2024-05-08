package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Attribute
 */
@WebServlet("/Attribute3")
public class Attribute3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Attribute3() {
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

		String debug=(String)context.getAttribute("debug");
		
		if(debug.equals("yes")) {
			out.println("<p>デバッグモードを実行します。</p>");
		}
		
		int memory=Integer.parseInt((String)context.getAttribute("memory"));
		
		if(memory<1000000) {
			out.println("<p>省メモリモードを実行します。</p>");
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
