package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample27
 */
@WebServlet("/Sample27")
public class Sample27 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample27() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fileData;
		response.setContentType("text/html;charset=Shift_JIS");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Sample027</title></head><body>");
		String filePath = getServletContext().getRealPath("/sampleData.txt");

		// デバッグメッセージを追加
		out.println("filePath: " + filePath + "<br>");

        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
			while((fileData=in.readLine()) != null){
				out.println(fileData + "<br>");
			}
		} catch (IOException e) {
			getServletContext().log("****File Read Error in Sample027****", e);
			out.println("エラーが起きました。<br>");
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
