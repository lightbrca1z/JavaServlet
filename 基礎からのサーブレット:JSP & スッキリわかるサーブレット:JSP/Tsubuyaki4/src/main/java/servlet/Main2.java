package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetMutterListLogic;
import model.Mutter;
import model.PostMutterLogic2;
import model.User;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main2")
public class Main2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	GetMutterListLogic getMutterListLogic = new GetMutterListLogic();
    	List<Mutter> mutterList = getMutterListLogic.execute();
    	request.setAttribute("mutterList", mutterList);
        
        HttpSession session = request.getSession();
        User loginUser = (User)session.getAttribute("loginUser");

        if(loginUser == null) {
            response.sendRedirect("./index.jsp"); // リダイレクト先を修正
        }
        else {
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("./jsp/main.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");
        
        // 入力値チェック
        if(text != null && text.length() != 0) {
            HttpSession session = request.getSession();
            User loginUser = (User)session.getAttribute("loginUser");
            
            Mutter mutter = new Mutter(loginUser.getName(), text);
            PostMutterLogic2 postMutterLogic = new PostMutterLogic2();
            postMutterLogic.execute(mutter);
        }else {
            request.setAttribute("errorMsg", "つぶやきが入力されていません");
        }
        
        GetMutterListLogic getMutterListLogic = new GetMutterListLogic();
        List<Mutter> mutterList = getMutterListLogic.execute();
        request.setAttribute("mutterList", mutterList);
        
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("./jsp/main.jsp");
        dispatcher.forward(request, response);
    }

}
