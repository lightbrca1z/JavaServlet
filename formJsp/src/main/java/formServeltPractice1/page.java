package formServeltPractice1;

import java.io.PrintWriter;

public class page {
	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
	}
	
	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
}
