package in.tech_camp.qanda_app.entity;


import java.sql.Timestamp;

import lombok.Data;

@Data
public class QuestionEntity {
  private Integer id;
  private String title;
  private String content;
  private Integer user_id;
  private Timestamp created_at;
}
