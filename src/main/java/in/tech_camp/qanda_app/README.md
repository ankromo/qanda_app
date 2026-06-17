# テーブル設計

## users テーブル

| Column   | Type         | Options         |
| -------- | ------------ | --------------- |
| id       | SERIAL       | NOT NULL        |
| name     | VARCHAR(128) | NOT NULL        |
| email    | VARCHAR(128) | NOT NULL UNIQUE |
| password | VARCHAR(512) | NOT NULL        |

### Option
- PRIMARY KEY (id)

## questions テーブル

| Column     | Type         | Options  |
| ---------- | ------------ | -------- |
| id         | SERIAL       | NOT NULL |
| title      | VARCHAR(255) | NOT NULL |
| content    | TEXT         | NOT NULL |
| user_id    | INT          | NOT NULL |
| created_at | TIMESTAMP    | NOT NULL DEFAULT CURRENT_TIMESTAMP |

### Option
- PRIMARY KEY (id)
- FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE

## answers テーブル

| Column      | Type         | Options  |
| ----------  | ------------ | -------- |
| id          | SERIAL       | NOT NULL |
| content     | TEXT         | NOT NULL |
| user_id     | INT          | NOT NULL |
| question_id | INT          | NOT NULL |
| created_at  | TIMESTAMP    | NOT NULL DEFAULT CURRENT_TIMESTAMP |

### Option
- PRIMARY KEY (id)
- FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
- FOREIGN KEY (question_id) REFERENCES questions(id) ON DELETE CASCADE

## favorites テーブル

| Column    | Type   | Options  |
| --------- | ------ | -------- |
| id        | SERIAL | NOT NULL |
| user_id   | INT    | NOT NULL |
| answer_id | INT    | NOT NULL |

### Option
- PRIMARY KEY (id)
- FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
- FOREIGN KEY (answer_id) REFERENCES answers(id) ON DELETE CASCADE