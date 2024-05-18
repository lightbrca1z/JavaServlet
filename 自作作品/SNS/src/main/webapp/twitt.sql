CREATE TABLE Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Posts (
    post_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE Likes (
    like_id INT AUTO_INCREMENT PRIMARY KEY,
    post_id INT NOT NULL,
    user_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (post_id) REFERENCES Posts(post_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE Comments (
    comment_id INT AUTO_INCREMENT PRIMARY KEY,
    post_id INT NOT NULL,
    user_id INT NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (post_id) REFERENCES Posts(post_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

INSERT INTO Users (username, password, email) VALUES ('user1', 'password1', 'user1@example.com');
INSERT INTO Users (username, password, email) VALUES ('user2', 'password2', 'user2@example.com');

INSERT INTO Posts (user_id, content) VALUES (1, 'This is the first post!');
INSERT INTO Posts (user_id, content) VALUES (2, 'This is the second post!');

INSERT INTO Likes (post_id, user_id) VALUES (1, 2);
INSERT INTO Likes (post_id, user_id) VALUES (2, 1);

INSERT INTO Comments (post_id, user_id, content) VALUES (1, 2, 'This is a comment on the first post!');
INSERT INTO Comments (post_id, user_id, content) VALUES (2, 1, 'This is a comment on the second post!');
