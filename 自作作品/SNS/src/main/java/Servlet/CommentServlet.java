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

import DAO.CommentDAO;
import bean.Comment;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/addComment")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private DataSource dataSource; 
    
    @Override
    public void init() throws ServletException {
        try {
            // コンテキストからデータソースを取得
            InitialContext initContext = new InitialContext();
            Context envContext  = (Context)initContext.lookup("java:/comp/env");
            dataSource = (DataSource)envContext.lookup("jdbc/test");
        } catch (NamingException e) {
            throw new ServletException("Error initializing DataSource", e);
        }
    }
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentServlet() {
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
		HttpSession session = request.getSession(false);
	    if (session == null || session.getAttribute("user_id") == null) {
	        response.sendRedirect("login");
	        return;
	    }
	    int userId = (int) session.getAttribute("user_id");

	    String postIdStr = request.getParameter("post_id");
	    if (postIdStr == null || postIdStr.trim().isEmpty()) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Post ID is required");
	        return;
	    }
	    
	    int postId;
	    try {
	        postId = Integer.parseInt(postIdStr);
	    } catch (NumberFormatException e) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Post ID");
	        return;
	    }

	    String content = request.getParameter("content");
	    if (content == null || content.trim().isEmpty()) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Content cannot be empty");
	        return;
	    }

	    // デバッグメッセージ
	    System.out.println("UserId: " + userId);
	    System.out.println("PostId: " + postId);
	    System.out.println("Content: " + content);

	    CommentDAO commentDAO = new CommentDAO(dataSource);
	    commentDAO.addComment(new Comment(postId, userId, content));

	    response.sendRedirect("posts");
	}

}
