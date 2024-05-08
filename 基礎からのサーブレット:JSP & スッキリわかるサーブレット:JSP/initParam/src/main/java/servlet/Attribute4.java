package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Attribute
 */
@WebServlet("/Attribute4")
public class Attribute4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException{
		try {
			ServletContext context=getServletContext();
			String path=context.getRealPath("WEB-INF/setting.txt");
			FileInputStream in = new FileInputStream(path);
			Properties p = new Properties();
			p.load(in);
			in.close();
			for(String name:p.stringPropertyNames()) {
				context.setAttribute(name, p.getProperty(name));
			}
		}catch(IOException e){
			throw new ServletException("ファイルの読み込みに失敗しました。");
		}
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Attribute4() {
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

		out.println("アプリケーション属性を設定しました。");
		
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
