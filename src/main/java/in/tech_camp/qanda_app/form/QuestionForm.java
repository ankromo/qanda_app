package in.tech_camp.qanda_app.form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class QuestionForm {
  private String title;
  private String content;
  private Timestamp created_at;
}
