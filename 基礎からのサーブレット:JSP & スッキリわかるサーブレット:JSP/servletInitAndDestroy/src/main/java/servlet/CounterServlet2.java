package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/CounterServlet")
public class CounterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Integer count;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		  super.init(config);
		  count = 0;
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy()が実行されました。");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    ServletContext application = this.getServletContext();
	    if (application != null) {
	        Integer count = (Integer)application.getAttribute("count");
	        count++;
	        application.setAttribute("count", count);
	        
	        response.setContentType("text/html; charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        page.header(out);
	        out.println("<p>訪問回数:" + count + "</p>");
	        out.println("<a href=\"CounterServlet\">更新</a>");
	        page.footer(out);
	    } else {
	        // エラーログを出力するなど、エラー処理を行う
	        System.err.println("ServletContextがnullです。");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
