package select;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class select
 */
@WebServlet("/select")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select() {
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
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String count = request.getParameter("count");
		String payment = request.getParameter("payment");
		String review = request.getParameter("review");
		String mail = request.getParameter("mail");
		
		page.header(out);
		out.println("<p>"+count+"個の商品をカートに入れました。</p>");
		out.println("<p>お支払い方法を "+payment+"に設定しました。</p>");
		out.println("<p>ご感想ありがとうございます。</p>");
		out.println("<p>「"+review+"」</p>");
		if(mail != null) {
			out.println("<p>メールをお送りしました。</p>");
		}else {
			out.println("<p>メールはお送りしません。</p>");
		}
		page.footer(out);
	}

}
