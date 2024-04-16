package formServeltPractice1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import formServlet.page;

/**
 * Servlet implementation class formServeltPractice1
 */
@WebServlet("/formServletPractice1")
public class formServletPractice1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formServletPractice1() {
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
		String qtype = request.getParameter("qtype");
		String textbody = request.getParameter("textbody");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		page.header(out);
		out.println("<p>"+ name + "," + qtype + "," + textbody + "," + "</p>");
		page.footer(out);
	}

}
