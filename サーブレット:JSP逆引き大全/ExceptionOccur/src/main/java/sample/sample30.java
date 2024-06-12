package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sample30
 */
@WebServlet("/sample30")
public class sample30 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sample30() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = "<script>";
		final String LT = "<";
		final String GT = ">";
		boolean lt = false;
		boolean gt = false;
		
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Sample030</title></head><body>");
		try {
			if (str.indexOf(LT) > -1) lt = true;
			if (str.indexOf(GT) > -1) gt = true;
		    if (lt && gt) {
		        throw new Exception("許可されていない\"<\"と\">\"が含まれています!");
		    }
		    if (lt) {
		        throw new Exception("許可されていない\"<\"が含まれています!");
		    }
		    if (gt) {
		        throw new Exception("許可されていない\">\"が含まれています!");
		    }
		} catch (Exception e) {
			out.println("エラー : " + e.getMessage());
		}
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
