package Servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import DAO.LikeDAO;
import bean.Like;

/**
 * Servlet implementation class LikeServlet
 */
@WebServlet("/likePost")
public class LikeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private DataSource dataSource; 

    @Override
    public void init() throws ServletException {
        try {
            // コンテキストからデータソースを取得
            InitialContext initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/test");
        } catch (NamingException e) {
            throw new ServletException("Error initializing DataSource", e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int userId = (int) session.getAttribute("user_id");
        int postId = Integer.parseInt(request.getParameter("post_id"));

        LikeDAO likeDAO = new LikeDAO(dataSource);
        likeDAO.addLike(new Like(postId, userId));

        response.sendRedirect("posts");
    }
}

