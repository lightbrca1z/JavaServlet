package originalCode;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample020 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private String startTime;

	public void init(ServletConfig config) throws ServletException{
		context=config.getServletContext();
		super.init(config);
		startTime = (new Date()).toString();
		context.log(startTime.toString()+" Sample020が起動しました");
	}

	public void destroy(){
		context.log("Sample020停止しました");
	}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Sample020</title></head><body>");
		out.println("このサーブレットが最初に起動した時刻は" + startTime.toString() + "です。");
		out.println("</body></html>");
		out.close();
    }

}
