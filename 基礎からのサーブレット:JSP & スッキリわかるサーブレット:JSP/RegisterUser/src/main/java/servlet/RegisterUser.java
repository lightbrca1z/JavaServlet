package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String forwardPath = null;

        String action = request.getParameter("action");

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        if(action == null) {
            forwardPath = "./jsp/registerForm.jsp";
        }
        else if(action.equals("done")) {
            HttpSession session = request.getSession();
            User registerUser = (User)session.getAttribute("registerUser");

            RegisterUserLogic logic = new RegisterUserLogic();
            logic.execute(registerUser);

            session.removeAttribute("registerUser");

            forwardPath = "./jsp/registerDone.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || pass == null || pass.isEmpty()) {
            response.sendRedirect("./RegisterUser"); // フォーム画面にリダイレクト
            return; // リダイレクトした後は処理を終了
        }

        User registerUser = new User(id, name, pass);

        HttpSession session = request.getSession();
        session.setAttribute("registerUser", registerUser);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/registerConfirm.jsp");
        dispatcher.forward(request, response);
    }
}
