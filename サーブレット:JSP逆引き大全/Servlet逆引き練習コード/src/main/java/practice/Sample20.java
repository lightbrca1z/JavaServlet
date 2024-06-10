package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample20
 */
@WebServlet("/Sample20")
public class Sample20 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext context;
    private String startTime;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample20() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException{
    	context = config.getServletContext();
    	super.init(config);
    	startTime = (new Date()).toString();
    	context.log(startTime.toString()+"Sample20が起動しました。");
    }
    
    public void destory() {
    	context.log("Sample20が停止しました!");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Sample20</title></head></body>");
		out.println("このサーブレットが最初に起動した時刻は、" + startTime.toString() + "です。");
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
