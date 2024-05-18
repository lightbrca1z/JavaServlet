<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="bean.Post1" %>
<%@ page import="bean.Comment" %>
<%@ page import="javax.servlet.http.HttpSession" %>

<%
    // セッション変数は自動的に提供されるため、再度定義する必要はありません。
    if (session == null || session.getAttribute("user_id") == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<html>
<head>
    <title>Timeline</title>
</head>
<body>
    <h1>Timeline</h1>
    <form action="${pageContext.request.contextPath}/posts" method="post">
        <textarea name="content" placeholder="What's on your mind?" required></textarea>
        <button type="submit">Post</button>
    </form>
    <hr/>
    <%
        List<Post1> posts = (List<Post1>) request.getAttribute("posts");
        if (posts == null || posts.isEmpty()) {
    %>
        <p>No posts available.</p>
    <%
        } else {
            for (Post1 post : posts) {
    %>
        <div>
            <p><%= post.getContent() %></p>
            <p>Posted by user <%= post.getUserId() %> at <%= post.getCreatedAt() %></p>
			
          <form action="${pageContext.request.contextPath}/addComment" method="post">
                <input type="hidden" name="post_id" value="<%= post.getId() %>"/>
                <textarea name="content" placeholder="Write a comment..." required></textarea>
                <button type="submit">Comment</button>
            </form>

            <%
                List<Comment> comments = post.getComments();
                if (comments != null) {
                    for (Comment comment : comments) {
            %>
                <div>
                    <p><%= comment.getContent() %></p>
                    <p>Commented by user <%= comment.getUserId() %> at <%= comment.getCreatedAt() %></p>
                </div>
            <%
                    }
                }
            %>
        </div>
        <hr/>
    <%
            }
        }
    %>
</body>
</html>
