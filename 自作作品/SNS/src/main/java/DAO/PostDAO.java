package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import bean.Comment;
import bean.Post1;

public class PostDAO {
    private DataSource dataSource;

    public PostDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addPost(Post1 post) {
        String sql = "INSERT INTO posts (user_id, content, created_at) VALUES (?, ?, NOW())";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, post.getUserId());
            stmt.setString(2, post.getContent());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Post1> getAllPosts() {
        List<Post1> posts = new ArrayList<>();
        String sql = "SELECT * FROM posts ORDER BY created_at DESC";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int postId = rs.getInt("post_id");
                List<Comment> comments = getCommentsForPost(postId);
                Post1 post = new Post1(
                    postId,
                    rs.getString("content"),
                    rs.getInt("user_id"),
                    rs.getTimestamp("created_at"),
                    comments
                );
                posts.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }

    private List<Comment> getCommentsForPost(int postId) {
        List<Comment> comments = new ArrayList<>();
        String sql = "SELECT * FROM comments WHERE post_id = ? ORDER BY created_at ASC";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, postId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Comment comment = new Comment(
                        rs.getInt("comment_id"),
                        rs.getString("content"),
                        rs.getInt("user_id"),
                        rs.getTimestamp("created_at")
                    );
                    comments.add(comment);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
}
