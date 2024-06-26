package bean;

import java.sql.Timestamp;

public class Like {
    private int likeId;
    private int postId;
    private int userId;
    private Timestamp createdAt;

    // コンストラクタ
    public Like(int postId, int userId) {
        this.postId = postId;
        this.userId = userId;
    }

    // コンストラクタ（全フィールド）
    public Like(int likeId, int postId, int userId, Timestamp createdAt) {
        this.likeId = likeId;
        this.postId = postId;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    // ゲッターとセッター
    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
