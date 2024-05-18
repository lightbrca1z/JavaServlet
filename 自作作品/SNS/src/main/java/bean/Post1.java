package bean;

import java.sql.Timestamp;
import java.util.List;

public class Post1 {
    private int id;
    private String content;
    private int userId;
    private Timestamp createdAt;
    private List<Comment> comments;

    // コンストラクタ
    public Post1(int userId, String content) {
        this.userId = userId;
        this.content = content;
    }

    // 完全なコンストラクタ
    public Post1(int id, String content, int userId, Timestamp createdAt, List<Comment> comments) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.createdAt = createdAt;
        this.comments = comments;
    }

    // ゲッターメソッド
    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getUserId() {
        return userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // セッターメソッド
    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
